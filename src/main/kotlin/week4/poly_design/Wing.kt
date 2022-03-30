package week4.poly_design

// Load Wing bank class or call Wing bank API

class Wing(val amount: Double): IPayment {
    override fun pay() {
        // Call Wing method
        println("Wing Pay: $amount")
    }

    override fun retreiveAmount(): Double {
        return amount
    }
}