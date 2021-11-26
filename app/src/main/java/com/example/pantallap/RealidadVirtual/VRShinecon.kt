package com.example.pantallap.RealidadVirtual

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

class VRShinecon : Fragment() {

    companion object {
        fun newInstance() = VRShinecon()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.vrshinecon, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleRealidad)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("sg-g04 Universal video 3D gafas de realidad virtual de 4,5 a 6 pulgad","S/ 180.00","89",R.drawable.vrshineconsg04,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "juegos 3D vidrios\n" +
                    "peliculas 3D gafas VR VR auriculares caja electronica de consumo",false))

        productos.add(ProductosCardView("Lentes De Realidad Virtual 3D gafas VR Shinecon + Controlador","S/ 197.00","131",R.drawable.vrshineconcontro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "1. Una máquina de doble uso, diseño de cámarade sonido completamente cerrado, con reducción activa de ruido, y se adapta adiferentes tipos de cabezas de diferentes grupos de edad.\n" +
                    "2. Diseñado para cumplir con los diferentescontornos faciales y evitar que tu nariz se dañe.\n" +
                    "3. La Tecnología de campo de sonido especialpuede proporcionarle un excelente efecto de audio 3D e sumergir experiencias,integración audiovisual, fácil de disfrutar de un efecto de sonido estéreo 3D.\n" +
                    "4. Mejora en gran medida el efecto dedisipación del calor para un uso prolongado, reduciendo la temperaturadirectamente de 8 °, así reconfortando tus ojos hasta el último grado.\n" +
                    "5. Diseñado para reducir la presión alrededorde los ojos y en la cabeza, lo que le proporciona una sensación más cómoda. Porlo tanto, es adecuado para diferentes.",false))

        productos.add(ProductosCardView("VRG Pro 3D VR Gafas Juegos virtuales Realidad VR Pantalla completa","S/ 157.00","77",R.drawable.vrshineconcompleta,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Diseño ergonómico: el cinturón ergonómico en forma de T equilibra la presión de la cabeza, reduce la presión de los ojos, la cara y la cabeza en un 30%\n" +
                    "Compatible con teléfonos móviles de 5 a 7 pulgadas. Ya sea un teléfono móvil pequeño de 5 pulgadas o un teléfono móvil de pantalla gigante de 7 pulgadas, se puede utilizar VRG Pro\n" +
                    "Las lentes de espejo con una claridad incomparable hacen que las películas de realidad virtual sean una experiencia visual\n" +
                    "Cómodo de usar y fácil de ajustar: los faciales hechos de cuero suave hacen que su piel se sienta cómoda, lo que le permite lucir más tiempo sin irritar\n" +
                    "Lentes profesionales que reducen en gran medida las malformaciones ópticas, el brillo y la fatiga visual. Correa de hombro ajustable para diferentes tamaños de cabeza",false))

        productos.add(ProductosCardView("Lentes de Realidad Virtual 3D-Negro","S/ 323.00","208",R.drawable.vrshineconegro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Visión de 3.120 grados\n" +
                    "La gran visión impactante\n" +
                    "Fácil de experimentar el cine de pantalla gigante.\n" +
                    "Compatibilidad múltiple\n" +
                    "Compatible con teléfonos inteligentes iOS y Android de 4,0-6,0 pulgadas\n" +
                    "Máscara de enfriamiento transpirable\n" +
                    "Material de cuero PU suave, transpirable y más cómodo",false))

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