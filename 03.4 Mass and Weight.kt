import java.util.Scanner
fun main() {
    
     println("Today we're going to see if an object is too heavy or too light.")
     val reader = Scanner(System.`in`)
    println("Please enter on objects mass:")
    var mass : Double = reader.nextDouble()

    var weight = mass * 9.8
    
    if (weight < 10){
    println("This object is too light")
    }
    else if (weight > 1000){
        println("This object is too heavy")
    }
    else{
        println("This object is perfect!")
}
}
