package com.example.basicelementsiu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class fragMostrar : Fragment(R.layout.fragment_frag_mostrar) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val redPreference : SharedPreferences = this.requireContext().getSharedPreferences("datos",
            Context.MODE_PRIVATE)
        val name = redPreference.getString("nombre", "no hay nada guardado")
        val nombreShow = requireView().findViewById<TextView>(R.id.tvNombre)
        nombreShow.text = name
        val nroDocumento =redPreference.getString("documento", "no se ha guardado")
        val documentShow = requireView().findViewById<TextView>(R.id.tvNroDoc)
        documentShow.text = nroDocumento
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_mostrar, container, false)
    }


}