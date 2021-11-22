package com.example.pantallap.BD

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Conexion(var context: Context): SQLiteOpenHelper(context,"CarritoCompras",null,1){

    override fun onCreate(p0: SQLiteDatabase?) {

        var tablaFavorito = "CREATE TABLE BDFavoritos(id Integer not null primary key autoincrement,nombre String,precio1 String,precio2 Double, imagen Integer, descripcion Text)"
        p0?.execSQL(tablaFavorito)

        var tablaCarrito = "CREATE TABLE BDcarrito(id Integer not null primary key autoincrement,nombre String, precio1 Double, precio2 Double, imagen Integer, cantidad Integer)"
        p0?.execSQL(tablaCarrito)

        var tablaUsuario = "CREATE TABLE BDusuario(id Integer not null primary key autoincrement,nombre String, usuario String, email String, password String)"
        p0?.execSQL(tablaUsuario)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }

    fun eliminar(Nombre: String): String {
        var mensaje = ""
        val db = this.writableDatabase
        val cantidad = db.delete("BDcarrito", "nombre='$Nombre'", null)
        if (cantidad != 0) {
            mensaje = "Producto Eliminado del Carrito"
        } else {
            mensaje = "No hay registros que eliminar"
        }
        return mensaje
    }

    fun eliminarF(Nombre: String): String {
        var mensaje = ""
        val db = this.writableDatabase
        val cantidad = db.delete("BDFavoritos", "nombre='$Nombre'", null)
        if (cantidad != 0) {
            mensaje = "Producto Eliminado de favoritos"
        } else {
            mensaje = "No hay registros que eliminar"
        }
        return mensaje
    }
}