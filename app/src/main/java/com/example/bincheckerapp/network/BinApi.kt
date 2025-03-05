package com.example.bincheckerapp.network

import com.example.bincheckerapp.model.DateOfBin
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BinApi {

    @GET("{binnumber}")

    suspend fun getDateOfBin(
        @Path("binnumber") binnumber: Int
    ): Response<DateOfBin>

}