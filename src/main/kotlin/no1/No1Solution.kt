package no1

import no1.dto.BreadRequest
import no1.factory.BreadFactory
import no1.test.Bread
import no1.util.BreadType
import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.FileOutputStream
import java.io.FileReader
import java.io.ObjectOutputStream
import java.io.Serializable

class No1Solution: Serializable {

    private fun changeToBreadType(breadType: String): BreadType {
        return when (breadType) {
            "cream" -> BreadType.CREAM
            "sugar" -> BreadType.SUGAR
            "butter" -> BreadType.BUTTER
            else -> throw RuntimeException("타입을 잘못 입력하셨습니다.")
        }
    }

    fun no1Solution() {
        val breadFactory = BreadFactory /** BreadFactory!! */
        val breadList = mutableListOf<Bread>() // Json 파일에서 받아온 Bread 저장

        val jsonParser = JSONParser() // jsonParser
        val reader = FileReader("bread.json") // 읽어올 json 파일

        val jsonArray = jsonParser.parse(reader) as JSONArray // 배열을 받아와야함

        // 배열 요소 하나씩 순회
        jsonArray.forEach {
            val jsonObject = it as JSONObject
            val recipe = jsonObject["recipe"] as JSONObject // recipe 안에 또 객체가 있으므로 JsonObject로 받아옴
            val breadType = jsonObject["breadType"].toString()

            val breadTypeName = changeToBreadType(breadType) // String -> Enum
            val flour = Integer.parseInt(recipe["flour"].toString())
            val water = Integer.parseInt(recipe["water"].toString())
            val item = Integer.parseInt(recipe[breadType.toLowerCase()].toString()) // 빵마다 요소 하나씩 다름

            // 공통부분은 BreadRequest 로 묶어줌
            val breadRequest = BreadRequest(
                breadTypeName,
                flour,
                water
            )


            val bread = breadFactory.getBread(breadRequest, item)

            // 리스트에 저장
            breadList.add(bread)
        }

        /*
        객체 직렬화하여 출력하는 것 실패
        val fileOutputStream = FileOutputStream("no1Result.txt")
        val objectOutputStream = ObjectOutputStream(fileOutputStream)
        breadList.forEach {
            objectOutputStream.writeObject(it)
        }*/

        breadList.forEach {
            println(it.toString() + "\n")
        }
    }
}