package com.rorpheeyah.pets.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_COMPACT
import com.rorpheeyah.pets.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvToolbar = findViewById<TextView>(R.id.toolbar)
        tvToolbar.apply {
            text = HtmlCompat.fromHtml("<b>Hey Spikey,</b><br>Adopt a new friend near you!", FROM_HTML_MODE_COMPACT)
        }
    }
}