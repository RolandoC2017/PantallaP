package com.example.pantallap.ZonaGamer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R
import com.example.pantallap.Telefono.Apple

class SillaGamer : Fragment() {

    companion object {
        fun newInstance() = SillaGamer()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.silla_gamer, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("SILLA GAMING COUGAR ARMOR ONE BLACK - 3MAOBNXB.0001","S/ 1,300.00","1059",R.drawable.sillacougar,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Diseño envolvente con respaldo alto.\n" +
                    "Diseño ajustable.\n" +
                    "Ajuste de altura.\n" +
                    "Reclinación de 180°.\n" +
                    "Reposabrazos ajustable de 2D.\n" +
                    "Estructura de acero.",false))

        productos.add(ProductosCardView("Silla gamer nitro - azul","S/ 539.00","329",R.drawable.sillanitro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Modelo:Nitro\n" +
                    "Dimensiones:63.5 x 66 x 112-121.5 cm\n" +
                    "Peso (kg):17.2 kg\n" +
                    "Garantía:1 año\n" +
                    "Reclinable:Si\n" +
                    "Apoyabrazos:Si\n" +
                    "Material del asiento:cuero PU\n" +
                    "Material del respaldar:cuero PU\n" +
                    "Ruedas de desplazamiento:Si\n" +
                    "Tipo de silla:Gamer\n" +
                    "Peso máximo (kg):130 kg\n" +
                    "Información adicional:Base de nylon recubierta de negro de 350 mm\n" +
                    "100MM Clase 2 Gas lift; Mariposa\n" +
                    "Malla de PU + Tapicería\n" +
                    "Embalaje: 1PC / CTN",false))

        productos.add(ProductosCardView("SILLA GAMER ERGONOMICA NXT HORUS PRO 2021 RECLINABLE 155 GRADOS","S/ 699.00","399",R.drawable.sillanxt,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Te mereces lo Mejor, Vive la Experiencia con NXT\n" +
                    "Silla Gamer NXT HORUS PRO\n" +
                    "Soporta hasta 120 kg\n" +
                    "Material: cuero PU de alta calidad \n" +
                    "Reclinable 155°\n" +
                    "Diseño ergonómico - Doble Almohadilla\n" +
                    "Entrega Inmediata - Elige entre 7 Colores",false))

        productos.add(ProductosCardView("SILLA GAMER XION SPECTRE RECLINABLE 180","S/ 700.00","659",R.drawable.sillaxion,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Silla Gamer SPECTRE EDICION PREMIUM\n" +
                    "Estructura de Acero \n" +
                    "Reclinable hasta 180 grados\n" +
                    "Masajeador Lumbar \n" +
                    "Cojín Cervical y lumbar ajustable\n" +
                    "Posabrazos 4D \n" +
                    "Soporta hasta 230 kg\n" +
                    "PU de alta calidad, Materiales de la máxima calidad\n" +
                    "Base de metal\n" +
                    "Pistos certificado",false))

        var adapter = ProductosAdapterCV(productos)

        //recyclerView.layoutManager = LinearLayoutManager(root.context,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = GridLayoutManager(root.context,2)
        recyclerView.adapter = adapter

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}