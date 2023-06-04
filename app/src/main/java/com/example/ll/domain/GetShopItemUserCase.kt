package com.example.ll.domain

import android.service.autofill.ImageTransformation

class GetShopItemUserCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopitemid:Int):ShopItem {
       return shopListRepository.getShopItem(shopitemid)
    }
}