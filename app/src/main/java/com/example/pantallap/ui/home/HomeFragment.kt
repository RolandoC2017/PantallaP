package com.example.pantallap.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.*
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Carrito.Carrito
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class HomeFragment : Fragment() {

    private val list = mutableListOf<CarouselItem>()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val carousel: ImageCarousel = root.findViewById(R.id.carousel)

        list.add(CarouselItem("https://image.freepik.com/foto-gratis/tecnologia-nube-holograma-futurista-reloj-inteligente_53876-124625.jpg" ))
        list.add(CarouselItem("https://niixer.com/wp-content/uploads/2021/08/PRINCIPAL-800x445.png"))
        list.add(CarouselItem("https://maxitec.vteximg.com.br/arquivos/ids/161610/banner-category-celulares-accesorios.jpg?v=637500901022470000"))
        carousel.addData(list)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recyclehome)
        var recyclerView2: RecyclerView = root.findViewById<RecyclerView>(R.id.recyclehome2)
        var productos = ArrayList<ProductosCardView>()
        var productos2 = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop Acer AN515-45-R4R6 15.6 AMD Ryzen 7 16GB 256 GB SSD + 1TB","S/ 8,999.00","8475",R.drawable.aceran515,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tipo:Laptop Gamer\n" +
                    "Modelo:AN515-45-R4R6\n" +
                    "Tama??o de pantalla:15.6\"\n" +
                    "Definici??n:Full HD\n" +
                    "Resoluci??n de pantalla:1920 x 1080\n" +
                    "Pantalla t??ctil:No\n" +
                    "Tasa de refreso:144Hz\n" +
                    "Costado:25.5 cm\n" +
                    "Alto:2.29 cm\n" +
                    "Ancho:36.3 cm\n" +
                    "Peso (kg):2.30 kg\n" +
                    "Marca de procesador:AMD\n" +
                    "Procesador:5800H 5ma Generaci??n\n" +
                    "Velocidad de procesador:3.20 GHz\n" +
                    "Velocidad m??xima:4.40 GHz\n" +
                    "N??cleos de procesador:8\n" +
                    "Memoria RAM:16 GB\n" +
                    "Memoria ampliable:32 GB\n" +
                    "Tipo de gr??ficos:DEDICADO\n" +
                    "Marca tarjeta gr??fica:NVIDIA\n" +
                    "Tarjeta gr??fica:RTX 3060\n" +
                    "Memoria Gr??fica:6 GB\n" +
                    "Capacidad:256 GB SSD + 1TB\n" +
                    "Disco duro (DD):Si\n" +
                    "Disco estado s??lido (SSD):Si\n" +
                    "Permite segunda unidad:Si\n" +
                    "Permite reemplazo:Si\n" +
                    "Wi-Fi:Si\n" +
                    "HDMI:Si\n" +
                    "USB 3.0:3\n" +
                    "USB tipo C:1\n" +
                    "Entrada micr??fono:Si\n" +
                    "Puerto de red:Si\n" +
                    "Conexi??n VGA:No\n" +
                    "Bluetooth:Si\n" +
                    "Sistema operativo:Windows 10\n" +
                    "Garant??a:1 a??o\n" +
                    "Teclado iluminado:Si\n" +
                    "Teclado n??merico:Si\n" +
                    "Unidad ??ptica:No\n" +
                    "C??mara web:Si",false))

        productos.add(ProductosCardView("ASUS 15.6 ZenBook Pro Duo 15 OLED Multi-Touch Laptop ","S/ 23,759.00","16969",R.drawable.asuszenbookpro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "2.4 Ghz Intel Core I9 8-Core (10Th Gen)\n" +
                    "32 Gb De Ram Ddr4 -1Tb M.2 Ssd\n" +
                    "15.6 3840 X 2160 Pantalla T??ctil Oled\n" +
                    "Nvidia Geforce Rtx 3070\n" +
                    "Usb 3.2 Gen 2 -Thunderbolt 3 -Hdmi 2.1\n" +
                    "Wi-Fi 6 (802.11Ax) -Bluetooth 5.0\n" +
                    "Webcam Hd Ir Con Windows Hola Soporte\n" +
                    "Panel T??ctil Screenpad Plus\n" +
                    "Incluye Stylus, Palm Rest, Stand & More\n" +
                    "Windows 10 Pro\n" +
                    "Producto Nuevo Y Original.\n" +
                    "Ficha T??cnica En La Descripci??n Del Producto.\n" +
                    "Producto Importado De Usa.",false))

        productos2.add(ProductosCardView("TECLADO GAMER CON ILUMINACION TRUST GXT835 AZOR","S/ 190.00","115",R.drawable.tecladotrust,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Membrana de tecnolog??a clave\n" +
                    "Altura : 40 mm\n" +
                    "Ancho : 438 mm\n" +
                    "Peso : 621 g\n" +
                    "Teclado de tama??o completo : s??\n" +
                    "Tipo de conexi??n : cableada\n" +
                    "Longitud del cable cable : 180 cm\n" +
                    "USB versi??n : 1.1\n" +
                    "Tipo de conector : USB-A macho\n" +
                    "Dise??ado para juegos : s??\n" +
                    "Tipo de juego : FPS, MMO, MOBA, RPG, RTS\n" +
                    "Modo de juego : s??\n" +
                    "Retroiluminaci??n : s??\n" +
                    "Colores de luz de fondo : Arco iris\n" +
                    "Distribuci??n del teclado : QWERTY\n" +
                    "Fuente de alimentaci??n : USB\n" +
                    "Dispositivos compatibles : laptop, pc, consola de juegos\n" +
                    "Consolas compatibles : PS4, Xbox One\n" +
                    "Plataformas de software compatibles : Mac OS, Windows, Chrome OS\n" +
                    "Teclado num??rico : s??\n" +
                    "Teclas multimedia sI : 12 funciones FN\n" +
                    "Teclas especiales : Teclas FN\n" +
                    "N??mero de llaves : 104\n" +
                    "Vida ??til : 5000000 pulsaciones clave\n" +
                    "Rollo de 8 teclas Anti-Ghosting\n" +
                    "Tiempo de respuesta 8 ms\n" +
                    "Indicadores Bloqueo de may??sculas, Bloqueo de n??meros, Bloqueo de desplazamiento, Modo de juego",false))

        productos2.add(ProductosCardView("Teclado Gamer RGB Mini 35 Teclas Para Una Mano GAMING","S/ 80.00","55",R.drawable.tecladorgb,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Est?? dise??ado para jugar especialmente para alguien a quien le gusta usar una mano para controlar el teclado en juegos de acci??n para movimientos r??pidos.\n" +
                    "La retroiluminaci??n LED RGB lo convierte en un incre??ble teclado con una sola mano.\n" +
                    "Teclado de una mano Dise??o ergon??mico: una forma ergon??mica con un c??modo reposamu??ecas\n" +
                    "Lo que puede reducir la fatiga, el teclado para juegos con una gran ??rea de reposamanos para la mano le permite usarlo con menos esfuerzo\n" +
                    "El teclado utiliza un dise??o port??til, su peque??o tama??o lo hace no solo f??cil de transportar, sino que tambi??n ahorra espacio.\n" +
                    "Retroiluminaci??n RGB: la retroiluminaci??n RGB admite el modo de respiraci??n y el modo est??tico, hay 7 colores para elegir\n" +
                    "El efecto de iluminaci??n genial te traer?? m??s diversi??n para el juego",false))

        var adapter = ProductosAdapterCV(productos)
        var adapter2 = ProductosAdapterCV(productos2)

        //recyclerView.layoutManager = LinearLayoutManager(root.context,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = GridLayoutManager(root.context,2)
        recyclerView.adapter = adapter
        recyclerView2.layoutManager = GridLayoutManager(root.context,2)
        recyclerView2.adapter = adapter2

        /*smart.setOnClickListener {
            var intent = Intent(context, llamarSmartWatch::class.java)
            startActivity(intent)
        }
        realidad.setOnClickListener {
            var intent = Intent(context, llamarRealidad::class.java)
            startActivity(intent)
        }
        compo.setOnClickListener {
            var intent = Intent(context, llamarComponente::class.java)
            startActivity(intent)
        }*/

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
