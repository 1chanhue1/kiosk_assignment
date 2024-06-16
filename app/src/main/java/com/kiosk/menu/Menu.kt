package com.kiosk.menu

open class Menu(val name: String, val price: Double, val description: String) {
    open fun displayInfo(): String {
        return "$name | W $price | $description"
    }
}