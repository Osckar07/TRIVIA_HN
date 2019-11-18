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
var Puntos = 0
class ModoFacil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)
        val Pregunta: TextView = findViewById(R.id.TvPreguntas)
        val Respuesta1: RadioButton = findViewById(R.id.Respuesta1)
        val Respuesta2: RadioButton = findViewById(R.id.Respuesta2)
        val Respuesta3: RadioButton = findViewById(R.id.Respuesta3)
        val Respuesta4: RadioButton = findViewById(R.id.Respuesta4)
        val BotonSiguiente: Button = findViewById(R.id.BtnSiguiente)

        val instancia: Intent = intent
        val parametroextra = instancia.getStringExtra("1")
        val dificultad: String? = parametroextra
        when (dificultad) {

            "modofacil" -> {
                val random = Random()

                val ran = random.nextInt(12) + 1
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
                        Pregunta.text = "¿Cual es la actual Flor Nacional de Honduras?"
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
                    4 -> {
                        Pregunta.text = "¿En que continenete se encuentra Honduras?"
                        Respuesta1.text = "Europa"
                        Respuesta2.text = "América"
                        Respuesta3.text = "Asia"
                        Respuesta4.text = "Oceania"


                        Respuesta2.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    5 -> {
                        Pregunta.text = "¿Que significa el color blanco de la Bandera Nacional de Honduras?"
                        Respuesta1.text = "Amor, Serenidad y alegria"
                        Respuesta2.text = "Tranquilidad, amor y pureza"
                        Respuesta3.text = "Normas, Ley y Conquista"
                        Respuesta4.text = "Paz, Serenidad y Pureza"


                        Respuesta4.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    6 -> {
                        Pregunta.text = "¿Quien escribió la letra del Himno Nacional de Honduras?"
                        Respuesta1.text = "Pilo Tejeda"
                        Respuesta2.text = "Polache"
                        Respuesta3.text = "Augusto C. Coello"
                        Respuesta4.text = "Buyaca Family"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    7 -> {
                        Pregunta.text = "¿Cuantos departamentos tiene Honduras?"
                        Respuesta1.text = "3 Departamentos"
                        Respuesta2.text = "6 Departamentos"
                        Respuesta3.text = "18 Departamentos"
                        Respuesta4.text = "11 Departamentos"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    8 -> {
                        Pregunta.text = "¿Cuando se celebra la Independencia de Honduras?"
                        Respuesta1.text = "10 de Septiembre"
                        Respuesta2.text = "14 de Septiembre"
                        Respuesta3.text = "15 de Septiembre"
                        Respuesta4.text = "22 de Septiembre"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    9 -> {
                        Pregunta.text = "¿Cual es la lengua oficial de Honduras?"
                        Respuesta1.text = "Frances"
                        Respuesta2.text = "Ruso"
                        Respuesta3.text = "Ingles"
                        Respuesta4.text = "Español"


                        Respuesta4.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    10 -> {
                        Pregunta.text = "¿Cual es la moneda oficial de Honduras?"
                        Respuesta1.text = "Dolar"
                        Respuesta2.text = "Lempira"
                        Respuesta3.text = "Euro"
                        Respuesta4.text = "Quetzal"


                        Respuesta2.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    11 -> {
                        Pregunta.text = "¿Cual era anteriormente la capital de Honduras?"
                        Respuesta1.text = "San Pedro Sula"
                        Respuesta2.text = "Ocotepeque"
                        Respuesta3.text = "Comayagua"
                        Respuesta4.text = "Intibucá"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })
                    }
                    12 -> {
                        Pregunta.text = "¿Donde murió El Indio Lempira?"
                        Respuesta1.text = "Gracias a Dios"
                        Respuesta2.text = "Cerro Congolón"
                        Respuesta3.text = "Cerro de Hula"
                        Respuesta4.text = "Tegucigalpa"


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
                        Puntos +=10
                        Toast.makeText(
                            this@ModoFacil,
                            "¡Respuesta Correcta :)!",
                            Toast.LENGTH_SHORT
                        ).show()
                        recreate()
                    } else {
                        val intent: Intent = Intent(this, MainActivity::class.java)
                        val perdida = AlertDialog.Builder(this)
                        perdida.setTitle("Perdiste")
                        perdida.setMessage("Te has equivocado, intentalo nuevamente.       Puntos:$Puntos")
                        perdida.setPositiveButton("Listo") { _: DialogInterface?, _: Int ->
                            startActivity(intent)
                            finish()
                        }
                        perdida.show()
                        Puntos = 0
                    }

                    Respuesta1.isChecked = false
                    Respuesta2.isChecked = false
                    Respuesta3.isChecked = false
                    Respuesta4.isChecked = false


                }
            }

            "mododificil" -> {
                val random = Random()

                val ran = random.nextInt(4) + 1
                var RespuestaBuena: Int = 0
                when (ran) {
                    1 -> {

                        Pregunta.text = "¿Cual es la extensión territorial de Honduras?"
                        Respuesta1.text = "112,492 km²"
                        Respuesta2.text = "111,429 km²"
                        Respuesta3.text = "987,321 km²"
                        Respuesta4.text = "234,890 km²"


                        Respuesta1.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1

                            }
                        })

                    }
                    2 -> {

                        Pregunta.text = "¿Cauntos Municipios tiene Honduras?"
                        Respuesta1.text = "1,980 Municipios"
                        Respuesta2.text = "2,890 Municipios"
                        Respuesta3.text = "3,731 Municipios"
                        Respuesta4.text = "3,000 Municipios"


                        Respuesta3.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1
                            }
                        })
                    }
                    3 -> {

                        Pregunta.text = "¿Quien fue el primer Presidente de Honduras?"
                        Respuesta1.text = "José Trinidad Cabañas"
                        Respuesta2.text = "Lempira"
                        Respuesta3.text = "Francsico Morazan "
                        Respuesta4.text = "Dionisio de Herrera"


                        Respuesta4.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1
                            }
                        })
                    }
                    4 -> {

                        Pregunta.text = "¿En que año se Independizó Honduras?"
                        Respuesta1.text = "1,821"
                        Respuesta2.text = "1,874"
                        Respuesta3.text = "1,800"
                        Respuesta4.text = "1,890"


                        Respuesta1.setOnClickListener(object : View.OnClickListener {
                            override fun onClick(v: View?) {
                                RespuestaBuena = 1
                            }
                        })
                    }



                }
                BotonSiguiente.setOnClickListener {
                    Log.d("btnSiguiente", "Hola")
                    if (RespuestaBuena == 1) {
                        Puntos +=10
                        Toast.makeText(
                            this@ModoFacil,
                            "¡Respuesta Correcta :)!",
                            Toast.LENGTH_SHORT
                        ).show()
                        recreate()
                    } else {
                        val intent: Intent = Intent(this, MainActivity::class.java)
                        val perdida = AlertDialog.Builder(this)
                        perdida.setTitle("Perdiste")
                        perdida.setMessage("Te has equivocado, intentalo nuevamente.  Puntos:$Puntos")
                        perdida.setPositiveButton("Listo") { _: DialogInterface?, _: Int ->
                            startActivity(intent)
                            finish()
                        }
                        perdida.show()
                        Puntos = 0
                    }

                    Respuesta1.isChecked = false
                    Respuesta2.isChecked = false
                    Respuesta3.isChecked = false
                    Respuesta4.isChecked = false


                }
            }
        }
    }
}



