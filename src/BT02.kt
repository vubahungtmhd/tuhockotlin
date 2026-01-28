import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    var r:Double=0.0
    //Nhập số cần ép lại kiểu
    println("Mời nhập bán kính")
    var s:String?= readLine()
    if(s!=null)
    {
        r=s.toDouble();
    }
    var chuVi:Double
    var dienTich:Double
    chuVi=2*r* PI
    dienTich=PI*r.pow(2)
    println(chuVi)
    println(dienTich)
}