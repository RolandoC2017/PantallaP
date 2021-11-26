package com.example.pantallap.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.R
import com.example.pantallap.RealidadVirtual.*
import com.google.android.material.tabs.TabLayout

class RealidadVirtual : Fragment() {

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_realidad_virtual, container, false)

        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.oculus).setText("Oculus"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.sony).setText("Sony"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.vrbox).setText("VR Box"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.vrshinecon).setText("VR Shinecon"))

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
                0 -> fragment = Oculus()
                1 -> fragment = Sony()
                2 -> fragment = VRBox()
                3 -> fragment = VRShinecon()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return numeroTab
        }
    }
}