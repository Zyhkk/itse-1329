fun main() {
    
    println("Enter a year:")
    var x = Integer.valueOf(readLine())
    
 println("Enter a month numerically:")
    var y = Integer.valueOf(readLine())

 println("Enter a day out of a month numericaly:")
    var z = Integer.valueOf(readLine())
    
    if (y * z == x){
    println("The Date is Magic!")
    }
    else{
        println("The date is not magic.")
    }
}
