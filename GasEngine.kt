package dependency

class GasEngine : Engine() {

    override fun speedUp() {
        speed++
    }

    override fun slowDown() {
        speed--
    }
}