fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.fold(0) { acc, i ->
        if (i == 3) return@fold acc // Incorrect return
        acc + i
    }
    println(sum) // Output: 14. Expected: 15
}