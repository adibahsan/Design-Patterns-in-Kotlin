package decoratorpattern

class BananaMilkShake(milkshake: Milkshake) : MilkShakeDecorator(milkshake)  {
    override fun getTaste() {
        super.getTaste()
        addTest()
        println("It's a Banana milk Shake")

    }

    fun addTest(){
        println("Adding Banana Flavor")
    }
}