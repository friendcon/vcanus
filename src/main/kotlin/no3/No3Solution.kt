package no3

class No3Solution {
    fun factorial(num: Int): Int {
        if(num == 1 || num == 0) {
            return 1
        }

        return num*factorial(num-1)
    }
}