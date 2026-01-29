import java.lang.StringBuilder

fun main(args: Array<String>) {
    //Nhập số phần tử mảng
    println("Mời nhập n: ")
    var soPt= readln().toIntOrNull()?:0
    var n:Int=soPt.toInt()
    var mangNguyen:IntArray= IntArray(n)
    //Nhập mảng
    println("Nhập các phần tử mảng")
    for(i in mangNguyen.indices)
    {
        print("M[$i]=")
        var s:String= readln()
        mangNguyen[i]=s.toInt()
        println()
    }
    //Xuất mảng

    /*println("Mảng vừa nhập là")
    for (i in mangNguyen)
    {
        print("$i\t")
    }*/
    println("Mảng vừa nhập là: ${mangNguyen.joinToString("\t")}")
    //Đảo ngược mảng
    println()
    mangNguyen.reverse()
    println("MẢNG SAU KHI ĐẢO")
    for(i in mangNguyen)
        print("$i\t")
    println()
    //Sx tăng dần
    mangNguyen.sort()
    //Tính tổng các phần tử trong mảng
    var tong:Int=0
    /*for(i in mangNguyen)
    {
        tong+=i
    }*/
    tong=mangNguyen.sum()
    println("Tổng các phần tử là: "+tong)
    //Kiểm tra tồn tại
    println("Nhập số cần kiểm tra")
    var s1= readln().toIntOrNull()?:0
    var soKt:Int=s1.toInt()
    var viTriIndex=StringBuilder()
    var check:Boolean=false;
    for(i in mangNguyen.indices)
    {
        if(mangNguyen[i]==soKt) {
            viTriIndex.append(i).append(" ")
            check=true
        }
    }
    if(check)
    {
        println("$soKt có tồn tại trong mảng với các vị trí: ")
        println(viTriIndex)
    }
    else
        println("$soKt không tồn tại trong mảng")
}