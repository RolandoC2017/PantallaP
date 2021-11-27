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

class Teclados : Fragment() {

    companion object {
        fun newInstance() = Teclados()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.teclados, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("TECLADO GAMER CON ILUMINACION TRUST GXT835 AZOR","S/ 190.00","115",R.drawable.tecladotrust,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Membrana de tecnología clave\n" +
                    "Altura : 40 mm\n" +
                    "Ancho : 438 mm\n" +
                    "Peso : 621 g\n" +
                    "Teclado de tamaño completo : sí\n" +
                    "Tipo de conexión : cableada\n" +
                    "Longitud del cable cable : 180 cm\n" +
                    "USB versión : 1.1\n" +
                    "Tipo de conector : USB-A macho\n" +
                    "Diseñado para juegos : sí\n" +
                    "Tipo de juego : FPS, MMO, MOBA, RPG, RTS\n" +
                    "Modo de juego : sí\n" +
                    "Retroiluminación : sí\n" +
                    "Colores de luz de fondo : Arco iris\n" +
                    "Distribución del teclado : QWERTY\n" +
                    "Fuente de alimentación : USB\n" +
                    "Dispositivos compatibles : laptop, pc, consola de juegos\n" +
                    "Consolas compatibles : PS4, Xbox One\n" +
                    "Plataformas de software compatibles : Mac OS, Windows, Chrome OS\n" +
                    "Teclado numérico : sí\n" +
                    "Teclas multimedia sI : 12 funciones FN\n" +
                    "Teclas especiales : Teclas FN\n" +
                    "Número de llaves : 104\n" +
                    "Vida útil : 5000000 pulsaciones clave\n" +
                    "Rollo de 8 teclas Anti-Ghosting\n" +
                    "Tiempo de respuesta 8 ms\n" +
                    "Indicadores Bloqueo de mayúsculas, Bloqueo de números, Bloqueo de desplazamiento, Modo de juego",false))

        productos.add(ProductosCardView("Teclado Gamer RGB Mini 35 Teclas Para Una Mano GAMING","S/ 80.00","55",R.drawable.tecladorgb,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Está diseñado para jugar especialmente para alguien a quien le gusta usar una mano para controlar el teclado en juegos de acción para movimientos rápidos.\n" +
                    "La retroiluminación LED RGB lo convierte en un increíble teclado con una sola mano.\n" +
                    "Teclado de una mano Diseño ergonómico: una forma ergonómica con un cómodo reposamuñecas\n" +
                    "Lo que puede reducir la fatiga, el teclado para juegos con una gran área de reposamanos para la mano le permite usarlo con menos esfuerzo\n" +
                    "El teclado utiliza un diseño portátil, su pequeño tamaño lo hace no solo fácil de transportar, sino que también ahorra espacio.\n" +
                    "Retroiluminación RGB: la retroiluminación RGB admite el modo de respiración y el modo estático, hay 7 colores para elegir\n" +
                    "El efecto de iluminación genial te traerá más diversión para el juego",false))

        productos.add(ProductosCardView("Teclado Mecánico Redragon Kumara WHITE Rgb K552 SP - Blanco","S/ 259.00","199",R.drawable.tecladowhite,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Compacto, es ideal para ganar espacio de movilidad del mouse, colocar el teclado en posición inclinada y para transportarlo cuando vayas a alguna competencia!\n" +
                    "Tipo de switches: intercambiables Outemu RED MK2, lineal, fuerza de actuación 50g\n" +
                    "Idioma: español (cuenta con Ñ, Enter de tamaño completo y > al costado del Shift)\n" +
                    "Caract Esp. Internas : 100% Anti-Ghosting con full Key Rollover, controles multimedia, de iluminación y de efectos\n" +
                    "Caract. Esp. Externas: sistema antisalpicaduras y teclas antiborrado (doble inyección)\n" +
                    "Herramientas adicionales: 4 Switches intercambiables, herramientas extractoras de keycaps y switches\n" +
                    "Software: Sí (configurar specs, RGB, macros, multimedia y perfiles)",false))

        productos.add(ProductosCardView("Teclado Gamer Semimecanico Redragon SHIVA K512RGB-SP-","S/ 189.00","139",R.drawable.tecladoshiva,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tipo de teclado: membrana (semi mecánico)\n" +
                    "Iluminación y efectos: RGB configurable, colores sólidos y efecto respiración\n" +
                    "Idioma: español (cuenta con Ñ, Enter de tamaño completo y > al costado del Shift)\n" +
                    "Caract. esp. internas: 26 teclas Anti-Ghosting con Key Rollover.\n" +
                    "Caract. esp. externas: sistema antisalpicaduras y teclas antiborrado (doble inyección) y teclas multimedia y teclas macro dedicadas y reposamuñecas magnético extraíble.\n" +
                    "Construcción: ABS reforzado, cable mallado y reforzado que soporta 12 kg y 10000 flexiones, USB enchapado en oro\n" +
                    "Software: sí (configurar specs, RGB, macros, multimedia y perfiles)",false))

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