package com.juancho.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.juancho.aplicacion.firstapp.FirstAppActivity
import com.juancho.aplicacion.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnSaludar.setOnClickListener { navigateToSaludar() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}