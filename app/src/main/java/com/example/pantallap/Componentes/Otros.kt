package com.example.pantallap.Componentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.Pc.Acer
import com.example.pantallap.R

class Otros : Fragment() {

    companion object {
        fun newInstance() = Otros()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.otros, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Ventilador FAN RGB SETx3 CORSAIR LL120 RGB con Controlador","S/ 607.00","509",R.drawable.ventiladorrgb,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "16 LED RGB independientes en cada ventilador, dividido entre dos bucles de luz separados. Flujo de aire: 43,25 CFM. Nivel de ruido: 24,8 decibelios\n" +
                    "Control de software y personaliza los efectos de iluminación RGB con la iluminación Corsair Node Pro incluida o amplía tu iluminación RGB con más ventiladores Corsair RGB o tiras de iluminación LED RGB (se venden por separado)\n" +
                    "El control de ventilador PWM permite un ajuste de velocidad dinámico entre 600 rpm a 1.500 rpm, minimizando el ruido o maximizando el flujo de aire\n" +
                    "Ventilador de 120 milímetros diseñado para un funcionamiento de bajo ruido sin sacrificar el rendimiento\n" +
                    "Tipo de rodamiento: hidráulico",false))

        productos.add(ProductosCardView("Base Ventilador Laptop PC USB Gamer RGB Notebook Que Enfria","S/ 323.00","249",R.drawable.ventiladorlaptop,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Puede enfriar rápidamente su computadora\n" +
                    "Proporciona 5 velocidades de viento y 3 modos de funcionamiento del ventilador\n" +
                    "Con luz LED\n" +
                    "Inclinación ajustable\n" +
                    "El ventilador de bajo ruido garantiza la tranquilidad\n" +
                    "El deflector antideslizante proporciona una superficie estable",false))

        productos.add(ProductosCardView("FUENTE ALIMENTACION CORSAIR CV650","S/ 600.00","313",R.drawable.fuentedealimen,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Carril ajustable de 12V simple / múltiple No\n" +
                    "Conector ATX 1\n" +
                    "Versión ATX12V v2.31\n" +
                    "Potencia continua W 650 vatios\n" +
                    "Tecnología de cojinetes de ventilador Manga\n" +
                    "Tamaño del ventilador mm 120 mm\n" +
                    "Horas MTBF 100.000 horas\n" +
                    "Listo para múltiples GPU No\n" +
                    "Factor de forma de la fuente de alimentación ATX\n" +
                    "Conector EPS12V 2\n" +
                    "Conector de disquete 1\n" +
                    "Modular No\n" +
                    "Conector PCIe 2\n" +
                    "Conector SATA 7",false))

        productos.add(ProductosCardView("Grabador Externo Dvd/cd Lector Usb 3.0 Usb C","S/ 219.00","149",R.drawable.lectordvd,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Dual USB C y USB 3.0 DVD Drive: Nuevo diseño usb c externo cd dvd drive. Ofrecemos un adaptador USB Tipo C adicional, adecuado para todas las computadoras o portátiles, sin importar que sea USB 3.0 o interfaz Tipo C USB. No se requiere programa de controlador ni fuente de alimentación adicional. No es necesario instalar software para configurarlo.\n" +
                    "Alto rendimiento: usb c superdrive está equipado con una interfaz de alta velocidad USB C, hasta un máximo de 10 Gbps y un rendimiento estable con una fuerte tolerancia a fallas. Es compatible con USB3.0 / USB 2.0 y USB1.0. A prueba de golpes, bajo nivel de ruido, anti-interferencias y alta durabilidad.\n" +
                    "Fácil de usar: Plug and play, la unidad de CD externa es un complemento perfecto para las computadoras sin la unidad interna. Puede grabar archivos, instalar software y crear un CD de respaldo. Esta unidad óptica de CD DVD le permite ver películas en DVD / CD sin Retrasa y graba música, películas a CD o DVD en cualquier momento.\n" +
                    "Unidad óptica: la unidad de CD externa funciona con Windows 10/7/8 / Mac OSX / XP / Vista, todas las versiones de MAC OS. Especialmente diseñado para ser compatible con Apple / Mac / MacBood Pro / Air / Samsung / ASUS / HP / Dell / Sony / Acer y otros Ultrabook, Netbook o Laptop / PC sin unidad interna, pero con interfaces USB C o USB 3.0.",false))

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