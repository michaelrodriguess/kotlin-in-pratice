import kotlin.io.*

fun main() {
    val names = mutableListOf<String>()

    print("Enter the names separated by commas to be sorted in alphabetical order: ")
    val input = readLine() ?: return

    names.addAll(input.split(",").map { it.trim() })
    names.sort()

	if(names.size > 1)
	{
		println("\nSorted names below:")
		var i = 0
	    while(i < names.size) {		
		    println(names[i])
			i++
	    }
	} else {
		println("\nAre you kidding me, just one name? \nI need more than one name to work my little young man")
	}
}
