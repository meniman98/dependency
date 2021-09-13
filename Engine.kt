package dependency

abstract class Engine {
    var speed: Int = 10

    abstract fun speedUp()
    abstract fun slowDown()

}