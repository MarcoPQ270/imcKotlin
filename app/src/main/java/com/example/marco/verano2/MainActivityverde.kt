package com.example.marco.verano2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activityverde.*

class MainActivityverde : AppCompatActivity() {

    companion object VerdeCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityverde)

        val intent  = intent

        if(intent!=null && intent.hasExtra(EXTRA_IMC)){
            val imc:Double = intent.getDoubleExtra(EXTRA_IMC, DEFAULT_IMC)
            tvecolor.setText("Tu indice de mas corporal es: "+imc.toString())
        }
    }
}
