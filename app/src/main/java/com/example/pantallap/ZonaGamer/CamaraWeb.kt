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

class CamaraWeb : Fragment() {

    companion object {
        fun newInstance() = CamaraWeb()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.camara_web, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Cámara Web 1080P Fhd Redragon Gw800 Hitman-Negro","S/ 249.00","189",R.drawable.camaraweb1080p,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Velocidad de fotogramas: 1080P 30fps Max\n" +
                    "Enfoque: enfoque fijo\n" +
                    "Micrófono: estéreo de 2 canales, reducción de ruido, micrófono dual\n" +
                    "Lente FOV: D = 72 °\n" +
                    "Rango de enfoque: 50 cm-infinito\n" +
                    "Tamaño de la lente: 1 / 2.7",false))

        productos.add(ProductosCardView("Logitech StreamCam HD Webcam Video Conferencias Web Teaching","S/ 1,109.00","415",R.drawable.camaraweblogitech,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "1. Promociónate\n" +
                    "2. Una combinación poderosa\n" +
                    "3. La vida real alcanza los 60 FPS\n" +
                    "4. Autoenfoque y exposición inteligentes\n" +
                    "5. Vídeo vertical Full HD\n" +
                    "6. Opciones de instalación multifunción\n" +
                    "7. Conéctese con USB-C\n" +
                    "8. Composición automática inteligente\n" +
                    "9. Rendimiento de audio avanzado",false))

        productos.add(ProductosCardView("Camara Web Logitech Brio, hasta 4K Ultra, HDR, microfono, zoom digital 5x, USB 3.0","S/ 729.00","579",R.drawable.camarawebbrio,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Conectividad USB 3.0 Plug-and-play\n" +
                    "Resolucion 4K Ultra HD hasta 4096 x 2160 píxeles a 30 fps\n" +
                    "Zoom digital 5x en Full HD\n" +
                    "Videograbaciones Full HD 1080p (hasta 1920 x 1080 píxeles a 30 o 60 fps)\n" +
                    "Videollamadas HD de 720p (hasta 1280 x 720 píxeles a 30, 60 o 90 fps)\n" +
                    "Campo de visión de 90 grados (FOV) con dos ajustes adicionales (65 y 78 grados) disponibles con descarga de software opcional\n" +
                    "Enfoque automático\n" +
                    "Micrófonos omnidireccionales duales incorporados con cancelación de ruido\n" +
                    "Tecnología de sensor infrarrojo para Windows Hello (SDK disponible para integración de aplicaciones)\n" +
                    "Obturador de privacidad externo\n" +
                    "Cable USB 7.2 pies (2.2 mt)\n" +
                    "Compatibidad Windows  7 o superior, MacOS 10.10 o superior, Chrome OS Versión 29.0.1547.70 y superior\n" +
                    "La grabación y transmisión 4K requiere un puerto USB 3.0 y un software compatible)",false))

        productos.add(ProductosCardView("Cámara Web Microsoft LifeCam Cinema 1280 x 720 - H5D-00013","S/ 408.00","306",R.drawable.camarawebmicrosoft,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca   microsoft\n" +
                    "Código del fabricante: H5D-00013\n" +
                    "Modelo  lifecam cinema\n" +
                    "Dispositivo  webcam\n" +
                    "Interfaz  usb\n" +
                    "Angulo de vista angulo del lente 16:9 widescreen\n" +
                    "Plataformas de trabajo windows xp\n" +
                    "Windows  vista\n" +
                    "Windows 7\n" +
                    "Empaque  presentación caja\n" +
                    "Comentario 2.0 hd lens\n" +
                    "Autofocus\n" +
                    "Tecnologia clearframe\n" +
                    "Smooth 720p hd video",false))

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