package com.cem.oop

open class Famous (isim:String, soyisim:String, yas:Int, job:String){//kalıtım vereceği için open olarak tanımladık
    //var isim:String?=isim isim değişkeni dışardan obje ile erişilip değiştirilmesini istediğimizde kullanabiliriz

    var yas:Int?=yas//değiştirme ve erişme işlemleri yapabiliyoruz

    var isim:String ?= isim//veri obje üstünden okunsun ama değiştirilmesin istiyorsak tanımlama böyle olmalı
        private set//private yaparak dışardan veriyi değiştirmeyi engelliyoruz
        get //dışardan veriyi okumayı public bırakıyoruz

    private var soyisim:String?=soyisim // okuma ve değiştirmei işlemi yapılmamsı için böyle tanımlarız

    public var meslek: String?=job//değiştirme ve erişme işlemleri yapabiliyoruz
}