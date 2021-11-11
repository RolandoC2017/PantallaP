package com.example.pantallap.BD

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Conexion(var context: Context): SQLiteOpenHelper(context,"prueba1",null,1){
    override fun onCreate(p0: SQLiteDatabase?) {
        var tablaCarrito = "CREATE TABLE prueba1(id Integer not null primary key autoincrement,nombre String, precio1 Double, precio2 Double,imagen Integer, cantidad Integer)"
        p0?.execSQL(tablaCarrito)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

}