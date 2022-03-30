package week4.poly_design

// Load Aceleda bank class or call Aceleda bank API

class Aceleda(val amount: Double): IPayment {
    override fun pay() {
        // Call Aceleda method
        println("Aceleda Pay: $amount")
    }

    override fun retreiveAmount(): Double {
        return amount
    }
}