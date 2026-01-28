fun main(args: Array<String>) {
    //Ép kiểu dữ lieu cho chuỗi
    /*Có thể ép sang các kiểu Dl khác*/
    var a:Boolean="true".toBoolean()
    println(a)
    println(a::class.java.typeName)
    var a1:Short="20".toShort()
    println(a1)
    println(a1::class.java.typeName)
    //Nhập liệu từ bàn phím readln()
    /*Hàm readln() nhận vào mot chuỗi nên
    nếu nhập số thì cần phải chuyển đổi sang kiểu số*/
    println("Mời nhập vào tên")
    var ten:String?= readLine()
    //Dấu ? để biểu thị là có thể nhận giá trị null
    println("Tên vua nhập là: "+ten)
    //Nhập số
    var soA:Int=0 //De không báo lỗi ở dòng 25
    println("Mời nhập vào số ")
    var s:String?= readLine()
    if(s!=null)
    {
        soA=s.toInt()
    }
    println("Số A: $soA")

}