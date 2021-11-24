package com.example.pantallap.Pc

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

class Hp : Fragment() {

    companion object {
        fun newInstance() = Hp()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.hp, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.pcrecycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop HP 250 G8 Intel Core I5 1035G1 RAM 8GB Disco 1TB HDD Video 2GB 15.6? HD","S/ 3,999.00","2899",R.drawable.hplaptop250,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                        "Marca: HP\n" +
                        "Procesador: Intel Core i5 1035G1 1.0GHZ HASTA 3.6GHz\n" +
                        "Sistema Operativo: FREE DOS \n" +
                        "Memoria RAM: 8GB\n" +
                        "Disco duro: 1TB HDD\n" +
                        "Pantalla: 15.6\" (1366*768) HD\n" +
                        "Video dedicado: NVIDIA® GeForce® MX130 (GDDR5 2 GB dedicada)\n" +
                        "Puertos:\n" +
                        "2 x USB 3.0\n" +
                        "1 x USB 2.0\n" +
                        "1 x HDMI\n" +
                        "1 x LAN\n" +
                        "1 x Headphone/microphone combo jack\n" +
                        "Color: Negro\n" +
                        "PESO: 1.74 Kg\n" +
                        "Teclado en Español",false))

        productos.add(ProductosCardView("Computadora HP Core i3 8GB RAM 1TB HDD + 240GB SSD 21.5 FHD Windows 10 Home","S/ 2,599.00","2299",R.drawable.hpcorei3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "HP Slim Desktop S01-PF1004BLA Pequeña, eficiente y rápida. El producto adecuado para productividad sin ocupar mucho espacio.\n" +
                    "Procesador: Core i3-10100\n" +
                    "Memoria Ram:8GB\n" +
                    "Disco Duro:1TB\n" +
                    "Disco Solido:  240GB\n" +
                    "Sistema Operativo: Windows 10 Home\n" +
                    "Incluye: Teclado negro USB con cable, Mouse HP negro con cable",false))

        productos.add(ProductosCardView("Laptop HP Pavilion Gaming 15-ec1037la - Negro","S/ 4,699.00","3799",R.drawable.hppaviliongaming,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Sistema operativo: Windows 10 Home 64\n" +
                    "Procesador: AMD Ryzen™ 5 4600H (velocidad base de 3,0 GHz, velocidad de ráfaga máxima de hasta 4,0 GHz, 8 MB de caché L3 y 6 núcleos)\n" +
                    "Pantalla: FHD  de 15,6'\n" +
                    "Gráficos: NVIDIA® GeForce® GTX 1650 Ti (GDDR6 de 4 GB dedicada)\n" +
                    "Memoria: 8 GB de RAM DDR4\n" +
                    "Almacenamiento: Unidad de estado sólido M.2 PCIe® NVMe™ de 512 GB",false))

        productos.add(ProductosCardView("Computadora Todo en Uno HP i5-10210U,10ma, 16GB, 1TB, LED 22 FullHD","S/ 3,499.00","3199",R.drawable.hpallinonei5,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Procesador Intel® Core i5-10210U 10ma generación\n" +
                    "4 núcleos, 8 hilos, 1.6 GHz hasta 4.2 GHz con frecuencia Turbo, 6 MB SmartCache\n" +
                    "Sistema Operativo Free DOS, en Español\n" +
                    "Pantalla LCD con retroiluminación WLED, de 21.5” en diagonal, FHD\n" +
                    "(1920 x 1080), de 250 nits, antirreflejo y UWVA\n" +
                    "Gráficos Integrados, Intel® UHD Graphics para procesadores de 10ma generación\n" +
                    "Memoria RAM 16 GB DDR4 2666, 333 MHz (2x8 GB)\n" +
                    "Soporta hasta 32GB en (2) slots SODIMM\n" +
                    "Almacenamiento Disco duro HDD de 1TB 7200RPM SATA\n" +
                    "Teclado HP USB, en Español\n" +
                    "Mouse HP USB óptico\n" +
                    "Cámara Web Webcam de 5MP Pull-up con arreglo de doble micrófono digital integrado\n" +
                    "Audio HD con códec Realtek ALC3247, con altavoces estéreo integrados\n" +
                    "Conectividad LAN: Sí\n" +
                    "WLAN: Sí\n" +
                    "Bluetooth: Sí\n" +
                    "Se envía configurado y operativo.",false))

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