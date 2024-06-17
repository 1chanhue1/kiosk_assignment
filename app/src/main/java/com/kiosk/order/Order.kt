package com.kiosk.order

import com.kiosk.menu.Menu

class Order {
    private val items = mutableListOf<Menu>()

    fun addItem(item: Menu) {
        items.add(item)
    }

    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }

    fun displayOrder(): String {
        return items.joinToString("\n") { it.displayInfo() } + "\nTotal: W ${getTotalPrice()}"
    }
}