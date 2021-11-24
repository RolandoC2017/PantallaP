package com.example.pantallap.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.Smartwatch.*
import com.example.pantallap.R
import com.example.pantallap.ui.Smartwatch
import com.google.android.material.tabs.TabLayout

class Smartwatch : Fragment() {

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_smartwatch, container, false)
        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.amazfit).setText("Amazfit"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.haylou).setText("Haylou"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.huawei).setText("Huawei"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.honor).setText("Honor"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.xiaomi).setText("Xiaomi"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.lenovo).setText("lenovo"))

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
                0 -> fragment = Amazfit()
                1 -> fragment = Haylou()
                2 -> fragment = Huawei()
                3 -> fragment = Honor()
                4 -> fragment = Xiaomi()
                5 -> fragment = Lenovo()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return numeroTab
        }
    }
}
