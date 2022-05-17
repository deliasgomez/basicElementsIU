package com.example.basicelementsiu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner: Spinner = findViewById(R.id.spinner)
        val nombre : EditText = findViewById(R.id.etNombre)
        val numDocumento:EditText = findViewById(R.id.etDocumento)
        val guardar: Button = findViewById(R.id.btnGuardar)
        val show : Button = findViewById(R.id.btnMostrar)
        ArrayAdapter.createFromResource(
            this,
            R.array.tipos_documento,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val prefer = getSharedPreferences("datos", MODE_PRIVATE)

        guardar.setOnClickListener {
            val editor = prefer.edit()
            editor.putString("nombre",nombre.text.toString())
            editor.putString("documento",numDocumento.text.toString())
            editor.apply()
            Toast.makeText(this, "Cambios guardados", Toast.LENGTH_SHORT).show()

        }

        show.setOnClickListener {
            val cambio  = Intent(this,mostrarDatos::class.java)
            startActivity(cambio)



        }







    }

}

