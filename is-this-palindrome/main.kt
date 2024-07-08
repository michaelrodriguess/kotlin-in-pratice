fun main(args: Array<String>) {

    if (args.isNotEmpty() && args.size == 1) {

   	var str = args[0]

	var leftPointer = 0
	var rightPointer = str.length - 1


	while (leftPointer < rightPointer) {

		if (str[leftPointer] != str[rightPointer]) {
			println("$str não é um palíndromo mano")
			return	
		}
		leftPointer++
		rightPointer--

	}
	println("$str é um palíndromo!")
//        println("leftPointer: $leftPointer, rightPointer: $rightPointer")
    } else {
	println("Deve ser passado apenas o nome do programa e um parametro entre aspas! Como o exemplo abaixo!")
	println("Exemplo: ./is-this-palindrome.sh 'radar'")
    }
    	
}
