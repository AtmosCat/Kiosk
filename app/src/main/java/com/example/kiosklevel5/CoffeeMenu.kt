package com.example.kiosklevel1

// 서브 클래스 - 커피 상속
open class Coffee(price: Int, kcal: Int, name: String, num1:Int=1) : Menu(price, kcal, name, num1) {
}

class Americano(price: Int, kcal: Int, name:String) : Coffee(price, kcal, name) {
}

class Latte(price: Int, kcal: Int,name:String) : Coffee(price, kcal, name){
}

class CaramelMacchiato(price: Int, kcal: Int,name:String) : Coffee(price, kcal, name){
}

class Espresso(price: Int, kcal: Int,name:String) : Coffee(price, kcal, name){
}