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

class Acer : Fragment() {

    companion object {
        fun newInstance() = Acer()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.acer, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.pcrecycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop Acer AN515-45-R4R6 15.6 AMD Ryzen 7 16GB 256 GB SSD + 1TB","S/ 8,999.00","8475",R.drawable.aceran515,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                        "Tipo:Laptop Gamer\n" +
                        "Modelo:AN515-45-R4R6\n" +
                        "Tamaño de pantalla:15.6\"\n" +
                        "Definición:Full HD\n" +
                        "Resolución de pantalla:1920 x 1080\n" +
                        "Pantalla táctil:No\n" +
                        "Tasa de refreso:144Hz\n" +
                        "Costado:25.5 cm\n" +
                        "Alto:2.29 cm\n" +
                        "Ancho:36.3 cm\n" +
                        "Peso (kg):2.30 kg\n" +
                        "Marca de procesador:AMD\n" +
                        "Procesador:5800H 5ma Generación\n" +
                        "Velocidad de procesador:3.20 GHz\n" +
                        "Velocidad máxima:4.40 GHz\n" +
                        "Núcleos de procesador:8\n" +
                        "Memoria RAM:16 GB\n" +
                        "Memoria ampliable:32 GB\n" +
                        "Tipo de gráficos:DEDICADO\n" +
                        "Marca tarjeta gráfica:NVIDIA\n" +
                        "Tarjeta gráfica:RTX 3060\n" +
                        "Memoria Gráfica:6 GB\n" +
                        "Capacidad:256 GB SSD + 1TB\n" +
                        "Disco duro (DD):Si\n" +
                        "Disco estado sólido (SSD):Si\n" +
                        "Permite segunda unidad:Si\n" +
                        "Permite reemplazo:Si\n" +
                        "Wi-Fi:Si\n" +
                        "HDMI:Si\n" +
                        "USB 3.0:3\n" +
                        "USB tipo C:1\n" +
                        "Entrada micrófono:Si\n" +
                        "Puerto de red:Si\n" +
                        "Conexión VGA:No\n" +
                        "Bluetooth:Si\n" +
                        "Sistema operativo:Windows 10\n" +
                        "Garantía:1 año\n" +
                        "Teclado iluminado:Si\n" +
                        "Teclado númerico:Si\n" +
                        "Unidad óptica:No\n" +
                        "Cámara web:Si",false))

        productos.add(ProductosCardView("Laptop Acer Gamer AN515-55-73XJ 15.6 Intel Core i7 16GB 256GB SSD","S/ 5,599.00","5099",R.drawable.acerameran515intel,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: ACER\n" +
                    "Tamaño de la pantalla: 15.6\"\n" +
                    "Memoria RAM 16GB\n" +
                    "Disco duro 256GB SSD + 1 TB HDD\n" +
                    "Procesador CORE I7 10750H\n" +
                    "Sistema operativo Windows 10\n" +
                    "Velocidad del procesador: 2,6 GHZ\n" +
                    "Tarjeta gráfica: GTX 1650 4GB\n" +
                    "Velocidad máxima dle procesador: 5,00 GHZ\n" +
                    "Núcleos del procesador: HEXA CORE\n" +
                    "Memoria cache: 12MB\n" +
                    "Batería: 57Wh Li-ion battery\n" +
                    "Tipo de teclado: numérico\n" +
                    "Resolución de pantalla: FHD LCD\n" +
                    "Tipo de memoria RAM: DDR4\n" +
                    "Tipo de Disco duro: SSD+HDD\n" +
                    "Lector de CD: No\n" +
                    "Puertos HDMI: 1\n" +
                    "Puerto USB: 4\n" +
                    "Medidas del producto: 23.90mm*363.4mm*255m*\n" +
                    "Peso: 2.3 Kg\n" +
                    "Garantía del proveedor : 1 año",false))

        productos.add(ProductosCardView("Laptop Gamer Acer Predator 17.3 Intel Core i7 10°Gen 1TB + 256 SSD 16GB RAM","S/ 11,565.00","8569",R.drawable.acergamerpredator,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: Acer\n" +
                    "Procesador: Intel Core i7 (10a Gen) i7-10750H \n" +
                    "Sistema Operativo: Free Dos\n" +
                    "Tamaño de Pantalla : 17.3\" Full HD\n" +
                    "Almacenamiento: 1TB + 256 SSD\n" +
                    "Memoria RAM: 16GB\n" +
                    "Tarjeta de Video Nvidia GeForce RTX2060 6GB\n" +
                    "Garantía: 1 año\n" +
                    "Laptop para videojuego\n" +
                    "Español Teclado",false))

        productos.add(ProductosCardView("Laptop Acer A315-23-R3UP Ryzer 5 3500U Ram 12GB DDR4 SSD 256GB 15.6 FHD Sin Sistema","S/ 3,999.00","2659",R.drawable.acerryzer,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Fabricante de Procesador AMD\n" +
                    "Tipo de Procesador Ryzen 5\n" +
                    "Modelo de procesador 3500U\n" +
                    "Velocidad de Procesador 2,10 GHz\n" +
                    "Núcleo de procesador Quad-Core (4 Core)Pantalla y gráficos\n" +
                    "Fabricante de Controlador Gráfico AMD\n" +
                    "Modelo de Controlador de Gráficos Radeon™ Vega 8\n" +
                    "Accesibilidad de Memoria Gráfica Compartida\n" +
                    "Tamaño de Pantalla 39,6 cm (15,6')\n" +
                    "Tipo de Pantalla LCD\n" +
                    "Tecnología de Pantalla ComfyView (Mate)\n" +
                    "Modo de Pantalla Full HD\n" +
                    "Tecnología de iluminación de Fondo LED\n" +
                    "Resolución de la Pantalla 1920 x 1080\n" +
                    "Memoria Memoria Estándar 12 GB\n" +
                    "Tecnología de memoria DDR4 SDRAM\n" +
                    "Lector de tarjeta memoria No\n" +
                    "Almacenamiento Capacidad Total 256 de la Unidad de Estado Sólido (SSD)\n" +
                    "Tipo de Unidad Óptica No\n" +
                    "Redes y Comunicaciones Estándar LAN sin Cable IEEE 802.11 ac\n" +
                    "Tecnología Ethernet Gigabit Ethernet\n" +
                    "Dispositivos Incorporados Micrófono Sí\n" +
                    "Lector de huellas digitales No\n" +
                    "Número de Altavoces 2\n" +
                    "Modo de sonido Estéreo\n" +
                    "Interfaces/Puertos HDMI Sí\n" +
                    "Número de puertos USB 2.0 1\n" +
                    "Número total de puertos USB 3\n" +
                    "Red (RJ-45) Sí\n" +
                    "Software Sistema Operativo UEFI Shell\n" +
                    "Dispositivo de Entrada Teclado Sí\n" +
                    "Descripción de la Alimentación\n" +
                    "Potencia máxima de alimentación 36 W\n" +
                    "Características Físicas\n" +
                    "Altura 19,90 mm\n" +
                    "Anchura 363,4 mm\n" +
                    "Profundidad 250,5 mm\n" +
                    "Peso (Aproximado) 1,90 kg\n" +
                    "Color Plata puro\n" +
                    "Contenido de la Caja\n" +
                    "Portátil Aspire 3 A315-23-R3UP\n" +
                    "Batería estándar\n" +
                    "Garantía",false))

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