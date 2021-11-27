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

class Huawei : Fragment() {

    companion object {
        fun newInstance() = Huawei()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.huawei_smartwatch, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(
            ProductosCardView("Smartwatch Huawei Watch Gt 2E -Negro","S/ 599.00","459",R.drawable.huaweiwatchgt,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla táctil de 1.39 AMOLED, 454 x 454 píxeles\n" +
                    "Batería hasta por 2 semanas (30 horas cuando el GPS está activado)\n" +
                    "Integrado con micrófono, acelerómetro, giroscopio, barómetro, Sensor geomagnético. Rastrea, monitorea e identifica los tipos de actividad diaria, y proporciona datos sobre el recuento de pasos, la cantidad de calorías quemadas y los tiempos de actividad de intensidad moderada y alta.\n" +
                    "Resistente hasta 50 metros bajo el agua. Apto para piscinas o en el mar (no apto para snorkel, duchas calientes, aguas termales, saunas, baños de vapor, buceo, esquí acuático y otras actividades de alta velocidad en aguas o aguas profundas).\n" +
                    "Compatible con Android 4.4 o posterior y iOS 9.0 o posterior\n" +
                    "Tienda Oficial Huawei\n" +
                    "Garantía de 12 meses por Huawei Perú",false))

        productos.add(
            ProductosCardView("Huawei Smartwatch Band 6 Verde + Red Bottle Glass","S/ 299.00","169",R.drawable.huaweiband6,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Dimensiones: 43 x 25.4 x 10.99 mm\n" +
                    "Peso: 18 g. aprox. (sin la correa)\n" +
                    "Pantalla: 1.47 pulgadas AMOLED\n" +
                    "Sensores: Acelerómetro, Giroscopio , Sensor óptico de frecuencia cardiaca\n" +
                    "Puerto de Carga: Base de carga magnética\n" +
                    "Requerimientos de Sistema: Android 6.0 o posterior / IOS 9.1 o posterior\n" +
                    "Nivel de Impermeabilidad: 5ATM Resistente al agua\n" +
                    "Duración de la Batería: 14 días para uso típico",false))

        productos.add(
            ProductosCardView("Smartwatch Huawei Watch Fit Mini Cafe","S/ 439.00","389",R.drawable.huaweifit,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla 1.47” AMOLED, 194 x 368, 282 PPI, 0.95mm biselultra estrecho\n" +
                        "12 cursos de entrenamiento fitness\n" +
                        "96 modos de entrenamiento\n" +
                        "14 días de autonomía.\n" +
                        "Monitoreo del seguimiento de Sueño TruSleep™\n" +
                        " Monitoreo de Saturación SpO2\n" +
                        "Monitoreo de estrés TruSleep™\n" +
                        "Resistencia al Agua 5 ATM\n" +
                        "Garantía de 12 meses por Huawei ",false))

        productos.add(
            ProductosCardView("Huawei Smartwatch Band 4 - Negro","S/ 199.00","149",R.drawable.huaweiband4,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño del cuerpo de la banda (largo x ancho x alto): 56 mm × 18.5 mm × 12.5 mm\n" +
                    "Peso aproximadamente 24 g (incluida la correa para la muñeca)\n" +
                    "Pantalla 0.96 ”, resolución: 80 x 160 píxeles.\n" +
                    "Cubierta frontal de plástico y correa de caucho de silicona\n" +
                    "Batería 91 mAh, tiempo de carga: aproximadamente 1.5 horas. Duracion hasta 9 dias \n" +
                    "Sistemas operativos compatibles: Android 4.4 o posterior, iOS 9.0 o posterior\n" +
                    "Puerto de carga USB\n" +
                    "Resistencia al agua 5ATM\n" +
                    "Bluetooth 4.2\n" +
                    "Control de botones: Pantalla completa táctil + tecla de inicio\n" +
                    "Incluye: banda × 1, guía de inicio rápido, información de seguridad y tarjeta de garantía\n" +
                    "12 meses de Garantia por Huawei Peru",false))

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