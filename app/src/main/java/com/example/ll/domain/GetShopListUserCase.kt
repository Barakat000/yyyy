package com.example.ll.domain

class GetShopListUserCase(private val shopListRepository: ShopListRepository) {

    fun getShopList() : List<ShopItem> {
        return  shopListRepository.getShopList()
    }
}