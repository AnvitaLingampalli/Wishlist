package com.codepath.wishlist

import android.util.Log
import android.widget.EditText
import com.codepath.wishlist.Wishlist.getItem
import com.codepath.wishlist.Wishlist.getPrice
import com.codepath.wishlist.Wishlist.getUrl

class WishFetcher{
    companion object{

        var items = getItem()
        var prices = getPrice()
        var urls = getUrl()

        fun getWishes() : MutableList<Wish>{
            Log.d("testing", "in getWishes")
            var wishes : MutableList<Wish> = ArrayList()
            for(i in items.indices) {
                Log.d("testing", "in the FOR LOOP")
                val wish = Wish(items[i], prices[i], urls[i])
                wishes.add(wish)
            }
            Log.d("testing", "outoffor")
            return wishes
        }

    }
}