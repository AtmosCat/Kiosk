// [Cafe Matthew's 카페 키오스크]
// Lv1

package com.example.kiosklevel1

import com.example.kiosklevel3.Order
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat
import kotlin.concurrent.thread

fun main() {
//
//    val currentTime : Long = System.currentTimeMillis()
//    val now = SimpleDateFormat("hh:mm:ss")
//    val time = now.format(currentTime)
//    val stopTimeStart = "23:30:00"
//    val stopTimeEnd = "00:30:00"
//    println(currentTime)
//    println(time)
//
//    if (time >= stopTimeStart && time <= stopTimeEnd){
//        println("은행 점검 시간입니다.")
//    } else println("진행합니다")
//

    var budget: Int = 30000
    var sumPrice: Int =0

    val americano = Americano(4500, 100, "아메리카노")
    val latte = Latte(5000, 200, "라떼")
    val caramelMacchiato = CaramelMacchiato(5500, 300, "카라멜마끼아또")
    val espresso = Espresso(4000, 50, "에스프레소")

    val greenGrapeAde = GreenGrapeAde(5500, 200, "청포도에이드")
    val lemonAde = LemonAde(5500, 230, "레몬에이드")
    val grapeFruitAde = GrapeFruitAde(5500, 250, "자몽에이드")

    val pepperMintTea = PepperMintTea(5000, 10, "페퍼민트티")
    val greenTea = GreenTea(5000, 10, "녹차")
    val iceTea = IceTea(5000, 100, "아이스티")

    val menuList = listOf(americano, latte, caramelMacchiato, espresso,
                            greenGrapeAde, lemonAde, grapeFruitAde, pepperMintTea, greenTea, iceTea)

    println("내 지갑에는 ${budget}원이 있습니다.")

    println("Cafe Matthew's에 오신 것을 환영합니다.")
    println("[Cafe Matthew's Menu]")
    println("************************************")

    for (beverage in menuList) {
        beverage.displayInfo()
    }
    println("************************************")
    println("메인 메뉴를 선택해주세요.")
    println("[1] 커피류 / [2] 에이드 / [3] 티 / [-1] 종료")
    var mainOption = 0
    var moreCoffeeOption:Int = 0
    var moreAdeOption:Int = 0
    var moreTeaOption:Int = 0

    val order = Order()

    var cart = emptyList<String>()

    while (true) {
        try {
            mainOption = readLine()!!.toInt()
        } catch (e:java.lang.NumberFormatException) {
            println("숫자를 입력하세요")
        }
        if (mainOption == 1) {
            order.coffeeOrder()
            while (true) {
                try {
                    moreCoffeeOption = readLine()!!.toInt()
                } catch (e:java.lang.NumberFormatException) {
                    println("숫자를 입력하세요")
                }
                when (moreCoffeeOption) {
                    1 -> {
                        println("아메리카노가 장바구니에 담겼습니다.")
                        cart += "아메리카노"
                        sumPrice += americano.price
                    }

                    2 -> {
                        println("라떼가 장바구니에 담겼습니다.")
                        cart += "라떼"
                        sumPrice += latte.price
                    }

                    3 -> {
                        println("카라멜 마끼아또가 장바구니에 담겼습니다.")
                        cart += "카라멜 마끼아또"
                        sumPrice += caramelMacchiato.price
                    }

                    4 -> {
                        println("에스프레소가 장바구니에 담겼습니다.")
                        cart += "에스프레소"
                        sumPrice += espresso.price
                    }

                    9 -> {
                        println("메인 메뉴로 이동합니다.")
                        println("메인 메뉴를 선택해주세요.")
                        println("[1] 커피류 / [2] 에이드 / [3] 티 / [-1] 종료")
                        break
                    }
                    else -> {
                        println("값을 다시 입력해주세요.")
                    }
                }
            }
        } else if (mainOption == 2) {
            order.adeOrder()
            while (true) {
                try {
                    moreAdeOption = readLine()!!.toInt()
                } catch (e:java.lang.NumberFormatException) {
                    println("숫자를 입력하세요")
                }
                when (moreAdeOption) {
                    1 -> {
                        println("청포도에이드가 장바구니에 담겼습니다.")
                        cart += "청포도에이드"
                        sumPrice += greenGrapeAde.price
                    }

                    2 -> {
                        println("레몬에이드가 장바구니에 담겼습니다.")
                        cart += "레몬에이드"
                        sumPrice += lemonAde.price
                    }

                    3 -> {
                        println("자몽에이드가 장바구니에 담겼습니다.")
                        cart += "자몽에이드"
                        sumPrice += grapeFruitAde.price
                    }

                    9 -> {
                        println("메인 메뉴로 이동합니다.")
                        println("메인 메뉴를 선택해주세요.")
                        println("[1] 커피류 / [2] 에이드 / [3] 티 / [-1] 종료")
                        break
                    }

                    else -> {
                        println("값을 다시 입력해주세요.")
                    }
                }
            }
        } else if (mainOption == 3) {
            order.teaOrder()
            while (true) {
                try {
                    moreTeaOption = readLine()!!.toInt()
                } catch (e:java.lang.NumberFormatException) {
                    println("숫자를 입력하세요")
                }
                when (moreTeaOption) {
                    1 -> {
                        println("페퍼민트티가 장바구니에 담겼습니다.")
                        cart += "페퍼민트티"
                        sumPrice += pepperMintTea.price
                    }

                    2 -> {
                        println("녹차가 장바구니에 담겼습니다.")
                        cart += "녹차"
                        sumPrice += greenTea.price
                    }

                    3 -> {
                        println("아이스티가 장바구니에 담겼습니다.")
                        cart += "아이스티"
                        sumPrice += iceTea.price
                    }

                    9 -> {
                        println("메인 메뉴로 이동합니다.")
                        println("메인 메뉴를 선택해주세요.")
                        println("[1] 커피류 / [2] 에이드 / [3] 티 / [-1] 종료")
                        break
                    }
                    else -> {
                        println("값을 다시 입력해주세요.")
                    }
                }
            }
        } else if (mainOption == -1) {
            println("장바구니를 나갑니다.")
            println("${cart}를 주문합니다.")

            thread(start = true) {
                for(i in 1..3){
                    println("결제중입니다...("+i+"/3)")
                    runBlocking {
                        launch {
                            delay(1000)
                        }
                    }
                }
                if (sumPrice <= budget) {
                    println("결제가 완료되었습니다.")
                    println("총액: "+sumPrice+"원 | 잔액: "+(budget - sumPrice)+"원")
                } else println("잔액이 부족합니다.")
            }
            break
        } else {
            println("값을 다시 입력해주세요")
        }
    }
}











