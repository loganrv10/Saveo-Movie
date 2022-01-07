package com.subham.saveo.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.subham.saveo.Model.Repo
import com.subham.saveo.R
import com.subham.saveo.ViewModel.TheViewModel
import com.subham.saveo.ViewModel.ViewModelFactory


class MainActivity : AppCompatActivity() {
  lateinit var theViewModel: TheViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repo = Repo()
        theViewModel = ViewModelProvider(this,ViewModelFactory(repo)).get(TheViewModel::class.java)
        theViewModel.getMovie().observe(this, Observer {
            Log.d("hello",it.results.toString())
        })


    }
}