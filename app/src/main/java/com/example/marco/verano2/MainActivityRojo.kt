package com.example.marco.verano2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_amarillo.*
import kotlinx.android.synthetic.main.activity_main_rojo.*

class MainActivityRojo : AppCompatActivity() {
    companion object RojoCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rojo)
        val intent  = intent

        if(intent!=null && intent.hasExtra(MainActivityRojo.EXTRA_IMC)){
            val imc:Double = intent.getDoubleExtra(MainActivityRojo.EXTRA_IMC, MainActivityRojo.DEFAULT_IMC)
            tvcolorr.setText("Tu indice de mas corporal es: "+imc.toString())
        }
    }
}
