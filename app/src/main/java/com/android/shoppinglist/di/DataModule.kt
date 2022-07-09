package com.android.shoppinglist.di

import android.app.Application
import com.android.shoppinglist.data.AppDatabase
import com.android.shoppinglist.data.ShopListDao
import com.android.shoppinglist.data.ShopListRepositoryImpl
import com.android.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}