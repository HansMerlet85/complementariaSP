package com.example.complementariasp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar los valores del formulario
        val name = findViewById<TextView>(R.id.txtName)
        val email = findViewById<TextView>(R.id.txtMail)

        //Recuperar boton controles

        val save = findViewById<Button>(R.id.btnSearch)
        val search = findViewById<Button>(R.id.btnSave)



    }
}