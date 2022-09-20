import java.util.Scanner
fun main() {

  println("We're going to sort three names today") 

  println("Enter the first name: ")

  val scanner  = Scanner(System.`in`)
  val name1 = scanner.nextLine()
  
  println("Enter the second name: ")

  val name2 = scanner.nextLine()
  
  println("Enter the third name: ")

  val name3 = scanner.nextLine()  

  val names = mutableListOf(name1,name2,name3)

    names.sort()
    println(names)
}
