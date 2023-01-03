import no3.No3Solution


    fun no1Test() {

    }

    fun no2Test() {

    }

    fun no3Test() {
        // given
        val no3 = No3Solution()
        val response = no3.factorial(5)
        // expect 120
        println("결과값 $response 이 기댓값 120 과 같습니다")
    }

    fun main() {
        /*val no1 = No1Solution()
        no1.no1Solution()*/

        val no3 = No3Solution()
        val response = no3.factorial(1000000)
        println(response.toString())
    }

