package com.example.trivia_hn

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_modo_facil.*
import java.util.*

class ModoFacil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)

        val Pregunta: TextView=findViewById(R.id.TvPreguntas)
        val Respuesta1: RadioButton=findViewById(R.id.Respuesta1)
        val Respuesta2: RadioButton=findViewById(R.id.Respuesta2)
        val Respuesta3: RadioButton=findViewById(R.id.Respuesta3)
        val Respuesta4: RadioButton=findViewById(R.id.Respuesta4)
        val BotonSiguiente: Button=findViewById(R.id.BtnSiguiente)

        val instancia: Intent = intent
        val parametroextra=instancia.getStringExtra("1")
        val dificultad:String=parametroextra
        when(dificultad){

            "modofacil"-> {
                val random = Random()

                val ran = random.nextInt(3) + 1
                var RespuestaBuena: Int = 0
                when (ran) {
                    1 -> {

                        Pregunta.text = "¿Cual es la capital de Honduras?"
                        Respuesta1.text = "San Pedro Sula"
                        Respuesta2.text = "La Paz"
                        Respuesta3.text = "Tegucigalpa"
                        Respuesta4.text = "Ocotepeque"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })

                    }
                    2 -> {
                        Pregunta.text = "¿Cuantas estrellas tiene la Bandera de Honduras?"
                        Respuesta1.text = "5 Estrellas"
                        Respuesta2.text = "3 Estrellas"
                        Respuesta3.text = "7 Estrellas"
                        Respuesta4.text = "4 Estrellas"


                        Respuesta1.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    3 -> {
                        Pregunta.text = "¿Cual es la actual flor nacional de Hdonuras?"
                        Respuesta1.text = "La Rosa"
                        Respuesta2.text = "La Orquidea"
                        Respuesta3.text = "El Girasol"
                        Respuesta4.text = "Los Tulipanes"


                        Respuesta2.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                }
                        BotonSiguiente.setOnClickListener {
                            Log.d("btnSiguiente", "Hola")
                            if (RespuestaBuena == 1) {
                                Toast.makeText(
                                    this@ModoFacil,
                                    "¡Respuesta Correcta :)!",
                                    Toast.LENGTH_LONG
                                ).show()
                                recreate()
                            } else {
                                val intent: Intent = Intent(this, MainActivity::class.java)
                                val perdida= AlertDialog.Builder(this)
                                perdida.setTitle("Perdiste")
                                perdida.setMessage("Te has equivoado, intentalo nuevamente")
                                perdida.setPositiveButton("Listo", {dialog: DialogInterface?, i: Int ->
                                    startActivity(intent)
                                    finish()
                                })
                                perdida.show()
                            }

                            Respuesta1.isChecked = false
                            Respuesta2.isChecked = false
                            Respuesta3.isChecked = false
                            Respuesta4.isChecked = false


                        }
                    }

            "mododificil"->{

                }

        }
    }
    
}


