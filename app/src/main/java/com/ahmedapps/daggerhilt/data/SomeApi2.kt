package com.ahmedapps.daggerhilt.data

import retrofit2.http.GET

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
interface SomeApi2 {

    @GET("some-route")
    suspend fun callApi2()
}