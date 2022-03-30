package week4.normal_design

// Load ABA bank class or call ABA bank API

class Aba(val amount: Double) {
    fun doPay() {
        // Call ABA method
        println("ABA Pay: $amount")
    }
}