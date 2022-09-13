fun main() {
    
     println("Today we're going to check your weight to see if you might be a little over/under weight")
     
    println("Please enter your height in inches:")
    var height = Integer.valueOf(readLine())
    
    println("Please enter your weight in pounds:")
    var weight = Integer.valueOf(readLine())

    var BMI = weight * 703 / (height * height)
    
    if (BMI < 18.5){
    println("Your BMI is $BMI which might be a little underweight for your size")
    }
    if (BMI > 25){
        println("Your BMI is $BMI which might be a little overweight for your size")
    }
    else{
        println("Your BMI is $BMI which is pretty average. Looking good!")
}
}
