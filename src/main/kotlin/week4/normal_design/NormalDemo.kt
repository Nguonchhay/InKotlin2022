package week4.normal_design

fun normalMain() {
    var transactions = mutableListOf(
        Aba(5.0),
        Wing(2.5),
        Aceleda(3.0),
        Wing(2.0),
        Prince(4.5),
        Aceleda(2.0),
        Prince(3.0),
        Wing(20.0),
        Aba(4.0),
        Aba(20.5)
    )

    //point2(transactions)
    point3(transactions)
}

fun point2(transactions: MutableList<Any>) {
    // 2. Display number transaction via ABA
    transactions.forEach { transaction ->
        if (transaction is Aba) {
            transaction.doPay()
        }
    }
}

fun printTransactions(transactions: MutableList<Any>) {
    // 3. Display all transactions sort by total price descending
    transactions.forEach { transaction ->
        if (transaction is Aba) {
            transaction.doPay()
        } else if (transaction is Wing) {
            transaction.processPay()
        } else if (transaction is Aceleda) {
            transaction.pay()
        } else if (transaction is Prince) {
            transaction.doPay()
        }
    }
}

fun sort(transactions: MutableList<Any>): MutableList<Any> {
    var i = 0
    var k = 0
    while (i < transactions.size - 1) {
        k = i + 1
        while (k < transactions.size) {
            var amountI = 0.0
            var tranI = transactions[i]
            if (tranI is Aba) {
                amountI = tranI.amount
            } else if (tranI is Wing) {
                amountI = tranI.amount
            } else if (tranI is Aceleda) {
                amountI = tranI.amount
            } else if (tranI is Prince) {
                amountI = tranI.amount
            }

            var amountK = 0.0
            var tranK = transactions[k]
            if (tranK is Aba) {
                amountK = tranK.amount
            } else if (tranK is Wing) {
                amountK = tranK.amount
            } else if (tranK is Aceleda) {
                amountK = tranK.amount
            } else if (tranK is Prince) {
                amountK = tranK.amount
            }

            if (amountI < amountK) {
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

fun point3(transactions: MutableList<Any>) {
    // 3. Display all transactions sort by total price descending
    println("---Before Sort---")
    printTransactions(transactions)

    // Sort algorithm
    println("---After Sort---")
    printTransactions(sort(transactions))
}