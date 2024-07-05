public class Account(val accountNumber: Int, var balance: Double) {

    fun checkBalance(): Double {
        return balance
    }

    fun GetMoney(value: Double): Boolean {
        if (value <= 0 ) {
		println("Valor Inválido!")
		return false
        } else if (value > balance)
	{
		println("Saldo insuficiente")
		return false
	}


        balance -= value
        println("Saque de $value realizado com sucesso! Novo saldo: $balance")
        return true
    }

    fun depositMoney(value: Double) {
        if (value <= 0) {
            println("Valor inválido para depósito!")
            return
        }

        balance += value
        println("Depósito de $value realizado com sucesso! Novo saldo: $balance")
    }

}

