package no1.factory

import no1.dto.BreadRequest
import no1.test.Bread
import no1.test.ButterBread
import no1.test.CreamBread
import no1.test.SugarBread
import no1.util.BreadType

object BreadFactory {
    fun getBread(request: BreadRequest, breadTypeItem: Int): Bread {
        return when(request.breadType) {
            BreadType.BUTTER -> ButterBread(
                breadType = BreadType.BUTTER,
                flour = request.flour,
                water = request.water,
                butter = breadTypeItem
            )
            BreadType.CREAM -> CreamBread(
                breadType = BreadType.CREAM,
                flour = request.flour,
                water = request.water,
                cream = breadTypeItem
            )
            BreadType.SUGAR -> SugarBread(
                breadType = BreadType.SUGAR,
                flour = request.flour,
                water = request.water,
                sugar = breadTypeItem
            )
        }
    }
}