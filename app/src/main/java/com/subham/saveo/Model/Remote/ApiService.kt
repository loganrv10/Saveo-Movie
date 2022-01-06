package com.subham.saveo.Model.Remote

import retrofit2.http.GET

interface ApiService {

    @GET("3/discover/movie?api_key=328c283cd27bd1877d9080ccb1604c91&sort_by=popularity.desc")
    suspend fun getData(): ResponseDTO

}

/*
https://api.themoviedb.org/
3/discover/
movie?api_key=328c283cd27bd1877d9080ccb1604c91&sort_by=popularity.desc
 */