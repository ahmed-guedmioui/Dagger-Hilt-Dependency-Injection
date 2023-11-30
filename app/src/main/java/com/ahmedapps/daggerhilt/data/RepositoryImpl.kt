package com.ahmedapps.daggerhilt.data

import com.ahmedapps.daggerhilt.domain.repository.Repository
import javax.inject.Inject

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
class RepositoryImpl @Inject constructor(
    private val api: SomeApi
): Repository {
    override suspend fun makeAPICall() {
        println("make api call")
        api.callApi()
    }
}