open class Tier {
    open fun makeNoise() {
        println("Animal noises: ")
    }
}

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

