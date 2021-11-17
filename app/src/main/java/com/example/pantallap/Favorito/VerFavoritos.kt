package com.example.pantallap.Favorito

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.FavoritoAdapter
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.itemFavorito
import com.example.pantallap.R

class VerFavoritos : Fragment() {

    lateinit var adapter : FavoritoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root = inflater.inflate(R.layout.fragment_ver_favoritos, container, false)

        var lista: RecyclerView = root.findViewById(R.id.recycleFavorito)

        var listaFavoritos = ArrayList<itemFavorito>()

        var conexion = Conexion(requireContext())
        var db = conexion.writableDatabase
        var sql = "select * from BDFavoritos"
        var respuesta = db.rawQuery(sql, null)
       if (respuesta.moveToFirst()) {
            do {
                listaFavoritos.add(
                    itemFavorito(respuesta.getString(1),respuesta.getString(2),respuesta.getString(3),respuesta.getInt(4),respuesta.getString(5))
                )
            } while (respuesta.moveToNext())
        }

        adapter = FavoritoAdapter(listaFavoritos)
        lista.layoutManager = GridLayoutManager(root.context,2)
        lista.adapter = adapter

        return root
    }
}