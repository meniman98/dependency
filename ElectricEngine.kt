package dependency

class ElectricEngine : Engine() {
    override fun speedUp() {
        speed += 10
    }

    override fun slowDown() {
        speed--
    }
}