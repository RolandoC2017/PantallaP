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

class Lenovo : Fragment() {

    companion object {
        fun newInstance() = Lenovo()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.lenovo_smartwatch, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(
            ProductosCardView("Lenovo S2 Pro Pantalla HD Reloj inteligente Impermeable - Negro","S/ 239.00","155",R.drawable.lenovos2,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Nombre del artículo: Lenovo S2 Pro Smartwatch\n" +
                    "Marca: Lenovo\n" +
                    "Modelo: S2Pro\n" +
                    "Tamaño de la pantalla: 1,69 pulgadas 240 * 280\n" +
                    "Sensores: aceleración de la gravedad, frecuencia cardíaca, temperatura\n" +
                    "Capacidad de la batería: 250 mAh.\n" +
                    "Voltaje de carga: 5 V\n" +
                    "Resistente al agua: IP67\n" +
                    "Material: ABS\n" +
                    "De color negro",false))

        productos.add(
            ProductosCardView("Lenovo S2 reloj inteligente,pulsera de 1,4 pulgadas,rastreador Fitness","S/ 359.00","179",R.drawable.lenovos2normal,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Resistente al agua: resistencia al agua diaria (no para la ducha y la natación).\n" +
                    "La vida resistente al agua,Cuerpo sellado, no es necesario quitar el reloj cuando esté lluvioso o inconsciente.\n" +
                    "2.5D curva HD de vidrio,Adopta vidrio HD curvado de arco 2.5D, alta transmitancia de luz, el tiempo es claramente visible, tan hermoso y atractivo.\n" +
                    "Carcasa de acero de aleación de,La carcasa está hecha de chorro de arena de aleación y proceso de recubrimiento iónico al vacío, con excelentes propiedades mecánicas y resistencia al desgaste, ligera, adecuada para el uso deportivo en la vida diaria.\n" +
                    "Correa de tela agradable a la piel,Adopta un paño Médico Deportivo antialérgico, antisudor transpirable, agradable para la piel y cómodo.\n" +
                    "Apoyo Android iOS APP,Aprox. Rango de 10-15m (el rango variará debido a los diferentes obstáculos)\n" +
                    "Llamada o mensaje a,Lenovo S2 vibrará cuando llegue una llamada u otra notificación de aplicación, presione brevemente o agite su cintura, se colgará, llevará una vida inteligente a partir de ahora.\n" +
                    "Gimnasio pista podómetro,Controla cada paso, enfoca tu salud física, logra tus objetivos de manera más eficiente y haz que tu entrenamiento sea más dinámico.",false))

        productos.add(
            ProductosCardView("Smartwatch Lenovo S2 Pro IP67 Ritmo Cardiaco Medición de Temperatura","S/ 299.00","267",R.drawable.lenovos2pro,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla a color HD de 1.69 pulgadas.\n" +
                        "Monitor de temperatura.\n" +
                        "Monitor de ritmo cardíacoAutonomía de hasta 15 días.\n" +
                        "Certificación IP67 contra salpicaduras y polvo23 modos de entrenamiento personal en la muñeca.\n" +
                        "Sensor de ritmo cardíaco dinámico de alto rendimiento y baja potencia puede medir datos rápidamente las 24 horas a través del sensor de luz verde.\n" +
                        "Notificaciones inteligentes, Whatsapp, SMS, alarmas, llamadas entrantes.",false))

        productos.add(
            ProductosCardView("Lenovo Kumii KU2S Reloj inteligente y Auriculares TWS","S/ 199.00","173",R.drawable.lenovokumi,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Chip principal: RK8762C\n" +
                    "Sensor de aceleración: Bosch BOSCH BMA421\n" +
                    "Frecuencia cardíaca: Tianyi Hexin HRS3300\n" +
                    "Versión de Bluetooth: 5.0\n" +
                    "Tamaño de pantalla: 1,69 pulgadas\n" +
                    "Resolución: 240 * 280\n" +
                    "Flash: 128 M + 64 M\n" +
                    "Capacidad de la batería: 200 mAh.\n" +
                    "Clasificación a prueba de agua: IP68\n" +
                    "Superficie de arco táctil 1.2.5D, pantalla grande de alta definición IPS de 1.69 pulgadas, alta resolución de 240 * 280 px\n" +
                    "2. Mercado de marcación en línea, puede combinar las esferas de colores que desee y puede personalizar la foto de su teléfono como fondo de pantalla de marcación\n" +
                    "3. La función de control de la salud integra el control de la frecuencia cardíaca, el control de la presión arterial y el control del sueño.\n" +
                    "4. Monitoreo, recordatorio y registro del ciclo menstrual de la mujer.\n" +
                    "5. Modos deportivos integrados: caminar, correr, andar en bicicleta, baloncesto, saltar, nadar, bádminton, fútbol y otros 8 modos deportivos\n" +
                    "6. 15 días de duración de la batería, 30 días en espera\n" +
                    "7. Clasificación impermeable IP68",false))

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