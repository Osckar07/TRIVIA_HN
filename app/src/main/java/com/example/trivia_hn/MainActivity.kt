package com.example.trivia_hn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnAyuda.setOnClickListener {
            val intent = Intent(this, Ayuda::class.java)
            startActivity(intent)
            }


        val BtnFacil: Button = findViewById(R.id.BtnModoFacil)

        BtnFacil.setOnClickListener (object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent: Intent = Intent(this@MainActivity, ModoFacil::class.java)
                intent.putExtra("1", "modofacil")
                startActivity(intent)
            }
        })
        val BtnDificil: Button = findViewById(R.id.BtnModoDificil)

        BtnDificil.setOnClickListener (object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent: Intent = Intent(this@MainActivity , ModoFacil::class.java)
                intent.putExtra("1", "mododificil")
                startActivity(intent)
            }
        })

    }
}

