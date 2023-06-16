package com.cem.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Suppress("UNUSED_VARIABLE") var kullanici=User("Cem",25)
        // kullanıcı değişkenlerine erişemiyoruz

        val unlu= Famous("Cem","Kesici",25,"Developer")
        //tanımlamamıza göre unlu objesi ile değişkenlere erişim sağlayabiliyoruz
        println(unlu.isim)//sadece değişkeni okuyabiliyoruz

        //println(unlu.soyisim)//okuma yada değiştirme yapamıyoruz.

        println(unlu.yas)//Değiştirme ve okuma işlemleri yapabiliyoruz.
        unlu.yas=30
        println(unlu.yas)

        println(unlu.meslek)// okuma işlemi yapamıyoruz ama değiştirme yapabiliyoruz
        unlu.meslek="Jr. Developer"
        println(unlu.meslek)
    }


}