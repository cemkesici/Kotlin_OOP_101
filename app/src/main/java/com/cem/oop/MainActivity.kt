package com.cem.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Suppress("UNUSED_VARIABLE")
        var kullanici=User("Cem",25)
        // kullanıcı değişkenlerine erişemiyoruz

        println("-----Class-----")
        val unlu= Famous("Cem","Kesici",25,"Developer")

        println("-----Encapsulation-----")
        //tanımlamamıza göre unlu objesi ile değişkenlere erişim sağlayabiliyoruz
        println(unlu.isim)//sadece değişkeni okuyabiliyoruz
        //println(unlu.soyisim)//okuma yada değiştirme yapamıyoruz.
        println(unlu.yas)//Değiştirme ve okuma işlemleri yapabiliyoruz.
        unlu.yas=30
        println(unlu.yas)
        println(unlu.meslek)// okuma işlemi yapamıyoruz ama değiştirme yapabiliyoruz
        unlu.meslek="Jr. Developer"
        println(unlu.meslek)

        println("-----Inheritance-----")
        //Miras alan sınıftan obje tanımlayıp değişkenlere erişmeye çalışıyoruz
        val Ozelunlu=SpecialFamous("Zeki","Müren",50,"Ünlü")
        println(Ozelunlu.isim)//sadece değişkeni okuyabiliyoruz
        println(Ozelunlu.yas)//Değiştirme ve okuma işlemleri yapabiliyoruz.
        Ozelunlu.yas=55
        println(Ozelunlu.yas)
        println(Ozelunlu.meslek)// okuma işlemi yapamıyoruz ama değiştirme yapabiliyoruz
        Ozelunlu.meslek="Şarkıcı"
        println(Ozelunlu.meslek)

        println("-----Polimorphism-----")
        val islem=Islemler() // aynı sınıf içerisinde farklı parametre değerleri ile fonksiyon yapabiliyoruz
        islem.carpma()
        islem.carpma(12,15)
        islem.carpma(16,13,16)

        //miras alınan sınıflarda aynı isimli fonksiyon hata verecektir bu yüzden ovveride ederek üstüne yazmamız ve miras veren fonksiyonu open yapmamız gereklidir.
        val hayvan=Animals()
        hayvan.sesCikar()
        val kopek=Dogs()
        kopek.sesCikar()
        kopek.hayvanFonksiyonu()//miras alınan sınıfa erişen fonksiyon

        println("-----Abstarction-----")
        // abstract sınıf obje oluşturulamayan sınıflardır
        //val caniliobj=Canli()//Abstract sınıftan obje tanımlayamıyoruz
        // user sınıfına kalıtım verdiğimiz için oradan erişebiliyoruz
        val kullanici2=User("Ali",32)
        kullanici2.CanliSinifi()//Canli sınıfında tanımladığımı fonksiyon geldi.


        println("-----Interface-----")
        //Interface
        //Sınıflar birden çok sınıftan kalıtım alamaz fakat birden çok Interfaceden alabilir.
        //Interface %100 soyut bir sınıftır obje oluşturulamaz
        val gitar=Gitar()
        gitar.marka="A markası"
        gitar.elektro=true

        println(gitar.Oda)
        gitar.IsInstrument()

    }


}