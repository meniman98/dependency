package dependency

class Car(val engine: Engine) {

    fun accelerator() {
        engine.speedUp()
    }
    fun brake() {
        engine.slowDown()
    }
}
fun main() {
    // gas engine car
    val gasEngine = GasEngine()
    val gasCar = Car(gasEngine)
    gasCar.accelerator()
    gasCar.brake()
    gasCar.brake()
    println( gasCar.engine.speed )

    // electric car
    val electricEngine = ElectricEngine()
    val electricCar = Car(electricEngine)
    electricCar.accelerator()
    electricCar.brake()
    println( electricCar.engine.speed )
}