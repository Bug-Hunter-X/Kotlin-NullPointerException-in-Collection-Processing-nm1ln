fun main() {
    val list = listOf(1, 2, 3, 4, 5, null)
    val doubledList = list.mapNotNull { it?.times(2) }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val filteredList = list.filterNotNull().filter { it % 2 == 0 }
    println(filteredList) // Output: [2, 4]
}
