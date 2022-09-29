fun main() {
// Be given an array and a value (of the same type as the array)
// If the array contains the value, print "Found!"
// Otherwise, don'r print anything

val list = doubleArrayOf(87.0, 88.0, 84.0, 85.0, 89.0)// Input 1: array
val value = 89.0 // input 2: value
// Compare using ==

// Go through the array one item at a time
// For each item:
for(x in list){
    println(x)
	if(x == value){//    1. Compare it with the value that we are looking for
        print("$value Found!")//    2. If they are the same, print "Found!"
    }//    3. Otherwise, keep looking
    }
}
