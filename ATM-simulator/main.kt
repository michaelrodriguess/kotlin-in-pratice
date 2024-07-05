
fun main() {
	val accounts = mutableMapOf<Int, Account>()

	accounts[1] = Account(1, 0.00)
	accounts[2] = Account(2, 0.00)
	accounts[3] = Account(3, 0.00)
	accounts[4] = Account(4, 0.00)
	accounts[5] = Account(5, 0.00)

	print("Digite o número da conta: ")
	val accountNumber  = readLine()?.toIntOrNull() ?: 0

	
	if (!accounts.containsKey(accountNumber)) {
        	println("Conta não encontrada! Tente novamente.")
		return
	}

	val account = accounts[accountNumber]!!

	while (true)
	{
		clearScreen()
	        println("Menu:")
        	println("1. Consultar Saldo")
        	println("2. Sacar")
        	println("3. Depositar")
	        println("0. Sair")

        	print("Digite sua opção: ")
		val option = readLine()?.toIntOrNull() ?: 0
		
		clearScreen()
		when(option) {
			1 -> {
				val balance = account.checkBalance()
				println("Seu saldo é de: R$$balance\n")
				pause()
			}
			2 -> {
				print("Digite o valor para saque: R$")
				val value = readLine()?.toDoubleOrNull() ?: 0

				account.GetMoney(value.toDouble())
				pause()
			}
			3 -> {
				print("Digite o valor para depósito: R$")
            			val value = readLine()?.toDoubleOrNull() ?: 0

				account.depositMoney(value.toDouble())
				pause()
			}
			0 -> {
				println("\nObrigado por usar o simulador de caixa eletrônico da Bank Brazilian Cria Makers!")
                		break
			}
			else -> {
				println("Opção inválida!\n")
				pause()
			}
		}
	}
}

fun clearScreen() {
	print("\u001b[H\u001b[2J")
	System.out.flush()
}

fun pause() {
    	println("Pressione Enter para continuar...")
	readLine()
}
