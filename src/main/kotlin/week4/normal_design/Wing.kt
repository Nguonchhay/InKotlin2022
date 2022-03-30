package week4.normal_design

// Load Wing bank class or call Wing bank API

class Wing(val amount: Double) {
    fun processPay() {
        // Call Wing method
        println("Wing Pay: $amount")
    }
}