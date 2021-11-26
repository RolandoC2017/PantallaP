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

class Haylou : Fragment() {

    companion object {
        fun newInstance() = Haylou()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.haylou, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("SmartWatch Haylou LS02 Negro Reloj Inteligente","S/ 190.00","129",R.drawable.haylouls02,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Posee una pantalla TFT LCD de 1.4″ con resolución de 320 x 320 píxeles y cristal 2.5 D.\n" +
                    "Posee resistencia IP68. Es resistente al sudor, a la lluvia, e incluso podrás lavarte las manos o ducharte con él puesto.\n" +
                    "Cuenta con 12 modos deportivos: Jogging, caminar rápido, ciclismo, senderismo, bicicleta estática, yoga, correr en cinta, musculación, gimnasia, baloncesto, fútbol y remo.\n" +
                    "Su batería de 260 mAh te ofrece una duración máxima de hasta 20 días.\n" +
                    "Su diseño rectangular queda enmarcado por un cuerpo fino y ligero, que pesa tan solo 38 gramos. También posee un botón físico en la parte lateral, con el que podemos bloquear y desbloquear su pantalla cómodamente.\n" +
                    "Bluetooth 5.0.\n" +
                    "Sistemas operativos: Android 4.4 o superior, iOS 8.0 o superior\n" +
                    "Funciones: Información y alerta sobre llamadas, mensajes y notificaciones (conectado al BT del smartphone), Sensor de ritmo cardíaco 24/7, Monitorización del sueño, Recordatorio de sedentarismo, Modo multi-deporte, Alarma/despertador, Contador de calorías, Contador de pasos y distancia, Recopilación de datos.\n" +
                    "Tipo de carga: Micro USB.\n" +
                    "Idiomas: Multilenguaje (Inglés, alemán, español, italiano, francés, portugués – Portugal, ruso, turco).\n" +
                    "APP recomendada: Haylou Fit APP (multilenguaje) (Android e iOS).\n" +
                    "Dimensiones y peso: Medidas: 4.8 x 3.6 x 1.15 cm.\n" +
                    "Peso: 35 gramos.\n" +
                    "Correa: Silicona (Intercambiable 20 mm).\n",false))

        productos.add(ProductosCardView("Smartwatch Haylou Solar LS05 versión Global Acuatico Original","S/ 199.00","158",R.drawable.haylouls05,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Para Lima el Envio es Gratis\n" +
                    "EN STOCK ENVIO INMEDIATO\n" +
                    "(Solar LS05 - Es el Modelo del Reloj)\n" +
                    "Pantalla: pantalla LCD de 1.28 pulgadas con 3 Niveles de Brillo Ajustable\n" +
                    "Sistema operativo compatible: Android 4.4 / iOS 8 o superior.\n" +
                    "Notificaciónes de llamadas y mensajes de redes sociales \n" +
                    "Acuatico hasta 50 metros profundidad \n" +
                    "Funciones: seguimiento del sueño, ritmo cardiaco, calorias, pasos, seguimiento de la actividad física en general.\n" +
                    "Notificaciones de llamadas, mensajes, recordatorios y mucho mas\n" +
                    "Sensores: monitor de frecuencia cardíaca, seguimiento del sueño\n" +
                    "Colores: negro",false))

        productos.add(ProductosCardView("Haylou RS3 LS04 Reloj inteligente AMOLED SpO2 GPS Ritmo cardiaco","S/ 390.00","273",R.drawable.haylours3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "[Pantalla AMOLED HD] Pantalla grande HD, campo de visión ultra claro, único, compatible con diales personalizados y la interfaz de la aplicación se actualiza continuamente.\n" +
                    "[GPS Sony preciso] El módulo GPS de bajo consumo de Sony puede localizar con precisión la pista de movimiento.\n" +
                    "[Control de salud] Controle y registre automáticamente su frecuencia cardíaca y datos de oxígeno en sangre. Notificarle de su salud en cualquier momento y lugar.\n" +
                    "[Monitoreo del sueño] Registre automáticamente la duración del sueño y analice la calidad de su sueño. Le ayuda a ajustar el tiempo de descanso para obtener una mejor calidad de sueño.\n" +
                    "[12 modos deportivos] Admite 14 modos deportivos, como correr, andar en bicicleta, baloncesto, etc., para satisfacer sus diferentes necesidades deportivas.\n" +
                    "[Smart Reminder] Brinda visualización simultánea de mensajes, llamadas entrantes o aplicaciones sociales para recordarle información importante.\n" +
                    "[5ATM resistente al agua] Se puede usar para lavarse las manos o cuando llueve, y se puede adaptar fácilmente a varios entornos.\n" +
                    "[Más funciones] Recuento de pasos, control de música, pronóstico del tiempo, despertador, búsqueda de teléfonos móviles, etc.",false))

        productos.add(ProductosCardView("Smartwatch Haylou LS01 versión Global Acuatico 9 modos deportivos","S/ 199.00","179",R.drawable.haylouls01,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Para Lima el Envio es Gratis\n" +
                    "EN STOCK ENVIO INMEDIATO\n" +
                    "Pantalla: pantalla LCD de 1.3 pulgadas.\n" +
                    "Resolución: 240 x 240 píxeles.\n" +
                    "Batería: 210 mAh.\n" +
                    "Conectividad: Bluetooth 4.2\n" +
                    "Sistema operativo compatible: Android 4.4 / iOS 8 o superior.\n" +
                    "Notificaciónes de llamadas y mensajes de redes sociales \n" +
                    "Acuatico hasta 20 metros profundidad \n" +
                    "Funciones: seguimiento del sueño, seguimiento de la actividad física.\n" +
                    "Sensores: monitor de frecuencia cardíaca, seguimiento del sueño\n" +
                    "9 modos deportivos\n" +
                    "Peso: 34 gramos\n" +
                    "Dimensiones: 40.9 x 35.7 x 11.6 mm\n" +
                    "Colores: negro",false))

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