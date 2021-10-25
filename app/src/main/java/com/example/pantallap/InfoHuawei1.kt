package com.example.pantallap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics

class InfoHuawei1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_huawei1)

        val medidaventana = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(medidaventana)

        val ancho = medidaventana.widthPixels
        val alto = medidaventana.heightPixels

        window.setLayout((ancho * 0.90).toInt(), (alto * 0.75).toInt())

    }
}