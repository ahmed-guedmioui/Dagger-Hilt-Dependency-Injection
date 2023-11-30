package com.ahmedapps.daggerhilt.di

import android.app.Application
import com.ahmedapps.daggerhilt.data.RepositoryImpl
import com.ahmedapps.daggerhilt.data.RepositoryImpl2
import com.ahmedapps.daggerhilt.data.SomeApi
import com.ahmedapps.daggerhilt.data.SomeApi2
import com.ahmedapps.daggerhilt.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): SomeApi {
        return Retrofit.Builder()
            .baseUrl("https://someapi.com")
            .build()
            .create(SomeApi::class.java)
    }

    @Provides
    @Singleton
    fun provideApi2(): SomeApi2 {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(SomeApi2::class.java)
    }

}











