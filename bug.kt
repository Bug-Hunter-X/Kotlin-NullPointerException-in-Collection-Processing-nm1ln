fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val filteredList = list.filter { it % 2 == 0 }
    println(filteredList)
}