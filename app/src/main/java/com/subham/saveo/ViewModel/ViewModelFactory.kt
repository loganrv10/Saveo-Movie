package com.subham.saveo.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.subham.saveo.Model.Repo

class ViewModelFactory(private val repo: Repo) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TheViewModel(repo)as T
    }

}