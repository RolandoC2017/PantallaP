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

class Mouse : Fragment() {

    companion object {
        fun newInstance() = Mouse()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.mouse, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Mouse Gamer Redragon GRIFFIN M607 7200 DPI, RGB, 8 botones - Negro","S/ 99.00","69",R.drawable.mouseredragon,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Dpi y Polling Rate:  hasta 7200 DPI y 125/1000Hz\n" +
                    "Software: Sí (configurar specs, macros, multimedia y perfiles).\n" +
                    "Sensor: PAW3212 óptico.\n" +
                    "Cantidad de botones: 8 \n" +
                    "Recomendado para manos: medianas a grandes\n" +
                    "Recomendado para agarre: palma\n" +
                    "Dimensiones: 12.7 x 8.1 x 4.1 cm\n" +
                    "Peso: 120 g\n" +
                    "Iluminación: RGB configurable y 7 efectos de iluminación\n" +
                    "Material exterior: Abs reforzado, textura suave y superficie antideslizante en laterales\n" +
                    "Tipo y longitud del cable: cable engomado 1.8 m y USB enchapado en oro",false))

        productos.add(ProductosCardView("Razer Basilisk X Hyperspeed Wireless Gaming Mouse 16000DPI DPI","S/ 299.00","169",R.drawable.mouserazer,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Ratón inalámbrico para juegos Razer Basilisk X Hyperspeed: compatible con Bluetooth e inalámbrico - Sensor óptico de 16K DPI - 6 botones programables\n" +
                    "Tecnología inalámbrica ultrarrápida Razer HyperSpeed\n" +
                    "Sensor óptico avanzado Razer 5G\n" +
                    "Interruptores mecánicos de ratón Razer",false))

        productos.add(ProductosCardView("Mouse Gamer VSG Aquila Air Alámbrico Blanco Brillante Rac Store","S/ 249.00","209",R.drawable.mousevsg,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tipo de sensor: Óptico\n" +
                    "Sensor: PMW3389\n" +
                    "IPS: 400\n" +
                    "Interruptor + durabilidad: Omron - 20 millones de clicks\n" +
                    "Peso (Sin Cable): Acabado mate 60g - Acabado brillante 61g\n" +
                    "Peso ajustable: Si - 12 pesas de 1.6g - Total 22g\n" +
                    "Dimensión: 66x120x42 milímetros\n" +
                    "DPI Máximo: 16,000\n" +
                    "Niveles de DPI predeterminados: 400/800/1200/2400/3200/6400/16000\n" +
                    "Conectividad: Alámbrico USB 2.0\n" +
                    "Cable: Cable paracord - 1.8 metros\n" +
                    "Tasa de Sondeo: 125/250/500/1000 Hz\n" +
                    "Aceleración: 50G\n" +
                    "Iluminación: RGB 16.8 Millones de colores (10 efectos)\n" +
                    "Sistemas operativos compatibles: Win 7/8/10 - Linux - Mac\n" +
                    "Software: Si (Compatible con Windows)\n" +
                    "Botones: 6.\n" +
                    "Por la compra te obsequiamos una lata de Monster.",false))

        productos.add(ProductosCardView("Mouse Gamer Xtrike Me GM-203 2400 Dpi RGB 6 Botones","S/ 50.00","25",R.drawable.mousextrike,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Alta sensibilidad y precisión\n" +
                    "Diseño ergonómico y compacto\n" +
                    "Rueda de desplazamiento\n" +
                    "antideslizante\n" +
                    "Retroiluminación automática rainbow rgb\n" +
                    "Tipo de sensor: óptico\n" +
                    "Sensibilidad: 3600 - 2400 - 1600 - 1200 DPI\n" +
                    "Botónes: 6\n" +
                    "7 colores de fondo\n" +
                    "Conexión: usb 2.0\n" +
                    "Tamaño del cable: 150cm\n" +
                    "Compatibilidad: Windows - MacOS\n" +
                    "Garantía: 6 Meses",false))

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