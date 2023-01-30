
fun main() {
    println(" Введите число a");
    val a = readLine()!!.toInt()
    println(" Введите число b");
    val b = readLine()!!.toInt()
    println(" Введите число c");
    val c = readLine()!!.toInt()
    var max: Int
    if (a > b) {
    max = a
    }
    else{
        max = b

    }
    if (c > max){
        max = c
    }
    println(max);

}



