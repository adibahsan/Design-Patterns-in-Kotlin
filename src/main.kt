import decoratorpattern.BananaMilkShake
import decoratorpattern.JustMilkShake

fun main(args: Array<String>) {
    println("Hello")
    var justMilkShake =JustMilkShake()
    println("Regular Just Milk Shake")
    justMilkShake.getTaste()

    var bananaMilkShake = BananaMilkShake(justMilkShake)
    println("Banana Milk Shake")
    bananaMilkShake.getTaste()
}