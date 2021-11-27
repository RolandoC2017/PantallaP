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

class Xiaomi : Fragment() {

    companion object {
        fun newInstance() = Xiaomi()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.xiaomi_smartwatch, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Smartwatch Xiaomi Mi Watch Lite-Negro","S/ 349.00","249",R.drawable.xiaomimi,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: XIAOMI\n" +
                    "GPS integrado: Sí\n" +
                    "Medición de valores corporales: Sí\n" +
                    "Memoria expandible: No aplica\n" +
                    "Memoria interna: No aplica\n" +
                    "Conexión Bluetooth: Sí\n" +
                    "Conexión WiFi: No\n" +
                    "Recepción de llamadas: No\n" +
                    "Resistente al agua: Sí\n" +
                    "Sistema operativo: De fabricante\n" +
                    "Sistema operativo compatible: Android/IOS\n" +
                    "Modelo: MI WATCH LITE\n" +
                    "Procesador: No aplica\n" +
                    "Ranura de memoria: No\n" +
                    "Duración aproximada de la batería: 9 dias\n" +
                    "Material de la pulsera: Sintético\n" +
                    "Color de la esfera: Negro\n" +
                    "Color de la pulsera: Negro\n" +
                    "Peso: 35 gr\n" +
                    "Incluye accesorios: No\n" +
                    "Hecho en: China\n" +
                    "Tipo: Smartwatch\n" +
                    "Garantía del proveedor: No tiene\n" +
                    "Información adicional: 1 año garantía\n" +
                    "Género: Unisex\n" +
                    "Tipo de pantalla: Digital\n" +
                    "Tamaño de la pantalla: 1.4 pulgadas\n" +
                    "Ajuste del brillo: Sí\n" +
                    "Alarma: Sí\n" +
                    "Batería: 230 mAh",false))

        productos.add(ProductosCardView("Reloj Mi Band 5 Xiaomi Pulsera Inteligente Versión Global - Negro","S/ 300.00","130",R.drawable.xiaomimiband5,
                "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: Xiaomi 100% Original - Mi Band 5 - XMSH10HM \n" +
                    "Vincularse mediante Mi Fit - Actualmente en Ingles / Chino. En algunas semanas estara a español\n" +
                    "Version: Multi-idioma (Español, Ingles, Ruso y mas) segun App Mi Fit\n" +
                    "Pantalla AMOLED a color de 1.1 /  Más de 100 esferas temáticas, papeles de pared personalizados \n" +
                    "Memoria interna: 16 MB / Bluetooth 5.0 \n" +
                    "Registro de pasos, calorías, distancia, ritmo cardíaco y sueño\n" +
                    "Ahora 11 Modo de ejercicio: yoga, equipo de ejercicio para remo y reducción de peso, cuerdas de salto, etc., mediante el seguimiento preciso y el análisis de Cada pose deportiva\n" +
                    "Requisitos del sistema: Android 4,4, IOS 9,0 o superior\n" +
                    "Conectividad: Via App Mi Fit - Bluetooth\n" +
                    "Salud de las mujeres: registros y recordatorios de Fisiología y ovulación\n" +
                    "Resistencia al polvo y al agua, con certificado 5ATM (Hasta 50 metros de profundidad)\n" +
                    "Bateria: 125 mAh de batería (hasta 14 días en espera - Aprox. 5 dias de uso)/ Tiempo de recarga: menos de 2 horas",false))

        productos.add(ProductosCardView("Reloj inteligente Xiaomi KUMI Magic GT3 resistente al agua para hombre","S/ 529.00","173",R.drawable.xiaomikumi,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla a color HD de -1,28 pulgadas totalmente táctil - Cuerpo de metal ultrafino Gestión de la salud - Recordatorio de llamadas y mensajes Múltiples modos deportivos.\n" +
                    "-Admite una variedad de combinaciones aleatorias de bisel, admite reemplazo de correa de 22 mm.Combinación gratuita de 3 biseles, trabajo de encuentro y uso diario.\n" +
                    "-Verifique la temperatura de su cuerpo en su muñeca en cualquier momento y en cualquier lugar; cuando la temperatura corporal supera el valor normal, aparece una advertencia automática.\n" +
                    "-Una variedad de estilos y diferentes temas para satisfacer sus diferentes necesidades de combinación de escenas, haciéndolo diferente en cada momento.\n" +
                    "-Hay una variedad de diales, según sus necesidades, conecte la APLICACIÓN para sincronizar el dial, libre de cambiar.",false))

        productos.add(ProductosCardView("Xiaomi Eco Mibro Lite Reloj Inteligente 1.3 Pulgada Amoled SpO2","S/ 319.00","209",R.drawable.xiaomieco,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Diaplay:1,3 pulgadas Amoled círculo de color HD pantalla\n" +
                    "Vida de la batería:8 días para el modo diario, 10 días para el modo básico\n" +
                    "Puerto de carga:Magnético de puerto de carga\n" +
                    "Bluetooth:Bluetooth V5.0\n" +
                    "Sensor:Sensor óptico de frecuencia cardíaca, sensor Spo2, acelerómetro\n" +
                    "Temperatura de funcionamiento:-20 ℃ ~ 45 ℃\n" +
                    "APP:Mibro Fit\n" +
                    "APP:Compatible con Android 5,0 y superior, IOS10.0 y superior (las funciones varían con modelos de relojes específicos, teléfonos móviles y países)\n" +
                    "Ver idiomas:Chino simplificado, inglés, francés, español, portugués, ruso, japonés, coreano, tailandés, árabe, indonesio, vietnamita, turco, alemán, italiano, polaco, (persa)\n" +
                    "Idiomas:Chino simplificado, inglés, francés, español, portugués, ruso, japonés, coreano, tailandés, árabe, indonesio, vietnamita, turco, alemán, italiano, polaco, (persa)\n" +
                    "¿Recordatorio de mensajes: SMS Gmail Skype Twitter Facebook WhatsApp Instagram VK Snapchat?\n" +
                    "Mensaje Idioma:Idioma sincronizado con el firmware del reloj",false))

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