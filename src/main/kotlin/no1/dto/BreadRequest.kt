package no1.dto

import no1.util.BreadType

data class BreadRequest(
    val breadType: BreadType,
    val flour: Int,
    val water: Int
)
