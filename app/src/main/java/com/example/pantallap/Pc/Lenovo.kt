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

class Lenovo : Fragment() {

    companion object {
        fun newInstance() = Lenovo()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.lenovo, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.pcrecycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop Lenovo Ideapad 3 15 - Abyss Blue - Intel I3 - 12 Gb - 256 GB","S/ 2,899.00","2199",R.drawable.lenovoideapad3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                        "Procesador: 10ma generación Intel® Core™ i3-1005G1 (4M Cache, 1.20 GHz hasta 3.40 GHz con Turbo Boost, Cores: 2, Threads: 4)\n" +
                        "Sistema Operativo: Windows 10 Home Single Language 64 \n" +
                        "Pantalla: 15.6' HD (1366x768), TN Anti Reflejante, 220 nits \n" +
                        "Memoria: 4 GB DDR4 2666MHz Soldada + 8 GB SO-DIMM DDR4 2666MHz\n" +
                        "Almacenamiento: 256GB SSD (Solid State Drive), M.2, 2242, PCIe NVMe, TLC Garantía 1 año Depósito o con Transporte Puedes mejorarla o extenderla en el siguiente paso.Adaptador de Corriente 65W Round Tip Tarjeta Gráfica Gráficos integrados Batería2 celdas, 35Wh Cámara 0.3MP con PrivacyShutterLector de huellas digitales, No Incluido Teclado, No Retroiluminado, Español (LA) Dispositivo de Puntero Click Pad Conectividad Intel® Wireless 9560 11ac (2x2) & Bluetooth® 5.0Near Field CommunicationNo",false))

        productos.add(ProductosCardView("Lenovo 15 FHD Core i7 11va ( 12gb + 512 SSD ) Notebook Touch Intel Win 10 BLUE","S/ 4,936.00","3999",R.drawable.lenovo15fhd,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Lenovo 15' FHD Core i7 11va (12gb + 512 SSD) Notebook Tocuh Intel Win 10 ABYSS AZUL\n" +
                    "Procesador: Intel Core i7-1165G7 (2.8 - 4.7 Ghz) 12 MB\n" +
                    "Memoria: 12 GB de RAM\n" +
                    "Disco SOLIDO: SSD de 512 GB\n" +
                    "Placa de video: Gráficos Intel® Iris® X?\n" +
                    "Pantalla: Pantalla táctil IPS FHD con retroiluminación LED de 15,6' (1920 x 1080)\n" +
                    "Sistema Operativo: Windows 10 US Home\n" +
                    "Peso: 1,7 kg\n" +
                    "Garantía: 12 meses ",false))

        productos.add(ProductosCardView("All in One Lenovo Ci3 4GB 1TB HDD 23.8 Full HD","S/ 3,099.00","1699",R.drawable.lenovoallinone,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: Lenovo\n" +
                    "Tamaño de pantalla: 23.8\"\n" +
                    "Procesador: Intel Core i3 - 10100T\n" +
                    "Sistema operativo: Windows 10 Home\n" +
                    "Memoria RAM: 4GB\n" +
                    "Disco duro: 1TB HDD\n" +
                    "Velocidad del procesador: 3.0 GHz\n" +
                    "Tarjeta gráfica: Intel UHD Graphics (Integrada)\n" +
                    "Velocidad máxima del procesador: 3.8 GHz\n" +
                    "Núcleos del procesador: 4\n" +
                    "Memoria cache: 6MB\n" +
                    "Pantalla touch: No\n" +
                    "Cámara web: Si\n" +
                    "Unidad óptica: No\n" +
                    "Puertos externos: 2 x USB 3.2, 2x USB 2.0, Audio Jack, Ethernet, Lector de tarjetas\n" +
                    "Sonido: Dolby audio\n" +
                    "Conectividad: Wifi + Ethernet\n" +
                    "Teclado alámbrico\n" +
                    "Lector SD: 3 en 1 (SD, SDHC, SDXC)\n" +
                    "Lector CD: No\n" +
                    "Bluetooth: 5.0\n" +
                    "Características adicionales: Cámara 720p con obturador de privacidad\n" +
                    "Medidas del producto: (Anch) 54.1cm x (Prof) 18.5cm x (Alt) 44.6cm\n" +
                    "Peso: 5.9 Kg\n" +
                    "Garantía del proveedor: 1 año",false))

        productos.add(ProductosCardView("Computadora Lenovo Thinkcentre M920s Core I7-8700 3.20ghz 8gb Ddr4 1tb Sata","S/ 9,314.00","5863",R.drawable.lenovocomputadorathinkcentre,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Formato: Factor De Forma Pc\n" +
                    "Marca: Lenovo\n" +
                    "Modelo: Thinkcentre M920s\n" +
                    "Numero De Parte: 10sks16700\n" +
                    "Sistema Operativo: Version Windows 10 Pro 64 Bits / Idioma EspaÑol\n" +
                    "Procesador: Intel Core I7 8700 3.20 Ghz 12 Mb L3\n" +
                    "Memoria Ram: Capacidad 8 Gb / Tipo Ddr4 / Bus 2666 Mhz\n" +
                    "Chipset: Modelo Intel Q370\n" +
                    "Almacenamiento: Disco Duro Capacidad 1 Tb / Velocidad 7200 Rpm / Interfaz / Velocidad Sata 6.0 Gb/s\n" +
                    "Optico: Unidad Optica Dvd Supermulti\n" +
                    "Tarjetas Integradas: Video Intel Hd Graphics 630 / Network Velocidad 10/100/1000 Mb/s\n" +
                    "Puertos: Posterior Video Db-15 ( 1 ) / Display Port ( 2 ) / Serial ( 1 ) / Usb 3.1 Gen 1 ( 4 ) / Rj-45 ( 1 ) / Line Out ( 1 ) / Frontal Microfono ( 1 ) / Jack Combo Audio/microfono ( 1 ) / Usb 3.1 Gen 1 ( 2 ) / Usb 3.1 Gen 2 ( 2 ) / Usb 3.1 Tipo C Gen 1 ( 1 )\n" +
                    "Voltaje De Alimentacion: Potencia (w)   210 W\n" +
                    "Caracteristicas Fisicas Ordenador: Formato Desktop Sff / Dimensiones (cm) Alto ( 29.05 ) / Ancho ( 9.25 ) / Profundidad ( 34.35 )\n" +
                    "Botones: Power\n" +
                    "Teclado: Idioma EspaÑol / Interfaz Usb\n" +
                    "Mouse: Tipo Optico / 2 Botones + Rueda / Interfaz Usb\n" +
                    "Software Pre-instalado:",false))

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