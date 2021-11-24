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

class Asus : Fragment() {

    companion object {
        fun newInstance() = Asus()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.asus, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.pcrecycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Zenbook 14 UX425 Core i5 11a Gen 14 FHD 512GB SSD 8GB RAM","S/ 4,999.00","3499",R.drawable.asuszenbook,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                        "Procesador: Intel Core i5 11th Gen\n" +
                        "Modelo tarjeta de video: Intel Xe Iris (integrado)\n" +
                        "Tamaño de la pantalla: 14 pulgadas\n" +
                        "Disco duro: No tiene\n" +
                        "Disco duro sólido: 512 GB SSD\n" +
                        "Núcleos del procesador: Octa Core\n" +
                        "Memoria total: 8GB\n" +
                        "Velocidad del procesador: 2.4 GHz\n" +
                        "Modelo del procesador Intel® Core i5-1135G7\n" +
                        "Memoria RAM: 8GB\n" +
                        "RAM expandible: No",false))

        productos.add(ProductosCardView("ASUS 15.6 Republic of Gamers Zephyrus Duo 15 SE Series G","S/ 23,129.00","16519",R.drawable.asusrepubicofgamers,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "3.3 Ghz Ryzen 9 5900Hx De 8 Núcleos\n" +
                    "32Gb Ddr4 - Ssd Pcie M.2 De 1 Tb\n" +
                    "Pantalla Ips De 15,6' 1920 X 1080 A 300 Hz\n" +
                    "Pantalla Táctil Secundaria De 14 \"\n" +
                    "Nvidia Geforce Rtx 3070 (8 Gb Gddr6)\n" +
                    "Usb 3.2 Gen 2 Tipo A Y Tipo C - Hdmi\n" +
                    "Wi-Fi 6 (802.11Ax) - Bluetooth 5.1\n" +
                    "Puerto Gigabit Ethernet\n" +
                    "Iluminación Rgb Aura Sync\n" +
                    "Windows 10 Pro\n" +
                    "Ficha Técnica En La Descripción Del Producto.\n" +
                    "Producto Importado De Usa.",false))

        productos.add(ProductosCardView("ASUS Vivo AiO M3 M3400WUAK 23.8 R3-5300U 4GB 1TB+128GB SSD","S/ 3,699.00","1799",R.drawable.asusvivoaio,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Procesador: Ryzen 3 Serie 5000\n" +
                    "Modelo tarjeta de video: AMD Radeon Graphics\n" +
                    "Tamaño de la pantalla 24 pulgadas\n" +
                    "Disco duro: No tiene\n" +
                    "Disco duro sólido: 1TB + 128GB SSD\n" +
                    "Núcleos del procesador Quad Core\n" +
                    "Memoria total 4GB\n" +
                    "Velocidad del procesador: 2.4 GHz\n" +
                    "Modelo del procesador AMD Ryzen 3 5300U\n" +
                    "Memoria RAM 4GB\n" +
                    "RAM expandible: No\n" +
                    "Tarjeta de video: AMD Radeon Graphics\n" +
                    "Capacidad de la tarjeta de video Integrado\n" +
                    "Tipo de pantalla FHD\n" +
                    "Resolución de la pantalla Full HD (1920x1080)\n" +
                    "Pantalla touch: No\n" +
                    "Tipo de teclado Teclado tipo isla alámbrico\n" +
                    "Idioma del teclado: Español Latinoamericano\n" +
                    "Sistema de audio: Integrado\n" +
                    "Entradas HDMI 2\n" +
                    "Entradas USB 5\n" +
                    "Unidad óptica: No\n" +
                    "Cámara Web Sí\n" +
                    "Conexión Bluetooth Sí\n" +
                    "Conectividad Wifi\n" +
                    "Alto 16.5 cm\n" +
                    "Ancho 40.9 cm\n" +
                    "Profundidad 54.0 cm\n" +
                    "Peso 5.4 kg\n" +
                    "Incluye accesorios: Mouse y Teclado alámbricos\n" +
                    "Sistema operativo: Windows 10 Home\n" +
                    "Marca: Asus\n" +
                    "Modelo M3400WUAK-BA037T\n" +
                    "Tipo: All in one\n" +
                    "Hecho en China\n" +
                    "Garantía del proveedor 12 meses",false))

        productos.add(ProductosCardView("ASUS 15.6 ZenBook Pro Duo 15 OLED Multi-Touch Laptop ","S/ 23,759.00","16969",R.drawable.asuszenbookpro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "2.4 Ghz Intel Core I9 8-Core (10Th Gen)\n" +
                    "32 Gb De Ram Ddr4 -1Tb M.2 Ssd\n" +
                    "15.6 3840 X 2160 Pantalla Táctil Oled\n" +
                    "Nvidia Geforce Rtx 3070\n" +
                    "Usb 3.2 Gen 2 -Thunderbolt 3 -Hdmi 2.1\n" +
                    "Wi-Fi 6 (802.11Ax) -Bluetooth 5.0\n" +
                    "Webcam Hd Ir Con Windows Hola Soporte\n" +
                    "Panel Táctil Screenpad Plus\n" +
                    "Incluye Stylus, Palm Rest, Stand & More\n" +
                    "Windows 10 Pro\n" +
                    "Producto Nuevo Y Original.\n" +
                    "Ficha Técnica En La Descripción Del Producto.\n" +
                    "Producto Importado De Usa.",false))

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