package com.example.pantallap.ZonaGamer

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

class Audifonos : Fragment() {

    companion object {
        fun newInstance() = Audifonos()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.audifonos, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Audífonos Gamer VSG Kuiper Multiplataforma PS4 XBOX PC Rac Store","S/ 149.00","100",R.drawable.audifonovsg,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Sistema de audio: Estéreo\n" +
                    "Plataforma: PC / Dispositivos móviles / consolas\n" +
                    "Iluminación Verde Constante\n" +
                    "Conectividad: Jack 3.5 mm TRRS y USB para las luces\n" +
                    "Rango de frecuencia del altavoz: 20Hz - 20kHz.\n" +
                    "Rango de frecuencia del micrófono: 100Hz - 10kHz.\n" +
                    "Impedancia: 32 ohms.\n" +
                    "Tamaño de altavoz: 50mm.\n" +
                    "Sensibilidad del altavoz: 108dB + 3dB.\n" +
                    "Sensibilidad del micrófono: 54 + 2dB.\n" +
                    "Material: ABS + Metal +Esponja\n" +
                    "Tamaño del cable 2.1m\n" +
                    "Imágenes reales del producto.\n" +
                    "100% Original.\n" +
                    "Por la compra te obsequiamos una lata de Monster.",false))

        productos.add(ProductosCardView("Audifono Gamer G -105 E-Sports Pc - Ps4 - xbox","S/ 4,599.00","3499",R.drawable.audifonog105,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Medidas del casco: 18.5 x 19.00 x 10.50 centímetros\n" +
                    "Solo emitimos boleta\n" +
                    "Potencia nominal : 20 mW\n" +
                    "Luz de respiracion circular colorida\n" +
                    "Unidad de altavoz grande de 50 mm , restaurar el juego es realmente en vivo\n" +
                    "Peso: apenas 318 gramos\n" +
                    "Conectividad: con Jack 3,5 mm x 2 (micrófono y audio), USB para iluminación LED RGB\n" +
                    "Frecuencia de audio: de 20 Hz – 20 Hz, impedancia de 32 Ohms\n" +
                    "Cable: de 1 , 5  mm\n" +
                    "Drivers: de 50 mm con magnetos de neodimio alta precisión, sonido de alta calidad, envolvente estéreo\n" +
                    "Micrófono: cancela ruidos externos",false))

        productos.add(ProductosCardView("Audifonos Gamer Nibio Infinity RGB PC PS4 XBOX Switch","S/ 199.00","70",R.drawable.audifononibio,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Especificaciones técnicas\n" +
                    "Marca: Nibio\n" +
                    "Modelo: N500 - INFINITY\n" +
                    "Diámetro del altavoz: 50mm\n" +
                    "Impedancia: 16-20 ohms ±15%\n" +
                    "Sensibilidad: 105, ±3dB\n" +
                    "Frecuencia: 20-20,000Hz\n" +
                    "Dimensiones del micrófono: 6.0 * 2.7mm\n" +
                    "Sensibilidad del micrófono: -42±1dB\n" +
                    "Impedancia del micrófono: 2K ohms\n" +
                    "Direcionalidad: Omnidirectional\n" +
                    "Corriente de trabajo: > 100mA\n" +
                    "Largo del cable: Approx 2.2m/7.22ft\n" +
                    "Tamaño del Headset: Approx 22 * 9 * 20cm/8.66* 3.54 * 7.87 inches\n" +
                    "Peso del Headset: 380g\n" +
                    "Voltaje del Led RGB: DC 5V+/-5%",false))

        productos.add(ProductosCardView("Auriculares Gamer Redragon Zeus H510-Negro","S/ 269.00","219",R.drawable.audifonoredragon,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "El amo de las plataformas, el ZEUS es el auricular compatible con PC, PS4, XBOX, Nintendo Switch y Móviles Smartphone que los gamers multiplataforma esperaban. Destaca su estructura muy ligera y gran calidad de materiales.\n" +
                    "Conexión: Multiplataforma, Usb con control de volumen, cable 3.5 mm inc. adaptador 2 en 1\n" +
                    "Tipo de sonido: 7.1 virtual\n" +
                    "Compatible con: PC, Laptop, Ps4/Ps3, Xbox, Móvil, nintendo switch\n" +
                    "Software: disponible para ajuste de audio, micro, sonido virtual, voces y más!\n" +
                    "Tipo de micro: flexible, 360° y extraible\n" +
                    "Materiales de la estructura: aluminio\n" +
                    "Tamaño de la copa: medio a grande",false))

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