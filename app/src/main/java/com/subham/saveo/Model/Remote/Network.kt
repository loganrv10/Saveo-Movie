package com.subham.saveo.Model.Remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {

  companion object{

   private const val BASE_URL = "https://api.themoviedb.org/"
   private fun getRetrofitInstance(): Retrofit {
    return Retrofit.Builder()
     .baseUrl(BASE_URL)
     .addConverterFactory(GsonConverterFactory.create())
     .client(OkHttpClient.Builder().build())
     .build()
   }

      val apiService: ApiService = getRetrofitInstance().create(ApiService::class.java)
  }

}



/*
https://api.themoviedb.org/
3/discover/
movie?api_key=328c283cd27bd1877d9080ccb1604c91&sort_by=popularity.desc
 */