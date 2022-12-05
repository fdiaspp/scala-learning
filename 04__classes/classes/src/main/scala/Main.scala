

object Main extends App{

    println("Welcome to this bank. :)")
    val c1 = new Client(name="Felipe")
    val c2 = new Client(name="Karen")

    val a1 = new Account(client=c1)
    val a2 = new Account(client=c2, balance=150)

    a2.transfer(a1, 50)


}

trait DoTransfer {
    var balance: Float

    def transfer(account: Account, value: Float): Unit = {
        balance -= value
        account.balance += value
    }
}

class Client(val name: String)

class Account(val client: Client, var balance: Float = 0) extends DoTransfer {

    def printBalance(): Unit = {
        println(s"Saldo ${client.name}: ${balance}")
    }

    override def transfer(account: Account, value: Float): Unit = {
        println(s"Transfere $value de ${client.name} para ${account.client.name}")
        
        balance -= value
        account.balance += value

        printBalance()
        account.printBalance()
    }

    printBalance()
}

