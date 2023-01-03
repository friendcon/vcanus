import no3.No3Solution
import no1.No1Solution

    fun no1Test() {
        val no1 = No1Solution()
        no1.no1Solution()
        println("-----------no1-----------")
    }

    fun no3Test() {
        // given
        val no3 = No3Solution()
        val response = no3.factorial(5)
        // expect 120
        println("결과값 $response 이 기댓값 120 과 같습니다")
    }

    fun main() {
            no1Test()
            no3Test()
    }

