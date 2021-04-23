package codility

/**
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is
[6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

fun solution(A: IntArray, K: Int): IntArray

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

A = [3, 8, 9, 7, 6]
K = 3
the function should return [9, 7, 6, 3, 8].

For another example, given

A = [0, 0, 0]
K = 1
the function should return [0, 0, 0]

Given

A = [1, 2, 3, 4]
K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */

fun main() {
    println(solution(intArrayOf(1, 2, 3, 4, 5), 4).toList())
    println(solution(intArrayOf(-145, 452, -783, 444), 14).toList())
    println(solution(intArrayOf(3, 8, 9, 7, 6), 3).toList())
    println(solution(intArrayOf(1), 3).toList())
    println(solution(intArrayOf(1, 2), 3).toList())
    println(solution(intArrayOf(-1, -2, -3), 1).toList())
    println(solution(intArrayOf(-1, 0, -2), 2).toList())
}

fun solution(A: IntArray, K: Int): IntArray {
    // write your code in Kotlin
    var maxRotation = K
    if (A.isEmpty()) {
        return A
    }

    if (maxRotation % A.size == 0) {
        return A
    } else {
        maxRotation %= A.size
    }
    val newArr = IntArray(A.size)
    for (i in A.indices) {
        when {
            (i + maxRotation < A.size) -> {
                newArr[i + maxRotation] = A[i]
            }
            (i + maxRotation >= A.size) -> {
                newArr[(i + maxRotation) - A.size] = A[i]
            }
        }
    }

    return newArr.toTypedArray().toIntArray()
}
