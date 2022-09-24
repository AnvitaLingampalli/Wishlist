package com.codepath.wishlist

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishAdapter(private val wishes : List<Wish>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast acces
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // TODO: Create member variables for any view that will be set
        // as you render a row.
        val itemTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            itemTextView = itemView.findViewById(R.id.itemTv)
            priceTextView = itemView.findViewById(R.id.priceTv)
            urlTextView = itemView.findViewById(R.id.urlTv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.wish_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wish = wishes.get(position)
        holder.itemTextView.text = wish.name
        holder.priceTextView.text = wish.price
        holder.urlTextView.text = wish.url
    }

    override fun getItemCount(): Int {
        return wishes.size
    }

}