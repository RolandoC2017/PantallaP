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

class PlacasBase : Fragment() {

    companion object {
        fun newInstance() = PlacasBase()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.placas_base, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Jingsha X79P3 Placa base M.2 Alta velocidad E5 LGA2011 Procesador ATX DDR3 64GB Placa base PCI-E3.0 NVME","S/ 1,480.00","805",R.drawable.placabasejingsha,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Nota: Al comprar un producto, consulte los detalles del producto, incluida la función, el tamaño, el modelo, el peso, etc. adquiridos. ¡Gracias!\n" +
                    "Ofrecemos la mejor calidad, el mejor precio y un servicio al cliente amigable.\n" +
                    "El 99% de los productos están en stock y se pueden comprar de inmediato.\n" +
                    "Todos los días está mejorando: escuchamos los comentarios de los clientes y ajustamos cada detalle para garantizar la calidad\n" +
                    "Nuestros productos son completamente nuevos. Si tiene alguna pregunta, no dude en contactarnos.\n" +
                    "Nota:\n" +
                    "1. El proyecto se mide manualmente y habrá algunas desviaciones. Espero que puedas entender.\n" +
                    "2. Debido a la calibración inconsistente del monitor, el color de los elementos que se muestran en el monitor de la computadora puede ser ligeramente diferente.",false))

        productos.add(ProductosCardView("A88M2 A10 A58 placa base PCI-E 2xDDR3 4xSATA2.0 interfaz para la placa base AMD","S/ 774.00","309",R.drawable.placabasepci,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "1. Estable:. Circuito de alimentación de estado sólido en fase Cinco está diseñado para proporcionar la fuente de alimentación estable para la CPU\n" +
                    "2. Doble salida: La tarjeta gráfica es compatible con la CPU compatible con HDMI + VGA dual de salida\n" +
                    "3.. Interfaces USB 10 Extensión: 10pcs a bordo de extensión USB Interfaces a numerosos requisitos del Modelo de Atención al Usuario\n" +
                    "4.. Portabilidad:. Este producto es de tamaño pequeño y ligero de peso, que es muy cómodo de llevar alrededor\n" +
                    "5. Bella: Este producto está hecho con la artesanía exquisita funcional, y la apariencia es muy elegante y hermosa .",false))

        productos.add(ProductosCardView("Computadora ATX Placa base PCI-E USB 3.0USB2.0 para Intel X7","S/ 652.00","521",R.drawable.placabaseatx,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Faacute;cil de usar\n" +
                    "Calidad alta\n" +
                    "Bien hecho.\n" +
                    "Durabilidad.\n" +
                    "Buena producción\n" +
                    "Es popular en el pueblo.\n" +
                    "Ahorra dinero.\n" +
                    "Mejores opciones y mejores descuentos\n" +
                    "La atención al cliente es nuestra prioridad.\n" +
                    "Las preferencias dependen de las circunstancias.\n" +
                    "Venta masiva\n" +
                    "Tipo de CPU de soporte: 2011 pin V1-V2\n" +
                    "Tarjeta gráfica: tarjeta gráfica discreta\n" +
                    "Interfaz del disco duro: SATA\n" +
                    "Estructura de la placa base: ATX\n" +
                    "Frecuencia del bus frontal: 1600 ( MHz)\n" +
                    "Chipset: para Intel X79\n" +
                    "Estándar de tarjeta gráfica compatible: PCI Express 16X\n" +
                    "Tipo de memoria: compatible con DDR3",false))

        productos.add(ProductosCardView("H61M placa base del PC de sobremesa USB 2.0 Placa base para el núcleo del ordenador soporte para DDR3","S/ 571.00","323",R.drawable.placabaseh61m,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "1.Todo condensador de estado sólido: Todas rendimiento de estado sólido es estable, en gran medida ampliar el uso de la vida placa base\n" +
                    "2.Doble canal DDR3: memoria de canal dual mejorar el rendimiento slotgreatly placa base\n" +
                    "3.Inicio rápido: Carga y transferencia de archivos. Bajo consumo de energía, tranquila, fiable y duradero. Multi-fase de suministro de energía, más estable y duradero.\n" +
                    "4.alta tasa de transmisión:. Con una interfaz múltiple, la velocidad de transmisión de esta placa base del ordenador es muy rápido, que es conveniente para su trabajo\n" +
                    "5.Fuente de alimentación estable: La fuente de alimentación es estable y precisa, uniformemente distribuida, y la carga térmica de los diversos conjuntos de chips de suministro de energía mejora el rendimiento de la CPU",false))

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