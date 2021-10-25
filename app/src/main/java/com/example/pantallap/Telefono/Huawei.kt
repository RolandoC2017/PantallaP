package com.example.pantallap.Telefono

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.pantallap.InfoHuawei1
import com.example.pantallap.R

class Huawei : Fragment() {

    private lateinit var linear: LinearLayout

    companion object {
        fun newInstance() = Huawei()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.huawei, container, false)

        linear = root.findViewById<LinearLayout>(R.id.pop1)

        linear!!.setOnClickListener { startActivity(Intent(context, InfoHuawei1::class.java)) }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}