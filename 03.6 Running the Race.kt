import java.util.Scanner

fun main() {

  println("We're going to sort three racers based on their times today.") 

  println("Enter the first name: ")
  val scanner  = Scanner(System.`in`)
  val name1 = scanner.nextLine()

  println("Enter the first time(in minutes): ")
  val time1 = scanner.nextDouble()

  println("Enter the second name: ")
  val name2 = readLine()

  println("Enter the second time(in minutes): ")
  val time2 = scanner.nextDouble()

  println("Enter the third name: ")
  val name3 = readLine()

  println("Enter the third time(in minutes): ")
  val time3 = scanner.nextDouble()

  println("Your fastest in descending order:")
  if (time1 < time2 && time1 < time3){
    println(name1)
    if (time2 < time3){
      println(name2)
      println(name3)
    } else{
      println(name3)
      println(name2)
    }
  } else if (time2 < time1 && time2 < time3){
    println(name2)
    if(time1 < time3){
      println(name1)
      println(name3)
    } else {
      println(name3)
      println(name1)
    }
  } else {
    println(name3)
    if (time1 < time2){
    println(name1)
    println(name2)
    } else {
      println(name2)
      println(name1)
    }

}
}
