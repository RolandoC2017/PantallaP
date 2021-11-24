package com.example.pantallap.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R
import com.example.pantallap.databinding.ActivityMainBinding
import com.example.pantallap.databinding.FragmentHomeBinding
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

        list.add(CarouselItem("https://www.conclusion.com.ar/wp-content/uploads/2016/08/Celulares.jpg" ))
        list.add(CarouselItem("https://1.bp.blogspot.com/-cOv9eNDantg/XsxoPhdWkgI/AAAAAAAAwZU/aLhqpzzbNO8iTy_IDh_NymmxPmJUDwjSwCLcBGAsYHQ/w1280-h720-p-k-no-nu/cuales-son-los-efectos-positivos-y-negativos-de-los-telefonos-celulares.jpg"))
        list.add(CarouselItem("https://www.eltiempo.com/files/article_multimedia/uploads/2019/02/20/5c6df9cd1acc3.jpeg"))
        carousel.addData(list)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recyclehome)
        var recyclerView2: RecyclerView = root.findViewById<RecyclerView>(R.id.recyclehome2)
        var productos = ArrayList<ProductosCardView>()
        var productos2 = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop Acer AN515-45-R4R6 15.6 AMD Ryzen 7 16GB 256 GB SSD + 1TB","S/ 8,999.00","8475",R.drawable.aceran515,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tipo:Laptop Gamer\n" +
                    "Modelo:AN515-45-R4R6\n" +
                    "Tamaño de pantalla:15.6\"\n" +
                    "Definición:Full HD\n" +
                    "Resolución de pantalla:1920 x 1080\n" +
                    "Pantalla táctil:No\n" +
                    "Tasa de refreso:144Hz\n" +
                    "Costado:25.5 cm\n" +
                    "Alto:2.29 cm\n" +
                    "Ancho:36.3 cm\n" +
                    "Peso (kg):2.30 kg\n" +
                    "Marca de procesador:AMD\n" +
                    "Procesador:5800H 5ma Generación\n" +
                    "Velocidad de procesador:3.20 GHz\n" +
                    "Velocidad máxima:4.40 GHz\n" +
                    "Núcleos de procesador:8\n" +
                    "Memoria RAM:16 GB\n" +
                    "Memoria ampliable:32 GB\n" +
                    "Tipo de gráficos:DEDICADO\n" +
                    "Marca tarjeta gráfica:NVIDIA\n" +
                    "Tarjeta gráfica:RTX 3060\n" +
                    "Memoria Gráfica:6 GB\n" +
                    "Capacidad:256 GB SSD + 1TB\n" +
                    "Disco duro (DD):Si\n" +
                    "Disco estado sólido (SSD):Si\n" +
                    "Permite segunda unidad:Si\n" +
                    "Permite reemplazo:Si\n" +
                    "Wi-Fi:Si\n" +
                    "HDMI:Si\n" +
                    "USB 3.0:3\n" +
                    "USB tipo C:1\n" +
                    "Entrada micrófono:Si\n" +
                    "Puerto de red:Si\n" +
                    "Conexión VGA:No\n" +
                    "Bluetooth:Si\n" +
                    "Sistema operativo:Windows 10\n" +
                    "Garantía:1 año\n" +
                    "Teclado iluminado:Si\n" +
                    "Teclado númerico:Si\n" +
                    "Unidad óptica:No\n" +
                    "Cámara web:Si",false))

        productos.add(ProductosCardView("ASUS 15.6 ZenBook Pro Duo 15 OLED Multi-Touch Laptop ","S/ 23,759.00","16969",R.drawable.asuszenbookpro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "2.4 Ghz Intel Core I9 8-Core (10Th Gen)\n" +
                    "32 Gb De Ram Ddr4 -1Tb M.2 Ssd\n" +
                    "15.6 3840 X 2160 Pantalla Táctil Oled\n" +
                    "Nvidia Geforce Rtx 3070\n" +
                    "Usb 3.2 Gen 2 -Thunderbolt 3 -Hdmi 2.1\n" +
                    "Wi-Fi 6 (802.11Ax) -Bluetooth 5.0\n" +
                    "Webcam Hd Ir Con Windows Hola Soporte\n" +
                    "Panel Táctil Screenpad Plus\n" +
                    "Incluye Stylus, Palm Rest, Stand & More\n" +
                    "Windows 10 Pro\n" +
                    "Producto Nuevo Y Original.\n" +
                    "Ficha Técnica En La Descripción Del Producto.\n" +
                    "Producto Importado De Usa.",false))

        productos2.add(ProductosCardView("Xiaomi Poco X3 Pro 6GB 128GB","S/ 1,299.00","1149",R.drawable.xiaomipocox3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Tamaño de Pantalla 6,67 \"FHD\n" +
                    "Memoria RAM: 6 GB\n" +
                    "Capacidad: 128 GB Almacenamiento\n" +
                    "Procesador: Snapdragon 860\n" +
                    "Cámara frontal: 20 MP\n" +
                    "Cámara trasera: 48 MP + 8 MP + 2 MP\n" +
                    "Garantía: 1 año\n" +
                    "Tecnología: IPS.\n" +
                    "Cristal Corning Gorilla Glass 6.\n" +
                    "Batería: 5160 mAh.\n" +
                    "Carga rápida de 33 W.\n" +
                    "Puerto USB C.\n" +
                    "Altavoces estéreo.\n" +
                    "Certificación Hi-Res Audio.\n" +
                    "Jack 3.5 mm de auriculares.\n" +
                    "Lector de huellas lateral.\n" +
                    "Versión de Android: 11.\n" +
                    "Capa de personalización: MIUI.",false))

        productos2.add(ProductosCardView("Xiaomi Poco M3 Pro 6GB 128GB 5G teléfono M2103K19PG - Negro","S/ 1,199.00","859",R.drawable.xiaomipocom3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "CPU: CPU Dimensity 700 Octa Core, hasta 2.2GHz\n" +
                    "Pantalla: 6.5' 2400x1080P FHD + DotDisplay, frecuencia de actualización de 90Hz\n" +
                    "RAM + ROM: 6GB + 128GB\n" +
                    "Cámara: cámara trasera triple de 48MP + 2MP + 2MP, cámara frontal de 8MP\n" +
                    "Batería: 5000 mAh (tipo), admite carga rápida de 18 W, cargador rápido de 22,5 W en la caja\n" +
                    "Sistema operativo: MIUI, versión global, compatible con varios idiomas y Google Play\n" +
                    "Otros: Wi-FI, Bluetooth 5.1, GPS, ID de huella digital, Desbloqueo facial AI, Conector para auriculares de 3,5 mm, IR Blaster, NFC\n" +
                    "Red --- Netcom completo, doble SIM de doble modo de espera\n" +
                    "5G: n1, n3, n7, n8, n20, n28, n38, n40, n41, n66, n77, n78\n" +
                    "4G: LTE FDD B1 / 2/3/4/5/7/8/12/17/20/28/32/66\n" +
                    "4G: LTE TDD B38 / 40/41\n" +
                    "3G: WCDMA B1 / 2/4/5/8\n" +
                    "2G: GSM 850 900 1800 1900 MHz",false))

        var adapter = ProductosAdapterCV(productos)
        var adapter2 = ProductosAdapterCV(productos2)

        //recyclerView.layoutManager = LinearLayoutManager(root.context,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = GridLayoutManager(root.context,2)
        recyclerView.adapter = adapter
        recyclerView2.layoutManager = GridLayoutManager(root.context,2)
        recyclerView2.adapter = adapter2

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
