fun main() {
    val computer = Computer()
    println(computer.on)
    computer.pressOffButton()
    computer.sendEMail()
    computer.pressOnButton()
    computer.sendEMail()
}