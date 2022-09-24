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
            var wishes : MutableList<Wish> = ArrayList()
            for(i in items.indices) {
                val wish = Wish(items[i], prices[i], urls[i])
                wishes.add(wish)
            }
            return wishes
        }

    }
}