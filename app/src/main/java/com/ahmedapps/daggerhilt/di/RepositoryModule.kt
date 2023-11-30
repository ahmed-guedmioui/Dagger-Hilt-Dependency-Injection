package com.ahmedapps.daggerhilt.di

import com.ahmedapps.daggerhilt.data.RepositoryImpl
import com.ahmedapps.daggerhilt.data.RepositoryImpl2
import com.ahmedapps.daggerhilt.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    @Named("api1")
    abstract fun bindRepository1(
        repositoryImpl: RepositoryImpl
    ): Repository


    @Binds
    @Singleton
    @Named("api2")
    abstract fun bindRepository2(
        repositoryImpl2: RepositoryImpl2
    ): Repository

}





















