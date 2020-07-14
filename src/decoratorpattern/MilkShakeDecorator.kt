package decoratorpattern

open class MilkShakeDecorator (protected var milkshake: Milkshake) : Milkshake {
    override fun getTaste() {
        this.milkshake.getTaste()
    }
}