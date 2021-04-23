//the maximum possible value obtained by inserting one '5' digit inside the decimal N

fun main() {
    println(solution(268, 5))
    println(solution(-999, 5))
    println(solution(7643, 5))
}

fun solution (N: Int, digitToInsert: Int): Int {
    val stringValue = N.toString()
    var maximumValue = Int.MIN_VALUE
    var index = 0
    if (N < 0) {
        index = 1
    }
    for (j1 in index until stringValue.length) {
        val testValue= Integer.parseInt(stringValue.substring(0, j1) + digitToInsert + stringValue.substring(j1, stringValue.length))
        if (maximumValue < testValue)
            maximumValue = testValue;
    }
    return maximumValue
}
