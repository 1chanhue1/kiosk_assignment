package com.kiosk

import com.kiosk.menu.Beer
import com.kiosk.menu.Burger
import com.kiosk.menu.Drinks
import com.kiosk.menu.FrozenCustard

class ShackShackMenu {
    private val burgers = listOf(
        Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
        Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
        Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
        Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
        Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
    )

    private val frozenCustards = listOf(
        FrozenCustard("Vanilla", 4.5, "바닐라 맛 아이스크림"),
        FrozenCustard("Chocolate", 4.5, "초콜릿 맛 아이스크림"),
        FrozenCustard("Strawberry", 4.5, "딸기 맛 아이스크림"),
        FrozenCustard("Mint", 4.5, "민트 맛 아이스크림")
    )

    private val drinks = listOf(
        Drinks("Cola", 2.0, "시원한 콜라"),
        Drinks("Lemonade", 3.0, "상큼한 레모네이드"),
        Drinks("Iced Tea", 2.5, "시원한 아이스 티"),
        Drinks("Water", 1.0, "생수")
    )

    private val beers = listOf(
        Beer("Pale Ale", 7.0, "상큼한 페일 에일 맥주"),
        Beer("IPA", 8.0, "진한 맛의 IPA 맥주"),
        Beer("Stout", 8.5, "깊고 풍부한 맛의 스타우트 맥주"),
        Beer("Lager", 6.5, "가벼운 맛의 라거 맥주")
    )

    fun showMainMenu(): String {
        return """
            [ SHAKESHACK MENU ]
            1. Burgers         | 앵거스 비프 통살을 다져만든 버거
            2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림
            3. Drinks          | 매장에서 직접 만드는 음료
            4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
            0. 종료            | 프로그램 종료
        """.trimIndent()
    }

    fun showSubMenu(menuType: String): String {
        return when (menuType) {
            "Burgers" -> burgers.joinToString("\n") { it.displayInfo() } + "\n0. 뒤로가기      | 뒤로가기"
            "Frozen Custard" -> frozenCustards.joinToString("\n") { it.displayInfo() } + "\n0. 뒤로가기      | 뒤로가기"
            "Drinks" -> drinks.joinToString("\n") { it.displayInfo() } + "\n0. 뒤로가기      | 뒤로가기"
            "Beer" -> beers.joinToString("\n") { it.displayInfo() } + "\n0. 뒤로가기      | 뒤로가기"
            else -> "잘못된 입력입니다. 다시 시도해주세요."
        }
    }
}