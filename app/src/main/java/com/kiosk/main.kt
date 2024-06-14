package com.kiosk

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("[ SHAKESHACK MENU ]")
    println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drinks          | 매장에서 직접 만드는 음료")
    println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0. 종료             | 프로그램 종료")
    while (true) {

        val shakeshack_menu = scanner.nextInt()
        if (shakeshack_menu == 0) {
            break
        } else if (shakeshack_menu == 1) {
            println("[ Burgers MENU ]")
            println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
            println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
            println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
            println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
            println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
            println("0. 뒤로가기      | 뒤로가기")
            val burgers_menu = scanner.nextInt()
            if (burgers_menu == 0) {
                continue
            }
        } else if (shakeshack_menu == 2) {
            println("[ Frozen Custard MENU ]")
            println("1. Vanilla Custard  | W 3.9 | 바닐라 아이스크림")
            println("2. Chocolate Custard| W 3.9 | 초콜릿 아이스크림")
            println("3. Coffee Custard   | W 4.1 | 커피 아이스크림")
            println("4. Seasonal Special | W 4.5 | 시즌 특제 아이스크림")
            println("0. 뒤로가기        | 뒤로가기")
            val custard_menu = scanner.nextInt()
            if (custard_menu == 0) {
                continue
            }
        } else if (shakeshack_menu == 3) {
            println("[ Drinks MENU ]")
            println("1. Lemonade       | W 2.5 | 레모네이드")
            println("2. Iced Tea       | W 2.5 | 아이스 티")
            println("3. Coke           | W 2.0 | 콜라")
            println("4. Bottled Water  | W 1.5 | 생수")
            println("0. 뒤로가기       | 뒤로가기")
            val drinks_menu = scanner.nextInt()
            if (drinks_menu == 0) {
                continue
            }
        } else if (shakeshack_menu == 4) {
            println("[ Beer MENU ]")
            println("1. ShackMeister Ale     | W 5.0 | 쉑마이스터 에일")
            println("2. Shack Red Ale        | W 5.5 | 레드 에일")
            println("3. Seasonal Beer        | W 6.0 | 시즌 맥주")
            println("4. Brooklyn Lager       | W 6.5 | 브루클린 라거")
            println("0. 뒤로가기            | 뒤로가기")
            val beer_menu = scanner.nextInt()
            if (beer_menu == 0) {
                continue
            }
        }
    }
}