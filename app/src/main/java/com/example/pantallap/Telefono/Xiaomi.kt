package com.example.pantallap.Telefono

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

class Xiaomi : Fragment() {

    companion object {
        fun newInstance() = Xiaomi()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.xiaomi, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle6)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Xiaomi Poco X3 Pro 6GB 128GB","S/ 1,299.00","1149",R.drawable.xiaomipocox3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño de Pantalla 6,67 \"FHD\n" +
                    "Memoria RAM: 6 GB\n" +
                    "Capacidad: 128 GB Almacenamiento\n" +
                    "Procesador: Snapdragon 860\n" +
                    "Cámara frontal: 20 MP\n" +
                    "Cámara trasera: 48 MP + 8 MP + 2 MP\n" +
                    "Garantía: 1 año\n" +
                    "Tecnología: IPS.\n" +
                    "Cristal Corning Gorilla Glass 6.\n" +
                    "Batería: 5160 mAh.\n" +
                    "Carga rápida de 33 W.\n" +
                    "Puerto USB C.\n" +
                    "Altavoces estéreo.\n" +
                    "Certificación Hi-Res Audio.\n" +
                    "Jack 3.5 mm de auriculares.\n" +
                    "Lector de huellas lateral.\n" +
                    "Versión de Android: 11.\n" +
                    "Capa de personalización: MIUI.",false))

        productos.add(ProductosCardView("Xiaomi Poco M3 Pro 6GB 128GB 5G telefono M2103K19PG - Negro","S/ 1,199.00","859",R.drawable.xiaomipocom3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "CPU: CPU Dimensity 700 Octa Core, hasta 2.2GHz\n" +
                    "Pantalla: 6.5 2400x1080P FHD + DotDisplay, frecuencia de actualización de 90Hz\n" +
                    "RAM + ROM: 6GB + 128GB\n" +
                    "Cámara: cámara trasera triple de 48MP + 2MP + 2MP, cámara frontal de 8MP\n" +
                    "Batería: 5000 mAh (tipo), admite carga rápida de 18 W, cargador rápido de 22,5 W en la caja\n" +
                    "Sistema operativo: MIUI, versión global, compatible con varios idiomas y Google Play\n" +
                    "Otros: Wi-FI, Bluetooth 5.1, GPS, ID de huella digital, Desbloqueo facial AI, Conector para auriculares de 3,5 mm, IR Blaster, NFC\n" +
                    "Red Netcom completo, doble SIM de doble modo de espera\n" +
                    "5G: n1, n3, n7, n8, n20, n28, n38, n40, n41, n66, n77, n78\n" +
                    "4G: LTE FDD B1 / 2/3/4/5/7/8/12/17/20/28/32/66\n" +
                    "4G: LTE TDD B38 / 40/41\n" +
                    "3G: WCDMA B1 / 2/4/5/8\n" +
                    "2G: GSM 850 900 1800 1900 MHz",false))

        productos.add(ProductosCardView("Xiaomi Redmi Note 9 Pro 6GB 128GB M2003J6B2G 4G LTE Smartphone","S/ 1,229.00","899",R.drawable.xiaomiredminote9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "CPU Snapdragon 720G Octa Core\n" +
                    "RAM: 6 Gb\n" +
                    "Almacenamiento interno: 128GB\n" +
                    "Cámara principal de 64MP + 8MP + 5MP + 2MP\n" +
                    "Cámara frontal de 16MP\n" +
                    "Bateria: 5020mAh admite carga rápida de 30W\n" +
                    "Sistema Operativo: MIUI Version Global\n" +
                    "WIFI, Bluetooth 5.0\n" +
                    "2G: GSM B2 / 3/5/8\n" +
                    "3G: WCDMA B1 / 2/4/5/8\n" +
                    "4G: FDD LTE B1 / 2/3/4/5/7/8/20/28; TDD LTE 38/40",false))

        productos.add(ProductosCardView("Xiaomi Redmi Note 10 Pro 8GB 128GB 108MP NFC Smartphone M2101K6G - Naranja","S/ 1,899.00","1489",R.drawable.xiaomiredminote10,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Qualcomm® Snapdragon ™ 732G\n" +
                    "CPU de ocho núcleos, hasta 2,3 GHz\n" +
                    "8GB RAM + 128GB ROM\n" +
                    "Lente Telemacro de cámara cuádruple de 108MP，16 MP para • ƒ / 2,45\n" +
                    "Pantalla AMOLED de 120 Hz de 6,67 pulgadas con puntos\n" +
                    "LTE FDD: B1 / 2/3/4/5/7/8/20/28/32\n" +
                    "LTE TDD: B38 / 40/41 (MHz 2535-2655)\n" +
                    "WCDMA: 1/2/4/5/8\n" +
                    "GSM: 850/900/1800/1900\n" +
                    "Carga rápida de 33 W, batería de 5020 mAh (típica)",false))

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