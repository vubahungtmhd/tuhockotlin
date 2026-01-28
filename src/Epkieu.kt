fun main(args: Array<String>) {
 /*  - Ép kiểu:
    + Kiểu rộng bé-> lớn
    + Kiểu hẹp lớn -> bé có thể mất dữ liệu
    - Các loại ép kiểu
    + toLong()
    + toByte
    + toInt
    + toShort
    */
//Ép kiểu rộng
    var x:Int=55
    var y:Long=x.toLong()
    println(y)
//Kiểm tra kiểu loại
    println("Kiểu DL số x là "+(x::class.java.typeName))
    println("Kiểu DL số y là "+(y::class.java.typeName))
//Ep kieu hep
    var soX:Short=32767
    var soY:Byte=soX.toByte() //mất dữ liệu
    println("x= $soX")
    println("y= $soY")
    var n:Short=100
    var m:Byte=n.toByte()
    println("N $n")
    println("M $m")
    var diemToan:Float=9.5f
    var diemVan:Int=diemToan.toInt() //mất dữ liệu
    println("Diem toan $diemToan")
    println("Diem van $diemVan")
}