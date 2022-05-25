package com.android.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

}