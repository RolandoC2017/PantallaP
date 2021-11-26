package com.example.pantallap.Smartwatch

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

class Honor : Fragment() {

    companion object {
        fun newInstance() = Honor()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.honor, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("HONOR Smartwatch Band 6 Meteorite Black","S/ 239.00","189",R.drawable.honorband6,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Microprocesador: Apollo3.5\n" +
                    "Capacidad de batería: 180 mAH\n" +
                    "Duración de batería: Aproximadamente 14 días\n" +
                    "Pantalla: AMOLED con resolución 194 x 368 pixeles\n" +
                    "Tiempo de carga: Alrededor de 65 minutos\n" +
                    "Memoria: 128 MB\n" +
                    "Material de la banda: Goma de Silicona\n" +
                    "Tamaño: 43 mm x 25.4 mm x 11.45 mm (Alto x Ancho x Largo)\n" +
                    "Bluetooth: 2,4GHz, BT5.0, BLE\n" +
                    "Sensor: Sensor IMU de 6 ejes (sensor de acelerómetro, sensor de giroscopio) y sensor óptico de frecuencia cardíaca\n" +
                    "Tipo de carga: Magnética\n" +
                    "Peso: Alrededor de 18g\n" +
                    "Botón: Pantalla táctil completa + botón lateral\n" +
                    "Resistencia al agua: 5ATM\n" +
                    "Temperatura Ambiental: Temperatura ambiente de funcionamiento: -10 ℃ a 45 ℃\n" +
                    "Compatibilidad: Android 5.0 o en adelante / iOS 9.0 o en adelante\n" +
                    "Color: Negro Meteorito",false))

        productos.add(ProductosCardView(" Honor Band 6 Blood Oxygen Spo2 Ritmo cardiaco - Gris","S/ 289.00","199",R.drawable.honorband6blood,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: Pantalla AMOLED de 1,47 \".\n" +
                    "Batería: 14 días de duración de la batería.\n" +
                    "Resistencia al agua: Resistencia al agua de 5 ATM.\n" +
                    "Sistema: Android 5.0, IOS 10 o superior.\n" +
                    "Conectivo: Bluetooth 5.0.\n" +
                    "Operación: Pantalla completa táctil + botón lateral.\n" +
                    "Monitoreo saludable: Monitoreo de frecuencia cardíaca las 24 horas.",false))

        productos.add(ProductosCardView("Reloj inteligente para niños HONOR K 2, pantalla TFT de 1.3 inch","S/ 1,372.00","457",R.drawable.honork2,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Reloj para niños Huawei Honor K 2\n" +
                    "Reloj para niños con pantalla TFT de 1,3 pulgadas\n" +
                    "Support Seven Reposicionamiento del reloj para niños\n" +
                    "Admite llamadas de voz / SOS de una tecla / contador de pasos",false))

        productos.add(ProductosCardView("Honor Band 5 Pulsera Deportiva Inteligente","S/ 253.00","201",R.drawable.honorband5,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                     "Sistema a juego: Android 4.4 y superior, iOS 9.0 y superior\n" +
                    "Capacidad de la batería: 91 mAh (valor típico)\n" +
                    "Tamaño de pantalla: 0,96 pulgadas\n" +
                    "Tiempo de trabajo: alrededor de 7 días.\n" +
                    "Tiempo de carga: aproximadamente 1,5 horas (a una temperatura ambiente de 25 ° C)\n" +
                    "Puerto de carga: puerto de carga USB\n" +
                    "Sensor: sensor inercial de 3 ejes; sensor óptico de frecuencia cardíaca; sensor de detección de uso de luz infrarroja\n" +
                    "Botón: táctil de pantalla completa + botón de inicio\n" +
                    "Pantalla: pantalla TFT, pantalla a color\n" +
                    "Protección de seguridad: 50 metros a prueba de agua\n" +
                    "Temperatura de trabajo: -10 ℃ ～ + 45 ℃\n" +
                    "Grado impermeable: soporte 5ATM grado impermeable\n" +
                    "Material de la pulsera: silicona\n" +
                    "Dimensiones: 56 mm × 18,5 mm × 12,5 mm (tamaño del cuerpo); 123 mm + 85 mm (longitud de la muñequera)\n" +
                    "Peso: aproximadamente 24 g (incluida la muñequera)\n" +
                    "Píxeles de pantalla: 160 píxeles × 80 píxeles\n" +
                    "Modo de control: pantalla completa táctil + botón de inicio\n" +
                    "Lista de empaque: 1 * pulsera, 1 * manual en chino e inglés, 1 * caja de cartón\n" +
                    "Método de embalaje: en caja\n" +
                    "Peso del paquete: 0,1 kg",false))

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