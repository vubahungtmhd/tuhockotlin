/*
- Xóa toàn bộ khoảng trắng đầu và cuỗi
trim(): cả đầu và cuoi
trimEnd(): Cuối
trimStart(): Đầu
- So sánh chuỗi CompareTo()
    var x:Int=s1.compareTo(s2)
    println(x)
    x>0 thì s1>s2
    x=0 thì s1=s2
    x<0 thì s1<s2
- Nối chuỗi
+ Cách 1 dùng dấu cộng: +
+ Dùng plus
+ Dùng StringBuilder
    var s=StringBuilder()
    var s=StringBuilder("Hôm nay trời mưa")
- StringBuilder
+ Chèn: insert()
+ Chèn cuối chuỗi: append()
+ Xóa :delete(index_start,index_end)
+ đảo chuỗi: reverse()
- Tách chuoi tra vè List: split("Tách theo kí tự nào đó")
var s1="Khi tất cả yêu thương trở nên vô nghĩa"
var arr:List<String>=s1.split(" ")
- Chuyển về hoa hoặc thường: uppercase(), lowercase()
- Chuyển chuỗi thành mảng char: toCharArray()
*/
fun main(args: Array<String>) {
    //Xóa dấu cách đầu cuối
    var s19="       Hùng     Đang buồn ngủ       "
    var s20=s19.trim()
    println(s19)
    println(s20)
    //Xóa dấu cách cuối
    var s21=s19.trimEnd()
    println(s19)
    println(s21)
    //Xóa dấu cách cuối
    s21=s19.trimStart()
    println(s19)
    println(s21)


    //So sánh chuỗi
    var s23="Abcdefgh123"
    var s24="abcdefgh123"
    var x:Int=s23.compareTo(s24)
    println(x)
    //Nối chuỗi bằng
    var s25:String="Hôm nay"
    var s26=s25+" trời mưa"
    println(s26)
    var s27=s26.plus(" nên tôi không đi học")
    println(s27)
    //StringBuilder
     //Khai báo, khởi tạo
    var s28=StringBuilder()
    var s29=StringBuilder("ùng cute")
    println(s28)
    println(s29)
    //Chèn insert
    s29.insert(0,"Anh H")
    println(s29)
    //Nối đuôi
    s29.append("Phô mai que")
    println(s29)
    //Xóa chuỗi
    s29.delete(3,8)
    println(s29)
    //Tách chuỗi
    var s30="Và ngày nào đó khi mưa chẳng rơi"
    var arr:List<String> =s30.split(" ")
    for(i in arr)
    {
        println(i)
    }
    //Hoa và thường
    var s31="TốP 1 pờ LO ren TiNô có nY"
    var s32=s31.lowercase();
    var s33=s31.uppercase();
    println(s31)
    println(s32)
    println(s33)
    //Chuyển chuỗi thàng mảng char
    var mk="Vuhung1522001"
    var ar2:CharArray=mk.toCharArray()
    for(j in ar2)
    {
        //println(j)
        //println(j::class.java.typeName)
    }
    //
}
