package decoratorpattern

fun main(){
    println("Hello")
    var justMilkShake =JustMilkShake()
    println("Regular Just Milk Shake")
    justMilkShake.getTaste()

    println()

    var bananaMilkShake = BananaMilkShake(justMilkShake)
    println("Banana Milk Shake")
    bananaMilkShake.getTaste()

    println()

    var peanutMilkShake = PeanutMilkShake(JustMilkShake())
    println("Peanut Milk Shake")
    bananaMilkShake.getTaste()

    println()
}