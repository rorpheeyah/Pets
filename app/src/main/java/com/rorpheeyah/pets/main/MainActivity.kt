package com.rorpheeyah.pets.main

import android.os.Bundle
import com.rorpheeyah.androidkotlinbaseproject.base.BaseActivity
import com.rorpheeyah.pets.R
import com.rorpheeyah.pets.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override var frameContainerId: Int = 0
    override val viewModel: MainViewModel = MainViewModel()
    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set to bind viewmodel with xml
        binding.viewModel = viewModel
    }
}