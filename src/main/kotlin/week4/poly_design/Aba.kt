package week4.poly_design

// Load ABA bank class or call ABA bank API

class Aba(val amount: Double): IPayment {
    override fun pay() {
        // Call ABA method
        println("ABA Pay: $amount")
    }

    override fun retreiveAmount(): Double {
        return amount
    }
}