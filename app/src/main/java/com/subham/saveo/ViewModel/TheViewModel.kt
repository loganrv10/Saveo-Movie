package com.subham.saveo.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.subham.saveo.Model.Remote.ResponseDTO
import com.subham.saveo.Model.Repo

class TheViewModel() : ViewModel() {
     val repo = Repo()
    fun getMovie(): MutableLiveData<ResponseDTO> {
        repo.getDataFromApi()
        return repo.liveDataList
    }


}