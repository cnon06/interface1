package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

interface isimsiz {fun bisey_yap() }




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var isimsiz_class = object : isimsiz
        {
            override fun bisey_yap() {
                println("Bişey yapıyorum")
            }
        }


        isimsiz_class.bisey_yap()

    }
}