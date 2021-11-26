package com.example.pantallap.ui.componente

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.Componentes.*
import com.example.pantallap.R
import com.example.pantallap.Smartwatch.*
import com.example.pantallap.ui.Smartwatch
import com.google.android.material.tabs.TabLayout

class FragmentComponente : Fragment() {

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_componente, container, false)

        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.discoduro).setText("Disco Duro"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.memoriaram).setText("Memoria RAM"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.placabase).setText("Placa Base"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.procesador).setText("Procesadores"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.tarjetagrafica).setText("Tarjeta Grafica"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.otros).setText("Otros"))

        adapter = PagerAdapter(childFragmentManager, pestañas.getTabCount())
        viewPager.setAdapter(adapter)
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(pestañas))

        pestañas.tabMode = TabLayout.MODE_SCROLLABLE

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
                0 -> fragment = DiscoDuro()
                1 -> fragment = MemoriaRAM()
                2 -> fragment = PlacasBase()
                3 -> fragment = Procesadores()
                4 -> fragment = TarjetaGrafica()
                5 -> fragment = Otros()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return numeroTab
        }
    }
}