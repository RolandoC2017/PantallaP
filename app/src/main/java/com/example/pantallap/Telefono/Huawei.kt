package com.example.pantallap.Telefono

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class Huawei : Fragment() {

    private lateinit var linear: LinearLayout

    companion object {
        fun newInstance() = Huawei()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.huawei, container, false)

        //linear = root.findViewById<LinearLayout>(R.id.pop1)

       // linear!!.setOnClickListener { startActivity(Intent(context, InfoHuawei1::class.java)) }

        var recyclerView:RecyclerView = root.findViewById<RecyclerView>(R.id.recycle2)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Huawei Mate 30 Pro 256GB 8GB RAM Plata","S/ 4,599.00","3299",R.drawable.huaweimate,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: AMOLED de 6,53 pulgadas 18,5:9 con resolución / 1.176 x 2.400 píxeles (409 ppp)\n" +
                    "Procesador: Kirin 990 7 nanómetros\n" +
                    "Memoria RAM: 8GB (12 GB Porsche Edition)\n" +
                    "Almacenamiento Interno: 256GB (ampliables mediante tarjeta NM Card)\n" +
                    "Cámara Trasera: Sensor de 40MP de 1/1,54 pulgadas (Cine Camera) f/1.8, 18 mm - Sensor de 40 MP de 1/1,7 (SuperSensing Camera) f/1.6, 27 mm, OIS - Ultra gran angular con sensor de 16 megapíxeles - Teleobjetivo con sensor de 8 megapíxeles f/2.4, OIS\n" +
                    "Cámara Frontal: Sensor de 32 MP f/2.0 + TOF\n" +
                    "Bateria: 4.500 mAh, con carga rápida 40W, carga inalámbrica y soporte de carga inalámbrica inversa\n" +
                    "Conectividad: Wifi a/b/g/n/ac, NFC. BT 5.0 aptX HD LE, USB tipo-C, GALILEO, GLONASS, GPS dual-band\n" +
                    "Software: Android 10 con EMUI 10\n" +
                    "Otros: Lector de huellas en pantalla, 3D Face ID, sonido por pantalla\n" +
                    "Dimensiones y Peso: 158,1 x 73,1 x 8,8 mm, 198 gramos\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: HU445EL125E5ULPE\n" +
                    "Modelo: Mate 30 Pro\n" +
                    "Peso: 0.2\n" +
                    "Color: plata\n" +
                    "Garantía del producto: Garantía por fallas o desperfectos de fabrica de 6 meses\n" +
                    "Condición del producto: Nuevo\n" +
                    "Detalle condición física del producto: Equipo nuevo sellado\n" +
                    "Tamaño de la pantalla (pulg): 6.4\n" +
                    "Velocidad del procesador (Ghz): 2.60\n" +
                    "Qué hay en la caja: equipo celular, cargador rapido, cable de datos tipo C, audífonos, funda protectora transparente, manual, pin para extracción de sim",false))

        productos.add(ProductosCardView("Huawei P40 128GB 8GB AZUL","S/ 2,699.00","2399",R.drawable.huaweip40,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño de Pantalla 6,1 Full HD OLED\n" +
                    "Memoria RAM: 8 GB\n" +
                    "Capacidad: 128 GB Almacenamiento\n" +
                    "Procesador: Kirin 990\n" +
                    "Cámara frontal: 32 MP\n" +
                    "Cámara trasera: 50 MP\n" +
                    "Garantía: 1 Año\n" +
                    "Batería 3800 mAh\n" +
                    "Sistema Operativo: Android.\n" +
                    "Marca: Huawei.\n" +
                    "EMUI 10.1 basado en Android 10 AOSP, es decir, sin los servicios de Google, reemplazando el Play Store por el AppGallery (Huawei Mobile Services)\n" +
                    "Modelo: P40.\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: HU445EL0YR38ALPE\n" +
                    "Peso (kg): 0.5\n" +
                    "Color: Azul\n" +
                    "Condición del producto: Nuevo\n" +
                    "Qué hay en la caja: celular, cargador, boleta" ,false))

        productos.add(ProductosCardView("Huawei P30 Pro 256GB-Black","S/ 3,999.00","2799",R.drawable.huaweip30,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "RAM: 8GB\n" +
                    "ROM: 256GB\n" +
                    "Procesador: HiSilicon Kirin 980\n" +
                    "Pantalla: 6.47 pulgadas\n" +
                    "Cámara principal: 40MP + 20MP + 8MP + TOF 3D\n" +
                    "Cámara frontal: 32MP\n" +
                    "Editor de vídeos con IA\n" +
                    "Sistema operativo: Android 9.0 (Pie); EMUI 9\n" +
                    "Sensor de huellas integrado en pantalla\n" +
                    "Resistencia al agua IP68\n" +
                    "Single Sim\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: HU445EL1KVJ5ELPE\n" +
                    "Modelo: P30Pro\n" +
                    "Peso (kg): 0.3\n" +
                    "Color: negro\n" +
                    "Garantía del producto: 1 año \n" +
                    "Condición del producto: Nuevo\n" +
                    "Qué hay en la caja: smartphone, manual, cable, cargador, audifonos",false))

        productos.add(ProductosCardView("HUAWEI Y9A 128gb 6gb Ram Dual Sim","S/ 1,299.00","1250",R.drawable.huaweiy9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño: Ancho 76.5mm, Altura 163.5mm, Profundidad 8.95mm\n" +
                    "Cámara: Cámara trasera de 64 MP (apertura f/1.8) + 8 MP (lente ultra gran angular de 120°, apertura f/2.4) + 2 MP (lente de profundidad, apertura f/2.4) + 2 MP (lente macro, apertura f/2.4)Cámara frontal:16 MP, apertura f/2.2\n" +
                    "Pantalla: Tamaño de 6.63 pulgadas, Con un diseño de esquinas redondeadas en la pantalla, la longitud diagonal de la pantalla es de 6.63 pulgadas cuando se mide de acuerdo con el rectángulo estándar (el área visible real es ligeramente más pequeña).Color:16.7 millones de coloresTipo:TFT LCD (IPS)\n" +
                    "Procesador: MediaTek Helio G80CPU:Procesador Octa-core2 x Cortex-A75 2.0 GHz + 6 x Cortex-A55 1.8 GHz\n" +
                    "Sistema Operativo: EMUI 10.1.1 (Basado en Android 10)" +
                    "Memoria: 6 GB de RAM + 128 GB de ROMSoporte de memoria externa:Tarjeta NM Card, hasta 256 GB\n" +
                    "Bateria: 4,300 mAhCARGAHUAWEI SuperCharge 22.5 W\n" +
                    "Sensores: Sensor de luz ambiental, Giroscopio, Brújula, Sensor de gravedad, Sensor de huellas dactilares\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: HU445EL1IFANBLPE\n" +
                    "Modelo: Y9A\n" +
                    "Color: Negro\n" +
                    "Garantía del producto: 1 año\n" +
                    "Condición del producto: Nuevo\n" +
                    "Velocidad del procesador (Ghz): 23.00",false))

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