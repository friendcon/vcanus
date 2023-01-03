package no1.test

import no1.util.BreadType

data class SugarBread(
    override var breadType: BreadType = BreadType.SUGAR,
    override val flour: Int,
    override val water: Int,
    val sugar: Int
): Bread(breadType, flour, water) {
    override fun toString(): String {
        return "breadType=$breadType\nflour=$flour\nwater=$water\nsugar=$sugar"
    }
}
