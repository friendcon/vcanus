package no1.test

import no1.util.BreadType

data class CreamBread(
    override var breadType: BreadType = BreadType.CREAM,
    override val flour: Int,
    override val water: Int,
    val cream: Int
): Bread(breadType, flour, water) {
    override fun toString(): String {
        return "breadType=$breadType\nflour=$flour\nwater=$water\ncream=$cream"
    }
}

