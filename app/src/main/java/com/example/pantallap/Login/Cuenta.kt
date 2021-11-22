package com.example.pantallap.Login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.pantallap.R

class Cuenta : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragmento
        val root = inflater.inflate(R.layout.fragment_cuenta, container, false)

        val iniciarsesion = root.findViewById<Button>(R.id.btnIniciar)
        val registrar = root.findViewById<Button>(R.id.btnRegistrar)

        iniciarsesion.setOnClickListener {
            var intent = Intent(activity, Login::class.java)
            startActivity(intent)
        }

        registrar.setOnClickListener {
            var intent = Intent(activity, Registro_Login::class.java)
            startActivity(intent)
        }

        return root
    }
}