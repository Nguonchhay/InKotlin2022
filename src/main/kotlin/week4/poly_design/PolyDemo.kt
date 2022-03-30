package week4.poly_design

fun polyMain() {
    val transactions = mutableListOf<IPayment>(
        Aba(5.0),
        Ucb(2.5),
        Aceleda(3.0),
        Wing(2.0),
        Aba(4.5),
        Aceleda(2.0),
        Ucb(3.0),
        Wing(20.0),
        Aba(4.0),
        Aba(20.5)
    )

    //point2(transactions)
    point3(transactions)
}

fun point2(transactions: MutableList<IPayment>) {
    // 2. Display number transaction via ABA
    transactions.forEach { transaction ->
        if (transaction is Aba) {
            transaction.pay()
        }
    }
}

fun printTransactions(transactions: MutableList<IPayment>) {
    // 3. Display all transactions sort by total price descending
    transactions.forEach { transaction ->
        transaction.pay()
    }
}

fun sort(transactions: MutableList<IPayment>): MutableList<IPayment> {
    var i = 0
    var k = 0
    while (i < transactions.size - 1) {
        k = i + 1
        while (k < transactions.size) {
            if (transactions[i].retreiveAmount() < transactions[k].retreiveAmount()) {
                val swap = transactions[i]
                transactions[i] = transactions[k]
                transactions[k] = swap
            }
            k++
        }
        i++
    }
    return transactions
}

fun point3(transactions: MutableList<IPayment>) {
    // 3. Display all transactions sort by total price descending
    println("---Before Sort---")
    printTransactions(transactions)

    // Sort algorithm
    println("---After Sort---")
    printTransactions(sort(transactions))
}