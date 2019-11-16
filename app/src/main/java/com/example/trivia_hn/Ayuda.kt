package com.example.trivia_hn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ayuda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        val BtnRegresar: Button = findViewById(R.id.BtnRegresar)

        BtnRegresar.setOnClickListener (object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent: Intent = Intent(this@Ayuda, MainActivity::class.java)
                intent.putExtra("1", "modofacil")
                startActivity(intent)
            }
        })
    }
}
