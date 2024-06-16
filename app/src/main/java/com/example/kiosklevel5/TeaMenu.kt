package com.example.kiosklevel1

open class Tea(price: Int, kcal: Int, name: String, num1:Int=3) : Menu(price, kcal, name, num1) {
}

class PepperMintTea(price: Int, kcal: Int, name:String) : Tea(price, kcal, name){
}

class GreenTea(price: Int, kcal: Int, name:String) : Tea(price, kcal, name){
}

class IceTea(price: Int, kcal: Int, name:String) : Tea(price, kcal, name){
}