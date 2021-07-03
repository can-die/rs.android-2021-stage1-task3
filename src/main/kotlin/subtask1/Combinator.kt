package subtask1

class Combinator {

    fun Int.factorial(): Long {
        var res = 1L
        for (i in 2..this) {
            res = res * i
        }
        return res
    }

    fun getCombinations(from: Int, by: Int): Long {
        return from.factorial() / ((from - by).factorial() * by.factorial())
    }

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for (i in 1..array[1]) {
            if (getCombinations(array[1], i) >= array[0])
                return i
        }
        return null
    }
}
