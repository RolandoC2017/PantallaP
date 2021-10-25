package com.example.pantallap.ui.componente;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pantallap.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentComponente#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentComponente extends Fragment {

    View vista;
    private AppBarLayout appbar;
    private TabLayout pestañas;
    private ViewPager viewPager;
    private PagerAdapter adapter;

    public fragmentComponente() {
        // Required empty public constructor
    }

    public static fragmentComponente newInstance(String param1, String param2) {
        fragmentComponente fragment = new fragmentComponente();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_componente, container, false);

      /* pestañas = vista.findViewById(R.id.tab);
       viewPager = vista.findViewById(R.id.viewp);

       pestañas.addTab(pestañas.newTab().setIcon(R.drawable.ic_menu_camera).setText("LG"));
       pestañas.addTab(pestañas.newTab().setIcon(R.drawable.ic_celular).setText("Xiaomi"));

       adapter = new PagerAdapter(getChildFragmentManager(),pestañas.getTabCount());
       viewPager.setAdapter(adapter);
       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(pestañas));
       pestañas.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               viewPager.setCurrentItem(tab.getPosition());
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });*/

        return vista;
    }

   /* public class PagerAdapter extends FragmentPagerAdapter{

        int numeroTab;
        public PagerAdapter(FragmentManager fm, int numerosTab) {
            super(fm);
            this.numeroTab = numerosTab;
        }
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position){
                case 0: fragment = new fragmentContenedor(); break;
                case 1: fragment = new Xiaomi(); break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return numeroTab;
        }
    }*/
}