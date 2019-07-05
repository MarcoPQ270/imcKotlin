package com.example.marco.verano2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var pes: Int = 0
     var alt: Double = 0.0
     var imc: Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Calcula(v: View){
        if (edtpeso.text.isEmpty()){
            Toast.makeText(this,"El peso no esta especificado", Toast.LENGTH_SHORT).show()
            edtpeso.requestFocus()

        }else if (edtestatura.text.isEmpty()){
          Toast.makeText(this,"La estatura no esta especificada", Toast.LENGTH_SHORT).show()
            edtestatura.requestFocus()
        }
        else
        {
            pes = edtpeso.text.toString().toInt()
            alt = edtestatura.text.toString().toDouble()
            imc= pes/(alt*alt)
            if(imc<25){

                    val intent = Intent(this, MainActivityverde::class.java)
                    intent.putExtra(MainActivityverde.EXTRA_IMC,imc)
                    startActivity(intent)

                Toast.makeText(this,"Tu imc es: $imc es adecuado",Toast.LENGTH_SHORT).show()
            }else if(imc>=25&&imc<30){

                val intent = Intent(this, MainActivityAmarillo::class.java)
                intent.putExtra(MainActivityAmarillo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es de sobrepeso",Toast.LENGTH_SHORT).show()

            }else if(imc>=30&&imc<=40){
                val intent = Intent(this, MainActivityRojo::class.java)
                intent.putExtra(MainActivityRojo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es obecidad",Toast.LENGTH_SHORT).show()
            }



        }
    }
    fun Calcular(v:View){
        if (edtpeso.text.isEmpty()){
            Toast.makeText(this,"El peso no esta especificado", Toast.LENGTH_SHORT).show()
            edtpeso.requestFocus()

        }else if (edtestatura.text.isEmpty()){
            Toast.makeText(this,"La estatura no esta especificada", Toast.LENGTH_SHORT).show()
            edtestatura.requestFocus()
        }
        else
        {
            pes = edtpeso.text.toString().toInt()
            alt = edtestatura.text.toString().toDouble()
            imc= pes/(alt*alt)

            when
            {
                imc<25 ->
                {
                    val intent = Intent(this, MainActivityverde::class.java)
                    intent.putExtra(MainActivityverde.EXTRA_IMC,imc)
                    startActivity(intent)
                }
                imc>=25&&imc<30 ->
                {
                    val intent = Intent(this, MainActivityAmarillo::class.java)
                    intent.putExtra(MainActivityAmarillo.EXTRA_IMC,imc)
                    startActivity(intent)
                    Toast.makeText(this,"Tu imc es: $imc es de sobrepeso",Toast.LENGTH_SHORT).show()
                }
                imc>=30&& imc<=40 ->
                {
                    val intent = Intent(this, MainActivityRojo::class.java)
                    intent.putExtra(MainActivityRojo.EXTRA_IMC,imc)
                    startActivity(intent)
                    Toast.makeText(this,"Tu imc es: $imc es obecidad",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
