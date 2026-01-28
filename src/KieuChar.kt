import jdk.swing.interop.SwingInterOpUtils

/*
- Khai báo
+ var <Tên Biến>: Char=' '
+ Theo mã ASCII
    var <Ten_biens> = Char( mã ascii)


*/
fun main(args: Array<String>) {
    var kiTu:Char='a'
    println(kiTu)
    println(kiTu::class.java.typeName)
    var kiTu2='b'
    println(kiTu2)
    println(kiTu2::class.java.typeName)
    var kiTu3="B"//Dùng nháy kép nên nó sẽ coi là String
    println(kiTu3::class.java.typeName)
    //Khai báo theo ma ascii
    var kyTu4=Char(110)
    println(kyTu4)
}