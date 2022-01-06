package com.subham.saveo.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.subham.saveo.Model.Remote.Network
import com.subham.saveo.Model.Remote.ResponseDTO

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.launch

class Repo {
     var liveDataList = MutableLiveData<ResponseDTO>()
    fun getDataFromApi() {
        CoroutineScope(Dispatchers.IO).launch {
            liveDataList.postValue(Network.apiService.getData())
        }

    }



}
