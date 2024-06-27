import kotlin.io.*

fun main() {
    val names = mutableListOf<String>()

    print("Enter the names separated by commas to be sorted in alphabetical order: ")
    val input = readLine() ?: return

    names.addAll(input.split(","))
    names.sort()

    println("\nSorted names below:")
    var i = 0
    while(i < names.size) {
        println(names[i])
        i++
    }
}
