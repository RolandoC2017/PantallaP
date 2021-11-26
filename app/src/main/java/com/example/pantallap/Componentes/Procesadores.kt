package com.example.pantallap.Componentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.R
import com.google.android.material.tabs.TabLayout

class Procesadores : Fragment() {

    companion object {
        fun newInstance() = Procesadores()
    }

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.procesadores, container, false)

        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.amd).setText("AMD"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.intel).setText("Intel"))

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
                0 -> fragment = AMD()
                1 -> fragment = Intel()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return numeroTab
        }
    }
}