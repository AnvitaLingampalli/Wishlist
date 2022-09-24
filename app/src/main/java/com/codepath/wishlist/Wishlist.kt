package com.codepath.wishlist

object Wishlist{
    var listOfitems = arrayListOf<String>()
    var listOfPrices = arrayListOf<String>()
    var listOfUrls = arrayListOf<String>()

    fun setAllVar(itemList:ArrayList<String>, priceList:ArrayList<String>, urlList:ArrayList<String>){
        listOfitems = itemList
        listOfPrices = priceList
        listOfUrls = urlList
    }
    fun getItem() : ArrayList<String>{
        return listOfitems
    }
    fun getPrice() : ArrayList<String>{
        return listOfPrices
    }
    fun getUrl() : ArrayList<String>{
        return listOfUrls
    }
}
