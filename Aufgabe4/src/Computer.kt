import kotlin.random.Random

open class Computer {
//    val randomBoolean = Random.nextBoolean()
    var on: Boolean = true

    constructor() {}

    fun pressOnButton() {
        if (!on) {
            on = true
        }
    }

    fun pressOffButton() {
        if (on) {
            on = false
        }
    }

    fun sendEMail() {
        if (on) {
            println("EMail sent!")
        }
    }
}
