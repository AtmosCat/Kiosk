package com.example.kiosklevel3

class Order {
    fun coffeeOrder(){
        println("커피 메뉴를 골라주세요.")
        println("[1] 아메리카노 / [2] 라떼 / [3] 카라멜 마끼아또 / [4] 에스프레소 / [9] 메인 메뉴")
    }
    fun adeOrder(){
        println("에이드 메뉴를 골라주세요.")
        println("[1] 청포도에이드 / [2] 레몬에이드 / [3] 자몽에이드 / [9] 메인 메뉴")
    }
    fun teaOrder() {
        println("티 메뉴를 골라주세요.")
        println("[1] 페퍼민트티 / [2] 녹차 / [3] 아이스티 / [9] 메인 메뉴")
    }
}