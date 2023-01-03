package no1.test

import no1.util.BreadType

data class ButterBread(
    override var breadType: BreadType = BreadType.BUTTER,
    override val flour: Int,
    override val water: Int,
    val butter: Int
): Bread(breadType, flour, water) {
    override fun toString(): String {
        return "breadType=$breadType\nflour=$flour\nwater=$water\nbutter=$butter"
    }
}
