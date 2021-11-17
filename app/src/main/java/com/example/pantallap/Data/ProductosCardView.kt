package com.example.pantallap.Data

import java.io.Serializable

data class ProductosCardView(val nombre:String, val precio1:String, val precio2:String, val imagen: Int, val descripcion:String, var favorito:Boolean):Serializable
