package decoratorpattern

class JustMilkShake : Milkshake {
    override fun getTaste() {
        println("It’s milk !")
    }
}