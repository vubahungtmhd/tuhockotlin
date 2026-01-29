import kotlin.random.Random

/*
    Mảng 1 chiều:
    - Có kt cố định và k thay đổi dđược
    - Tập các đối tượng có cùng kiểu DL
    - Index bắt đầu tu 0
    Khai báo mảng:
     var tênMảng:<KIEU DL> =<KIEU DL>(SIZE)
     + var mangNguyen:IntArray=IntArray(6)
    Khởi tạo mảng:
     var tênMảng:<KIEU DL> =<kiểu dl>(1,3,4,5,6)
     + var mang:IntArray= intArrayOf(1,3,4,5,6)
    Truy xuất và thay đổi giá trị qua index
    Kích thước mảng: size
    Phép gán mảng
        mảng mới = mảng cũ
        - Khi thay đổi giá trị 1 mảng thì mảng kia cũng thay đổi
        vì cả 2 mảng đều tham chiếu đến 1 vùng nhớ
        - Khi đó ta phải dùng clone
   Đảo ngược mảng: reverse()
   Sắp xếp mảng
   - Tăng mang.sort()
   - Giảm mang.sortDescending()
   Trích mảng theo điều kiện rồi trả về 1 arrayList : filer
        - Vidu var ds=m15.filter { i->i%2==0 }
   Tìm max, min: Sắp xếp tăng rồi tìm phần tử đầu tiên và cuối cùng first(), last()
*/
fun main(args: Array<String>) {
    //Khai báo mảng
    var mangNguyen:IntArray=IntArray(6) //Mặc định các phần tử là 0
    var mangThuc:FloatArray=FloatArray(6)
    println(mangNguyen::class.java.typeName)
    println(mangThuc::class.java.typeName)
    //Duyệt mảng
    for(i in mangNguyen)
    {
        print("$i\t")
    }
    //Khởi tạo mảng
    println("\n")
    var mang:IntArray= intArrayOf(1,2,3,4,5,6)
    for(a in mang)
    {
        print("$a\t")
    }
    //Truy xuất theo Index
    println()
    println(mang[0])
    println(mang[1])
    println(mang[2])
    //Thay thế
    mang[0]=9
    mang[4]=9
    for(a in mang)
    {
        print("$a\t")
    }
    //Mảng giá trị ngẫu nhiên
    println()
    var rd= Random
    var m7:IntArray= IntArray(6)
    println(m7.indices)//Mảng chạy tu 0 đến 5 (trước 6 dùng range)
    //Duyet for
    for(i in m7.indices)
    {
        m7[i]=rd.nextInt()
    }
    for(i in m7.indices)
    {
        print("$i\t")
    }
    println()
    println("Số phần tử của m7 là: "+m7.size)
    //Gán mảng không dùng clone
    var m9= intArrayOf(1,2,3,4,5)
    var m10=m9
    m9[0]=111
    println(m9[0])
    println(m10[0])
    //Tạo mảng trên vùng nhớ mới clone
    var m11= intArrayOf(2,5,7,19)
    var m12=m11.clone()
    m11[0]=123
    println(m11[0])
    println(m12[0])
    //Đảo mảng
    var m13:IntArray= intArrayOf(1,2,3,4,6,7,8)
    m13.reverse()
    for(i in m13)
    {
        print("$i\t")
    }
    println()
    //SX tăng dần
    var m14= intArrayOf(7,1,3,9,12,10,2)
    println("Mảng sau sắp xếp tăng dần")
    m14.sortDescending()
    for(i in m14)
    {
        print("$i\t")
    }
    println()
    //filer
    var m15= intArrayOf(1,3,4,6,14,5,8,10,11,34,33,7)
    var chan=m15.filter { i->i%2==0 }
    var le=m15.filter { i->i%2!=0 }
    println(chan)
    println(le)
    //Tìm max và min
    var m16= intArrayOf(1,7,11,3,100,34,634)
    m16.sort()
    println("Min= "+m16[0])
    println("Min= "+m16.first())
    println("Max= "+m16[m16.size-1])
    println("Max= "+m16.last())
}