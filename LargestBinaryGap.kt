package codility

/**
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is
surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
The number 20 has binary representation 10100 and contains one binary gap of length 1.
The number 15 has binary representation 1111 and has no binary gaps.
The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

fun solution(N: Int): Int

that, given a positive integer N, returns the length of its longest binary gap.
The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and
so its longest binary gap is of length 5.

Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
 */
fun main() {

    if (2 == solution(9)) {
        println("passed")
    } else {
        println("failed")
    }
    if (5 == solution(1041)) {
        println("passed")
    } else {
        println("failed")
    }
    if (4 == solution(529)) {
        println("passed")
    } else {
        println("failed")
    }
    if (0 == solution(15)) {
        println("passed")
    } else {
        println("failed")
    }
    if (0 == solution(32)) {
        println("passed")
    } else {
        println("failed")
    }

    if (0 == solution(1024)) {
        println("passed")
    } else {
        println("failed")
    }
}

fun solution0(N: Int): Int {
    // converting decimal to binary
    val binary = Integer.toBinaryString(N)
    val splitList = binary.toString().split("1")
    var length = 0
    for (index in 1..splitList.size - 2) {
        val value = splitList[index]
        if (value.contains("0")) {
            if (length < value.length) {
                length = value.length
            }
        }
    }
    return length
}

fun solution1(N: Int): Int {
    // converting decimal to binary
    val binary = Integer.toBinaryString(N)
    val splitList = binary.toString().split("1")
    var length = 0
    for (index in 1..splitList.size - 2) {
        val value = splitList[index]
        if (value.contains("0")) {
            if (length < value.length) {
                length = value.length
            }
        }
    }
    return length
}

fun solution(N: Int): Int {
    val binary = Integer.toBinaryString(N)
    var i = 0
    var j = 0
    var subString = ""
    var  length = 0
    while (j < binary.length) {
        if (!subString.contains(binary[j])) {
            subString += binary[j]
            j++

            println("inside if subString == $subString")

            // checking length here to avoid multiple times call outside if block
            if (length < subString.length) {
                length = subString.length
                println("max length == $length")
            }
        } else {
            i++
            subString = binary.substring(i, j)
            println("inside else subString == $subString")
        }
    }
    return length
}






