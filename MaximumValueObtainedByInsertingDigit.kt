//the maximum possible value obtained by inserting one '5' digit inside the decimal N

fun solution (N: Int): Int {
    val stringValue = N.toString()
    var maximumValue = Int.MIN_VALUE
    var index = 0
    if (N < 0) {
        index = 1
    }
    for (j1 in index until stringValue.length) {
        val testValue= Integer.parseInt(stringValue.substring(0, j1) + 5 + stringValue.substring(j1, stringValue.length))
        if (maximumValue < testValue)
            maximumValue = testValue;
    }
    return maximumValue
}
