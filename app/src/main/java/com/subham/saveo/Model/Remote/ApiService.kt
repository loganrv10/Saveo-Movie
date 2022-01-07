package com.subham.saveo.Model.Remote

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {



    @GET("3/discover/movie")
    suspend fun getMovieData(
        @Query("api_key") api_key: String,
        @Query("page") page: Int
    ): ResponseDTO




}

/*
https://api.themoviedb.org/
3/discover/
movie?api_key=328c283cd27bd1877d9080ccb1604c91&sort_by=popularity.desc
 */