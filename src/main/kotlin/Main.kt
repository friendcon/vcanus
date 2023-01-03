import no1.No1Solution
import no2.No2Solution
import no3.No3Solution

fun no1Test() {
        println("-----------no1-----------")
        val no1 = No1Solution()
        no1.no1Solution()
    }

    fun no2Test() {
        println("-----------no2-----------")
        val no2 = No2Solution()
        no2.add(100).subtract(20).add(20).add(20).out()
    }

    fun no3Test() {
        println("-----------no3-----------")
        // given
        val no3 = No3Solution()
        val response = no3.factorial(5)
        // expect 120
        println("결과값 $response 이 기댓값 120 과 같습니다")
    }

    fun main() {
            no1Test()
        no2Test()
            no3Test()

    }

