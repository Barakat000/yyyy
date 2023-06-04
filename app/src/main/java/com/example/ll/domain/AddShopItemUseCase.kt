package com.example.ll.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(sgopItem: ShopItem) {
        shopListRepository.addShopItem(sgopItem)
    }
}