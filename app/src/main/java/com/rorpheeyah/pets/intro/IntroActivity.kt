package com.rorpheeyah.pets.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rorpheeyah.pets.R
import com.rorpheeyah.pets.main.MainActivity
import kotlinx.coroutines.*
import java.util.*
import kotlin.concurrent.schedule

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Timer().schedule(2700){
            val intent = Intent(this@IntroActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP and Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}