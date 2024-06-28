fun main() {
    
	print("Digite o número da conta: ")
	val accountNumber  = readLine()?.toIntOrNull() ?: 0

    while (true) {
       
        println("Menu:")
        println("1. Consultar Saldo")
        println("2. Sacar")
        println("3. Depositar")
        println("0. Sair")

        print("Digite sua opção: ")
		val opcao = readLine()?.toIntOrNull() ?: 0

        if (opcao == 0) {
            break
        } else if (opcao == 1) {
           println("Seu saldo é de: valorAqui\n")
        } else if (opcao == 2) {
            println("Digite o valor para SAQUE: ")
            val valor = readLine()?.toDoubleOrNull()
			println("\nO valor sacado foi: ${valor}")
        } else if (opcao == 3) {
            println("Digite o valor para DEPOSITAR: ")
            val valor = readLine()?.toDoubleOrNull()
			println("\nO valor depositador foi: ${valor}")
        }

    }
        println("\nObrigado por usar o simulador de caixa eletrônico da BrazilianCriaMakers!")
}
