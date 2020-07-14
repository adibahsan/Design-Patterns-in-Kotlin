package decoratorpattern

class PeanutMilkShake(milkShake: Milkshake) :MilkShakeDecorator(milkShake) {
    override fun getTaste() {
        super.getTaste()
        addTest()
        println("It's a Peanut Milkshake")
    }

    fun addTest(){
        println("Adding Peanuts")
    }
}