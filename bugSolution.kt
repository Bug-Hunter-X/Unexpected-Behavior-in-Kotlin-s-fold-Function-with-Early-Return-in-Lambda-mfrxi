fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.fold(0) { acc, i ->
        var newAcc = acc
        if (i != 3) newAcc += i
        newAcc
    }
    println(sum) // Output: 15
}