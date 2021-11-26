package com.example.pantallap.RealidadVirtual

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

class Oculus : Fragment() {

    companion object {
        fun newInstance() = Oculus()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.oculus, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleRealidad)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Visor de realidad virtual OCULUS QUEST 2 - 128gb NUEVO MODELO","S/ 2,399.00","1990",R.drawable.oculusquest2,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Quest 2 requiere registro de cuenta de Facebook; VR Gaming sin cables o un PC; resolución 1832 x 1920 por ojo.\n" +
                    "Hardware de siguiente nivel: haz que cada movimiento cuente con un procesador increíblemente rápido y nuestra pantalla de más alta resolución; juego todo en uno – con compatibilidad retroceso, puedes explorar nuevos títulos y antiguos favoritos en la amplia biblioteca de contenido Quest expansiva; entretenimiento inmersivo: obtén el mejor asiento en la casa para vivir conciertos, películas innovadoras, eventos exclusivos y mucho más.\n" +
                    "Quest 2 requiere que tu cuenta de Facebook se inicie, lo que hace que sea fácil reunirse con amigos en VR y descubrir las comunidades de todo el mundo; Fácil configuración: solo tienes que abrir la caja, configurar con la aplicación de smartphone y saltar a VR. No necesita PC o consola. Requiere acceso a Internet inalámbrico y la aplicación Oculus (descarga gratuita) para configurar el dispositivo; pantalla premium: captura cada detalle con una impresionante pantalla que cuenta con un 50% más de píxeles que el Quest original.\n" +
                    "Capacidad de almacenamiento de 64 GB\n" +
                    "Paquete de broage autorizado con broage + 2 fundas de silicona para Oculus Quest 2 (negro x 1, blanco x1) + cable USB C Link de 15.7 ft, compatible con cable Oculus Link compatible con Quest 1/2 a un PC de juegos, USB 3.2 Gen1 5Gbps/3A transfiere datos a velocidades de hasta 5 Gbps, 10 veces más rápido que USB 2.2.2.0 0 cables, compatible con 2.0 (480 Mbps).",false))

        productos.add(ProductosCardView("Visor de Realidad Virtual Oculus quest 2 128 gb","S/ 2,499.00","1869",R.drawable.oculusquest2antiguo,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "128gb\n" +
                    "Audio posicional 3D sin auriculares.– Procesador ultrarrápido y pantalla de mayor resolución.– Tipo de visualización OLED.de almacenamiento para juegos y aplicaciones todo en uno.–\n" +
                    "Entretenimiento inmersivo: conciertos en vivo, películas, etc.\n" +
                    "Pantalla impresionante: 50% más de píxeles que la Quest 1.– Ultimate Control.– PC VR Compatible.\n" +
                    "Configuración fácil.– Juegos de realidad virtual sin cables o una PC.\n" +
                    "Descubre comunidades de todo el mundo.**El cable Oculus Link se vende por separado",false))

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