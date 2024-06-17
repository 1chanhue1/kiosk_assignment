package com.kiosk

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val menu = ShackShackMenu()

    while (true) {
        println(menu.showMainMenu())
        when (scanner.nextInt()) {
            1 -> showSubMenu("Burgers")
            2 -> showSubMenu("Frozen Custard")
            3 -> showSubMenu("Drinks")
            4 -> showSubMenu("Beer")
            0 -> {
                println("프로그램을 종료합니다.")
                return
            }
            else -> println("잘못된 입력입니다. 다시 시도해주세요.")
        }
    }
}
fun showSubMenu(menuType: String) {
    val scanner = Scanner(System.`in`)
    val menu = ShackShackMenu()

    while (true) {
        println(menu.showSubMenu(menuType))
        val subChoice = scanner.nextInt()
        if (subChoice == 0) {
            return
        } else {
            println("잘못된 입력입니다. 다시 시도해주세요.")
        }
    }
}