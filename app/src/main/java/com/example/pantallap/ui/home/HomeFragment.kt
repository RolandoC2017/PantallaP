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
import com.example.pantallap.R
import com.example.pantallap.databinding.ActivityMainBinding
import com.example.pantallap.databinding.FragmentHomeBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class HomeFragment : Fragment() {

    private val list = mutableListOf<CarouselItem>()
    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val carousel: ImageCarousel = root.findViewById(R.id.carousel)

        list.add(CarouselItem("https://www.conclusion.com.ar/wp-content/uploads/2016/08/Celulares.jpg" ))
        list.add(CarouselItem("https://1.bp.blogspot.com/-cOv9eNDantg/XsxoPhdWkgI/AAAAAAAAwZU/aLhqpzzbNO8iTy_IDh_NymmxPmJUDwjSwCLcBGAsYHQ/w1280-h720-p-k-no-nu/cuales-son-los-efectos-positivos-y-negativos-de-los-telefonos-celulares.jpg"))
        list.add(CarouselItem("https://www.eltiempo.com/files/article_multimedia/uploads/2019/02/20/5c6df9cd1acc3.jpeg"))
        carousel.addData(list)

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
