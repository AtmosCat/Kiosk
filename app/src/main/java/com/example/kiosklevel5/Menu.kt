package com.example.kiosklevel1

// 수퍼 클래스 - 메인 메뉴판
open class Menu(price: Int, kcal: Int, name:String, var num1 : Int) {
    var price: Int
    var kcal: Int
    var name : String

    init {
        this.price = price
        this.kcal = kcal
        this.name = name
    }

    open fun displayInfo(){
        println("${name} - ${price}원 / ${kcal}kcal")
    }
}


