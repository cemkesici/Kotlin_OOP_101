package com.cem.oop

class Gitar : Instrument,Decoration {//sınıflar birden çok sınıftan kalıtım alamaz fakat Interface alabilir.
    var marka:String?=null
    var elektro:Boolean?=null

    override var Oda: String
        get() = "Mutfak"
        set(value) {}

    override fun IsInstrument() {
        println("Bu bir ensturman")
    }


}