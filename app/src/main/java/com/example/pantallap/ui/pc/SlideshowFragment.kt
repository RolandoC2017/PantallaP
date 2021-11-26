package com.example.pantallap.ui.pc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.Pc.*
import com.example.pantallap.R
import com.example.pantallap.databinding.FragmentPcBinding
import com.google.android.material.tabs.TabLayout

class SlideshowFragment : Fragment() {

    private lateinit var pestañas: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapter: PagerAdapter

    private var _binding: FragmentPcBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPcBinding.inflate(inflater, container, false)
        val root: View = binding.root

        pestañas = root.findViewById(R.id.tab1)
        viewPager = root.findViewById(R.id.viewp1)

        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.hp).setText("hp"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.dell).setText("Dell"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.lenovo).setText("Lenovo"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.acer).setText("Acer"))
        pestañas.addTab(pestañas.newTab().setIcon(R.drawable.asus).setText("Asus"))

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
                0 -> fragment = Hp()
                1 -> fragment = Dell()
                2 -> fragment = Lenovo()
                3 -> fragment = Acer()
                4 -> fragment = Asus()
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
