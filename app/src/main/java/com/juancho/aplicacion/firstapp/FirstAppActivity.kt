package com.juancho.aplicacion.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.juancho.aplicacion.R


class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnStart)
        val etName = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }
        }
    }
}