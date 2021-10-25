package com.example.pantallap.ui.celular

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.R
import com.example.pantallap.Telefono.*
import com.example.pantallap.databinding.FragmentCelularBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*

class GalleryFragment : Fragment() {

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    private var _binding: FragmentCelularBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCelularBinding.inflate(inflater, container, false)
        val root: View = binding.root

        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.apple).setText("Apple"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.huawei).setText("Huawei"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.lg).setText("LG"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.motorola).setText("Motorola"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.samsung).setText("Samsung"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.xiaomi).setText("Xiaomi"))
        adapter = PagerAdapter(childFragmentManager, pestañas.getTabCount())
        viewPager.setAdapter(adapter)
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(pestañas))


        pestañas.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.setCurrentItem(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        return root
    }

    class PagerAdapter(fm: FragmentManager?, var numeroTab: Int) :
        FragmentPagerAdapter(fm!!) {
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = Apple()
                1 -> fragment = Huawei()
                2 -> fragment = LG()
                3 -> fragment = Motorola()
                4 -> fragment = Samsung()
                5 -> fragment = Xiaomi()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return numeroTab
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

