package com.example.shoppinglistapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(item : ShopItem)
    fun deleteShopItem(item: ShopItem)
    fun getShopItem( id : Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
    fun editShopItem(item : ShopItem)
}