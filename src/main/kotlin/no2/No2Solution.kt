package no2

class No2Solution {
    private var response: Long = 0L

    fun add(num: Long): No2Solution {
        response += num
        return this
    }

    fun subtract(num: Long): No2Solution {
        response -= num
        return this
    }

    fun out() {
        println("결과값 $response 는 기댓값 120과 같습니다")
    }
}