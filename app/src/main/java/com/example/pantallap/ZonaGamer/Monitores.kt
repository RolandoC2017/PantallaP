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

class Monitores : Fragment() {

    companion object {
        fun newInstance() = Monitores()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.monitores, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("LG Monitor Gamer UltraGear 27GN750 27” Full HD IPS 240Hz 1ms G-Sync","S/ 2,000.00","1730",R.drawable.monitorlg,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño: 27\n" +
                    "Resolución: 1920 x 1080\n" +
                    "Tipo de panel: IPS\n" +
                    "Aspecto: 16:9\n" +
                    "Pixel Pitch: 0.3108mm x 0.3108mm\n" +
                    "Brillo: 320 cd/m²\n" +
                    "Luminocidad      400 cd/m²\n" +
                    "Color Gamut (Min.): sRGB 95% (CIE1931)\n" +
                    "Color Gamut (Typ.): sRGB 99% (CIE1931)\n" +
                    "Intensidad de Color: 16.7M\n" +
                    "Contrast Ratio (Min.)     700:1\n" +
                    "Contrast Ratio (Typ.)     1000:1\n" +
                    "Tiempo de Respuesta (GTG): 1ms\n" +
                    "Ángulo de visión 178º\n" +
                    "CONECTIVIDAD:\n" +
                    "HDMI\n" +
                    "DisplayPort\n" +
                    "USB Downstream Port\n" +
                    "Salida de auriculares",false))

        productos.add(ProductosCardView("Monitor GAMER TEROS 24 IPS FULL HD 5MS HDMI VGA GAMING","S/ 699.00","559",R.drawable.monitorteros,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "TAMAÑO: 24\" IPS  \n" +
                    "SIN BORDES\n" +
                    "RESOLUCION: 1920x1080 FULL HD\n" +
                    "PROPORCIÓN: WIDE\n" +
                    "CONTRASTE DINAMICO: 5 000 000:1",false))

        productos.add(ProductosCardView("Monitor Samsung Pivot 24 F24T452FQN LED IPS Full HD 75HZ 5MS HDMI DP","S/ 799.00","690",R.drawable.monitorsamsung,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: Samsung\n" +
                    "Modelo: F24T452FQN\n" +
                    "Part Number: LF24T452FQNXGO\n" +
                    "Tamaño Pantalla: 24 Pulg Plana (Flat)\n" +
                    "Tipo de Panel: IPS LED\n" +
                    "Proporción: Wide\n" +
                    "Resolución Max: 1920 X 1080 Full HD\n" +
                    "Tiempo De Respuesta: 5MS\n" +
                    "Frecuencia de actualización: 75 Hz\n" +
                    "Contraste: 1 000:1\n" +
                    "Brillo: 250 CD/M2\n" +
                    "Angulo de Vision: 178°(H) / 178°(V)\n" +
                    "Entradas/Salidas: Displayport, HDMI, Headphone, USB 2.0\n" +
                    "Dimensiones con Base:53.84 x 37.08 x 33.27 CM\n" +
                    "Peso: 3.99 KG",false))

        productos.add(ProductosCardView("Monitor Gamer 24 Pulgadas ViewSonic Full HD 75HZ","S/ 759.00","699",R.drawable.monitorview,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Entradas HDMI y VGA \n" +
                    "Tecnología Eye-Care para una visualización cómoda\n" +
                    "Modo ecológico para bajo consumo de energía\n" +
                    "Adaptive sync para eliminar el desgarro de la imagen y reducir el stuttering\n" +
                    "VESA montaje en pared\n" +
                    "Relación de contraste: 3.000:1 (típico)\n" +
                    "Relación de contraste dinámico: 50M:1\n" +
                    "Fuente de luz: LED\n" +
                    "Colores: 16.7M\n" +
                    "Frecuencia de actualización (Hz): 75Hz (Max)  ",false))

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