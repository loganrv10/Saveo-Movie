package com.subham.saveo.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.subham.saveo.Model.Remote.ResponseDTO
import com.subham.saveo.Model.Repo

class TheViewModel(var repo: Repo) : ViewModel() {

fun getMovie() =repo.getDataFromApi()

}