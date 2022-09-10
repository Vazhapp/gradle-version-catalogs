package com.example.gradleversioncatalogs

import retrofit2.http.GET

/**
 * Created by Vazhapp on 10.09.2022
 */
interface RetrofitDep {

    @GET
    fun getSourCream()
}