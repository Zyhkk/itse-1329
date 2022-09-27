fun main (){
  println("Today we're going to decide a good place to eat for your group.")
  println("Is anyone Vegetarian?(yes/no)")
  val input1 = readLine()
  println("Is anyone Vegan?(yes/no)")
  val input2 = readLine()
  println("Is anyone Gluten Free?(yes/no)")
  val input3 = readLine()

  println("Here are your resturant options: ")

 if(input1 == "no" && input2 == "no"){
   if(input3 == "no"){
   println("Joe’s Gourmet Burgers")
   println("Main Street Pizza Company")
   println("Corner Café")
   println("Mama’s Fine Italian")
   println("The Chef’s Kitchen")
 }
 }else if(input1 == "yes" && input2 == "no"){
  if(input3 == "no"){
   println("Main Street Pizza Company")
   println("Corner Café")
   println("Mama’s Fine Italian")
   println("The Chef’s Kitchen")
 }
}else if(input1 == "yes" && input2 == "yes"){
  if(input3 == "no"){
  println("Corner Café")   
  println("The Chef’s Kitchen")
}
 }else if(input1 == "yes" && input2 == "no"){
    if(input3 == "yes"){
  println("Main Street Pizza Company")  
  println("Corner Café")   
  println("The Chef’s Kitchen")  
}
  }else if(input1 == "yes" && input2 == "yes"){
    if(input3 == "yes"){
  println("Corner Café")   
  println("The Chef’s Kitchen")
}
  }else{
  println("invalid input")
  
}
}
