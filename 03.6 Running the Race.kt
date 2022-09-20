import java.util.Scanner

class Racer(val seconds: Int, val racer: String) {
    override fun toString(): String {
        return "$seconds: $Racer"
    }
fun main() {

  println("We're going to sort three racers based on their times today.") 

  println("Enter the first name: ")
  val scanner  = Scanner(System.`in`)
  val name1 = scanner.nextLine()

  println("Enter the first time: ")
  val time1 = scanner.nextInt()

  println("Enter the second name: ")
  val name2 = scanner.nextLine()

  println("Enter the second time: ")
  val time2 = scanner.nextInt()

  println("Enter the third name: ")
  val name3 = scanner.nextLine()

  println("Enter the third time: ")
  val time3 = scanner.nextInt()
  
  val times = mutableListOf(Racer(time1, name1), Racer(time2,name2), Racer(time3, name3))

  times.sortWith(compareByDescending { it.seconds })
  
    times.sortedBy { it.id }
    println(times)

}
}
