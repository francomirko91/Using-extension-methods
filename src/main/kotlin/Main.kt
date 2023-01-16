fun main() {
    val values = Values(listOf(45, 433, 765, 87659, 654675, 566534, 656, 4346565, 36, 56, 45, 46, 3))
    val result = values.a.filterList()
    result.printValues()


}

data class Values(val a: List<Int>)

fun List<Int>.filterList(): List<Int> {
    return this.filter { it < 500 }


}

fun List<Int>.printValues() {
    this.forEach { println(it) }


}










