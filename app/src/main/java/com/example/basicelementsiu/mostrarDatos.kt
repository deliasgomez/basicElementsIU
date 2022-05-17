package com.example.basicelementsiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.basicelementsiu.databinding.ActivityMostrarDatosBinding

class mostrarDatos : AppCompatActivity() {
    lateinit var binding: ActivityMostrarDatosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btndetail.setOnClickListener {
            llamarFragment(fragMostrar())
        }
    }
    fun  llamarFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmenfTransaction = fragmentManager.beginTransaction()
        fragmenfTransaction.replace(R.id.frag,fragment)
        fragmenfTransaction.commit()

    }


}