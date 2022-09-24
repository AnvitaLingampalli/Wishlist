package com.codepath.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.codepath.wishlist.Wishlist.setAllVar

class MainActivity : AppCompatActivity() {
    lateinit var wishes : List<Wish>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemEtv = findViewById<EditText>(R.id.itemEtv)
        val priceEtv = findViewById<EditText>(R.id.priceEtv)
        val urlEtv = findViewById<EditText>(R.id.urlEtv)
        val button = findViewById<Button>(R.id.button)

        var itemsList = ArrayList<String>()
        var priceList = ArrayList<String>()
        var urlList = ArrayList<String>()

        button.setOnClickListener {
            var item = itemEtv.text
            itemsList.add(itemEtv.toString())

            var price = priceEtv.text
            priceList.add(priceEtv.toString())

            var url = urlEtv.text
            urlList.add(urlEtv.toString())

            setAllVar(itemsList, priceList, urlList)

        }
    }
}