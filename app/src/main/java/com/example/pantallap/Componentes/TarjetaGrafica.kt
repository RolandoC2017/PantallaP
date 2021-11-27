package com.example.pantallap.Componentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.Pc.Acer
import com.example.pantallap.R

class TarjetaGrafica : Fragment() {

    companion object {
        fun newInstance() = TarjetaGrafica()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.tarjeta_grafica, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Tarjetas graficas originales GTX 970 4GB 128Bit GDDR5 para n","S/ 675.00","519",R.drawable.tarjetagraficagtx,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Faacute;cil de usar\n" +
                    "Calidad alta\n" +
                    "Bien hecho.\n" +
                    "Durabilidad.\n" +
                    "Buena producción\n" +
                    "Es popular en el pueblo.\n" +
                    "Ahorra dinero.\n" +
                    "Mejores opciones y mejores descuentos\n" +
                    "La atención al cliente es nuestra prioridad.\n" +
                    "Las preferencias dependen de las circunstancias.\n" +
                    "Venta masiva\n" +
                    "Precio razonable\n" +
                    "Durable y práctico",false))

        productos.add(ProductosCardView("Tarjeta Grafica Gainward RTX 3060 Ti Wind Chaser 8GB","S/ 6,710.00","4299",R.drawable.tarjetagraficagainward,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Procesamiento de Gráficos: GA104\n" +
                    "Modo OC: Hasta 1665 MHz\n" +
                    "Modo Base: Hasta 1410 MHz\n" +
                    "Tamaño de la Memoria: 8GB\n" +
                    "Tipo de Memoria: GDDR6\n" +
                    "Bus de Tarjeta: PCIe 4.0 x16\n" +
                    "Dimensiones: 28cm x 11.6cm x 4cm",false))

        productos.add(ProductosCardView("Tarjeta Grafica Gigabyte RX580 8G","S/ 6,170.00","4139",R.drawable.tarjetagraficarx,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Procesamiento De Gráficos: Radeon RX580\n" +
                    "Modo Oc: Hasta 1355 MHz\n" +
                    "Modo De Juego: Hasta 1340 MHz\n" +
                    "Proceso Tecnológico: 14 nm\n" +
                    "Tamaño De La Memoria: 8GB\n" +
                    "Tipo De Memoria: GDDR5\n" +
                    "Bus De Tarjeta: PCI-E 3.0 X 16\n" +
                    "Dimensiones: 4cm x 23.2cm x 11.6cm\n" +
                    "Garantía por 12 meses *Aplican Términos y Condiciones.",false))

        productos.add(ProductosCardView("Tarjeta Grafica De Video Zotac Gaming Geforce RTX 3070 Te","S/ 5,439.00","4709",R.drawable.tarjetagraficagaming,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tarjeta Grafica De Video\n" +
                    " 8GB Memoria\n" +
                    " Tipo Gddr6\n" +
                    " 256 Bits\n" +
                    "Dual Fan\n" +
                    "Reloj De Motor 1755 Mhz\n" +
                    " Pci-Express 4.0 X 16,\n" +
                    " Enfriamiento Icestrom 2.0\n" +
                    "Opengl 4.6\n" +
                    "HDCP 2.3\n" +
                    " HDMI 2.1\n" +
                    "Display Port 1.4A X 3.",false))

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