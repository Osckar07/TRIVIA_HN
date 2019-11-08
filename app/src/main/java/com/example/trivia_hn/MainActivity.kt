package com.example.trivia_hn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnAyuda.setOnClickListener {
            val intent = Intent(this,Ayuda::class.java)
            startActivity(intent)
        }
    }
}
