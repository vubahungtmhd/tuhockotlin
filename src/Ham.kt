import jdk.swing.interop.SwingInterOpUtils
import javax.swing.ImageIcon

/*
    *Hàm có 2 loại
    - Co return( có giá trị trả về)
    - Khong co return (không có giá trị trả về)
    *Có Kiểu trả về
    fun tên_hàm(parametters): Kiểu trả về
    {
    }
    * Không có kiểu trả về
    fun tên_hàm(parametters)
    {
    }
    */
//HÀM CÓ RETURN
fun tinhTong(a:Int,b:Int,c:Int): Int
{
    return a+b+c
}
//Có thể viết ngắn gọn như bên dưới
fun tinhTong(a:Float,b:Float) =a+b
//HÀM THỦ TỤC
fun XinChao()
{
    println("Chào bạn nhé")
}

fun XinChao2(s:String)
{
    if(s=="nam")
        println("Xin chào mình là nam")
    else
        println("Xin chào mình là girl")
}
fun main(args: Array<String>) {
    var tong=tinhTong(4,5,6)
    var tong2=tinhTong(4,1,3)
    var tong3=tinhTong(3.5f,4.5f)
    println(tong)
    println(tong2)
    println(tong3)
    XinChao();
    XinChao2("nam")
}