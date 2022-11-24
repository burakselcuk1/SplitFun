package com.example.kotlinsplit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities ="Tokyo - London - New York - California - Malatya"

        val a:List<String> = cities.split("-")

        println(a[4])
    }
}