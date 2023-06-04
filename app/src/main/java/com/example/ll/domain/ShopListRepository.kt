package com.example.ll.domain

interface ShopListRepository {
    fun addShopItem(sgopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopitemid:Int):ShopItem

    fun getShopList() : List<ShopItem>
}