package codility

fun main() {
    //println(isPalindrome(0))


    println(isPalindrome(2147483647))
    println(isPalindrome(99999999999.toInt()))
}

fun isPalindrome(x: Int): Boolean {
    if (x<0) {
        return false
    }
    if (x in 0..9) {
        return true
    }
    var output = 0
    var number = x
    while (number > 0) {
        output = output * 10 + number % 10

        number /= 10
    }

    return x==output
}