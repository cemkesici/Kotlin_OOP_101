package com.cem.oop

class User:Canli {//Canli abstract sınıfından kalıtım aldık
    private var isim: String? = null
    private var yas: Int? = null

    constructor(isim: String, yas: Int) {
        this.isim = isim
        this.yas = yas
        println("constructor starting")
    }

    init {
        println("init starting")
    }
}