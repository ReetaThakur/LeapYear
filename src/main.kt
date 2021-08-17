import java.util.*

fun main() {
   val obj= Scanner(System.`in`)
    var year=obj.nextInt();
    var leap=true
    if (year%4==0){
        if (year%100==0){
            if (year%400==0) leap=true;
            else leap=false
        }else leap=true
    }else leap=false
    if (leap==true)
        println("Leap Year")
    else
        print("Not a Leap Year")
}