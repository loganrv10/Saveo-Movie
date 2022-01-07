package com.subham.saveo.Model

import androidx.lifecycle.MutableLiveData
import com.subham.saveo.Model.Remote.Network
import com.subham.saveo.Model.Remote.ResponseDTO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Repo {
     var liveDataList = MutableLiveData<ResponseDTO>()
    fun getDataFromApi(): MutableLiveData<ResponseDTO> {
        CoroutineScope(Dispatchers.IO).launch {
            liveDataList.postValue(Network.apiService.getMovieData("328c283cd27bd1877d9080ccb1604c91",1))
        }

        return liveDataList

    }



}


