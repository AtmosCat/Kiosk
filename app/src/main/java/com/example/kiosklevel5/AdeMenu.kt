package com.example.kiosklevel1

open class Ade(price: Int, kcal: Int, name: String, num1:Int=2) : Menu(price, kcal, name, num1) {
}

class GreenGrapeAde(price: Int, kcal: Int, name:String) : Ade(price, kcal, name){
}

class LemonAde(price: Int, kcal: Int, name:String) : Ade(price, kcal, name){
}

class GrapeFruitAde(price: Int, kcal: Int, name:String) : Ade(price, kcal, name){
}