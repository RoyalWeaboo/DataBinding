package com.malikazizali.beritabinding

import java.io.Serializable

data class Berita(var title : String, var date : String, var image : Int, var writer : String, var content : String) : Serializable
