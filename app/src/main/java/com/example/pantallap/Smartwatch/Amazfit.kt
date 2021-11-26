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

class Amazfit : Fragment() {

    companion object {
        fun newInstance() = Amazfit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.amazfit, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleSmart)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Amazfit GTS 3 Reloj inteligente Bluetooth SmartWatch","S/ 999.00","699",R.drawable.amazfitgts3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Amazfit-reloj inteligente GTS 3 GTS3 GTS-3 Zepp OS, dispositivo con Pantalla AMOLED de 2021 pulgadas, batería de 12 días, para Android, novedad de 1,75\n" +
                    "Diseño\n" +
                    "Diseño\n" +
                    "Marca: Amazfit\n" +
                    "Modelo: GTS 3\n" +
                    "Color: Negro medianoche, Gris urbano, Dorado arena\n" +
                    "Tamaño (versión cuadrada): 42,8 × 35,6 × 9,7 mm\n" +
                    "Peso: 24,7 g (sin correa)\n" +
                    "Cuerpo: Aleación de aluminio\n" +
                    "Armazón inferior: Plástico\n" +
                    "Botones: 1 botón\n" +
                    "Grado de impermeabilidad: 5 ATM\n" +
                    "Pantalla\n" +
                    "Material: AMOLED\n" +
                    "Tamaño: 1,75 pulgadas,La pantalla representó el 71%\n" +
                    "Resolución: 348 x 442\n" +
                    "Pantalla táctil: Cristal templado + recubrimiento antihuellas + recubrimiento oDLC\n" +
                    "Resistencia\n" +
                    "Capacidad de la batería: 246 mAh (valor típico)\n" +
                    "Método de carga: Base de carga magnética\n" +
                    "Tiempo de carga: 2 horas aproximadamente\n" +
                    "Duración de la batería en modo de uso diario: 7 días\n" +
                    "Modo de larga duración de la batería: 20 días\n" +
                    "Sensor\n" +
                    "Salud: Sensor de datos biológicos, BioTrackerTM 2 PPG\n" +
                    "(incluye oxígeno en sangre) desarrollado por Huami\n" +
                    "Movimiento: Sensor de presión de aire, Sensor de aceleración, Sensor giroscópico, Sensor geomagnético, Sensor de luz ambiental\n" +
                    "Conexión: Bluetooth 5.0, WLAN 2.4GHz\n" +
                    "Correa\n" +
                    "Material: Silicona\n" +
                    "Ancho: 20 mm\n" +
                    "Cierre: Hebilla clásica\n" +
                    "Otros\n" +
                    "Altavoz: Incluido\n" +
                    "Micrófono: Incluido\n" +
                    "Motor lineal: Incluido\n" +
                    "Dispositivos compatibles: Android 5.0 o iOS 10.0 y versiones superiores\n" +
                    "Aplicación: Aplicación Zepp\n" +
                    "Lista de componentes: Cuerpo del reloj (correa estándar incluida), Base de carga, Manual de instrucciones",false))

        productos.add(ProductosCardView("Reloj inteligente Amazfit GTR 47m Health Monitor","S/ 490.00","388",R.drawable.amazfitgtr47,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Diseño elegante:\n" +
                    "Un diseño elegante y suave que le da la apariencia tradicional del reloj.\n" +
                    "Una variedad de superficies interiores adaptadas a cualquier ocasión,desde el tipo deportivo hasta el estilo más elegante y tradicional.\n" +
                    "Flúor rubber,cuero+silicona o silicona rápidamente libera cinta con un aspecto de alta calidad y resistente al sudor.\n" +
                    "Excelencia técnica:\n" +
                    "1.39 pulgadas de pantalla amoled con una resolución de hasta 326 PPI(nivel de retina).La pintura anti huellas dactilares de gorila Corning.Resolución 454 x 454\n" +
                    "5 ATM impermeable para asegurar su uso normal a una presión de hasta 50 metros.\n" +
                    "Persistencia:\n" +
                    "Las baterías duran 24 días,evitan recargas frecuentes y se centran en sus actividades cotidianas.\n" +
                    "Los chips Sony GPS,de 28 nm con un consumo de potencia excepcionalmente bajo,consumen sólo una tercera parte de los mismos chips GPS.\n" +
                    "La tecnología de captación de calor dual,desarrollada de manera autónoma,permite medir 24/7 la frecuencia cardíaca ininterrumpida,es más eficiente y consume menos energía.\n" +
                    "Entrenadores privados\n" +
                    "Hay 12 modelos de Deportes:correr al aire libre y en interiores,caminar,ciclismo al aire libre y en interiores,máquinas elípticas de entrenador,natación en piscinas/aguas abiertas,alpinismo,carrera de campo,esquíy ejercicio.\n" +
                    "GPS+GLONASS,más preciso que un satélite,puede rastrear su trayectoria con precisión.\n" +
                    "Asistentes personales y de salud\n" +
                    "24 horas seguidas,día y noche,observación del comportamiento cardíaco,ritmo cardiaco+advertencia de anormalidad cardiaca.\n" +
                    "La vigilancia del sueño te ayudaráa entender mejor tu modo de dormir.\n" +
                    "Aviso inteligente,haga todas las actualizaciones importantes en su muñeca.\n" +
                    "Te avisarési te quedas demasiado tiempo.\n" +
                    "Pronóstico meteorológico(5 a 7 días)+advertencia de temperatura\n" +
                    "Normatividad:\n" +
                    "Conexión inalámbrica:Bluetooth 5.0\n" +
                    "Nivel de impermeabilidad:5 ATM(50 m de profundidad)\n" +
                    "GPS:GPS+GLONASS\n" +
                    "Sensores:sensoresópticos de temperatura de pg,sensores de aceleración axial de 6,sensores geomagnéticos,sensores de presión atmosférica,sensores de luz ambiental,sensores de capacidad\n" +
                    "ROM:40MB",false))

        productos.add(ProductosCardView("Amazfit T-Rex Pro Reloj inteligente deportivo Bluetooth SmartWatch","S/ 790.00","599",R.drawable.amazfittrex,
            "DETALLE DEL PRODUCTO:\n" + "\n" +
                    "SKU: AM304EL120YVOLPE\n" +
                    "Modelo: T-Rex Pro\n" +
                    "Condición del producto: Nuevo\n" +
                    "Tamaño de la pantalla (pulg): 1.3\n" +
                    "Marca: Amazfit\n" +
                    "Modelo: T-Rex Pro\n" +
                    "Bluetooth: Bluetooth 5.0 BLE\n" +
                    "Batería: Batería de polímero de iones de litio de 390 mAh (valor típico)\n" +
                    "Tiempo de carga: Hasta 1,5 horas\n" +
                    "Método de carga: Conector Pogo de 2 pines\n" +
                    "Duración de la batería\n" +
                    "Uso típico: hasta 18 días\n" +
                    "Uso intensivo: hasta 9 días\n" +
                    "GPS siempre encendido: hasta 40 horas\n" +
                    "Sistema operativo: RTOS\n" +
                    "Aplicación: Zepp\n" +
                    "Dispositivos compatibles: Android 5.0 o iOS 10.0 y versiones posteriores\n" +
                    "Dimensiones: 47,7 x 47,7 x 13,5 mm\n" +
                    "Peso: 59,4g (con correa)\n" +
                    "Material de la carcasa: Policarbonato\n" +
                    "Material de la correa: Caucho de silicona\n" +
                    "Longitud de la correa: 122 mm (larga), 78 mm (corta)\n" +
                    "Ancho de la correa: 22 mm\n" +
                    "Grado de impermeabilidad: 10 ATM\n" +
                    "Pantalla táctil: Cristal templado + revestimiento antihuellas\n" +
                    "Pantalla HD AMOLED de 1,3\"\n" +
                    "Resolución 360 x 360\n" +
                    "Siempre visible\n" +
                    "Sensor óptico de bioseguimiento BioTracker™ PPG\n" +
                    "Sensor de aceleración de 3 ejes\n" +
                    "Sensor giroscópico de 3 ejes\n" +
                    "Sensor geomagnético\n" +
                    "Sensor de luz ambiental\n" +
                    "Altímetro barométrico\n" +
                    "Posicionamiento: GPS + GLONASS, GPS + BeiDou, GPS + Galileo\n" +
                    "Contenido del paquete: Cuerpo del reloj (correa estándar incluida), Base de carga magnética, Manual del usuario",false))

        productos.add(ProductosCardView("Smartwatch Amazfit Bip U Negro Reloj Inteligente","S/ 399.00","309",R.drawable.amazfitbipu,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Cuerpo superligero de 31g. Diseñado para la comodidad durante todo el día.\n" +
                    "Resistente al agua (5ATM) hasta 50 metros bajo el agua, puede usar el Bip U para nadar y registrará sus logros.\n" +
                    "Este reloj inteligente está equipado con un sensor de seguimiento óptico biológico recientemente actualizado, el BioTracker TM2, que admite la medición de la saturación de oxígeno en sangre. Cuando se sienta mal, bajo estrés mental, realizando entrenamientos intensivos como maratones y sesiones de gimnasia, o en entornos de gran altitud e hipoxia, puede medir inmediatamente su saturación de oxígeno en sangre y comprender su estado físico.\n" +
                    "Monitorea con precisión su estado de sueño, incluidos los de sueño profundo, sueño ligero, REM, tiempo de vigilia y siestas por la tarde 7, e interpreta las características para brindarle un puntaje de calidad del sueño e información para mejorar.\n" +
                    "Mantiene la monitorización de la frecuencia cardíaca las 24 horas. Con su TMsensor óptico biológico BioTracker 2 PPG patentado , el Amazfit Bip U ofrece mediciones precisas de la frecuencia cardíaca.\n" +
                    "Admite el control del estrés y puede proporcionar entrenamiento de respiración para ayudar a equilibrar sus niveles de estrés, de modo que pueda saber cuándo necesita descansar y relajarse.\n" +
                    "Rastreador del ciclo menstrual. Reciba alertas y planifique con anticipación.\n" +
                    "Excelente duración de la batería: \n" +
                    "Uso típico: Duración de la batería de hasta 9 días.\n" +
                    "Uso intensivo: Duración de la batería de hasta 5 días.\n" +
                    "Dispositivos soportados: Android 5.0 o iOS 10.0 y superior.",false))

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