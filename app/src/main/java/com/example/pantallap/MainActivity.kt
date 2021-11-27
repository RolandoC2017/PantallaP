package com.example.pantallap

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pantallap.Adapters.CarritoAdapter
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.Data.itemCarrito
import com.example.pantallap.Data.itemUsuario
import com.example.pantallap.Login.Login
import com.example.pantallap.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.ver_productos_detalle.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_principal, R.id.nav_celular, R.id.nav_pc, R.id.nav_smartwatch,R.id.nav_realidadvirtual,
                R.id.nav_componente, R.id.nav_zonagamer, R.id.nav_shop, R.id.nav_favoritos, R.id.nav_cuenta
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val botonCar = findViewById<ImageButton>(R.id.toolbarCar)

        val bienvenido = navView.getHeaderView(0).findViewById<TextView>(R.id.tbienvenido)
        val iniciarS = navView.getHeaderView(0).findViewById<Button>(R.id.btnLogin)

        var Mmenu = navView.menu
        var favorito : MenuItem = Mmenu.findItem(R.id.nav_favoritos)
        var carrito : MenuItem = Mmenu.findItem(R.id.nav_shop)
        var cuenta : MenuItem = Mmenu.findItem(R.id.nav_cuenta)
        var cerrarS : MenuItem = Mmenu.findItem(R.id.nav_cerrar)

        favorito.setVisible(false)
        carrito.setVisible(false)
        cerrarS.setVisible(false)
        cuenta.setVisible(false)
        iniciarS.visibility = Button.VISIBLE


        var usuario = intent.getSerializableExtra("user") as itemUsuario?

        if (usuario != null) {
            bienvenido.text = getString(R.string.nombreU, usuario.nombreU)
            favorito.setVisible(true)
            carrito.setVisible(true)
            cerrarS.setVisible(true)
            cuenta.setVisible(true)
            iniciarS.visibility = Button.INVISIBLE
        }

        iniciarS.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
        }

        botonCar.setOnClickListener {
            var intent = Intent(this, LlamarFragment::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
 }