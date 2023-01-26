open class Tier {
    open fun makeNoise() {
        println("Animal noises: ")
    }
}
// Todo: <<=========================
//class Hund : Tier() {
//    override fun makeNoise() {
//        println("Woof!")
//    }
//}
//
//class Katze : Tier() {
//    override fun makeNoise() {
//        println("Miau.")
//    }
//}
// Todo: <<=========================

open class Hund : Tier() {
    override fun makeNoise() {
        super.makeNoise()
        println("Woof!")
    }
}

class Katze : Tier() {
    override fun makeNoise() {
        super.makeNoise()
        println("Miau.")
    }
}
// Todo: <<=========================
//class Labrador : Hund() {
//    override fun makeNoise() {
//        // Compilation error: 'makeNoise' in 'Labrador' is final and cannot be overridden
//        println("Woof woof!")
//    }
//}

