package week4.poly_design

// Load Ucb bank class or call Ucb bank API

class Ucb(val amount: Double): IPayment {
    override fun pay() {
        // Call Ucb method
        println("Ucb Pay: $amount")
    }

    override fun retreiveAmount(): Double {
        return amount
    }
}