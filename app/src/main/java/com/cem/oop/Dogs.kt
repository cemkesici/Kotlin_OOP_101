package com.cem.oop

class Dogs:Animals() {

    fun hayvanFonksiyonu(){//miras alınan sınıftaki fonksiyona erişiyoruz
        super.sesCikar()//super ile miras alınan sınıftaki fonksiyonu çağırıyorum
    }
    override fun sesCikar(){
        println("Köpek Sesi")
    }
}