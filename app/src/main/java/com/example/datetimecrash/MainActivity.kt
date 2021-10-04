package com.example.datetimecrash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        java.time.ZoneId.of("America/Costa_Rica").rules.isFixedOffset
    }
}