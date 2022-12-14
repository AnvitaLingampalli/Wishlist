package com.codepath.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.wishlist.Wishlist.setAllVar

class MainActivity : AppCompatActivity() {
    lateinit var wishes : List<Wish>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemEtv = findViewById<EditText>(R.id.itemEtv)
        val priceEtv = findViewById<EditText>(R.id.urlEtv)
        val urlEtv = findViewById<EditText>(R.id.priceEtv)
        val button = findViewById<Button>(R.id.button)

        var itemsList = arrayListOf<String>()
        var priceList = arrayListOf<String>()
        var urlList = arrayListOf<String>()

        button.setOnClickListener {
            var item = itemEtv.text.toString()
            itemsList.add(item)

            var price = priceEtv.text.toString()
            priceList.add(price)

            var url = urlEtv.text.toString()
            urlList.add(url)


            setAllVar(itemsList, priceList, urlList)

            val wishesRv = findViewById<RecyclerView>(R.id.wishesRv)
            wishes = WishFetcher.getWishes()
            val adapter = WishAdapter(wishes)
            wishesRv.adapter = adapter
            wishesRv.layoutManager = LinearLayoutManager(this)
        }
    }
}