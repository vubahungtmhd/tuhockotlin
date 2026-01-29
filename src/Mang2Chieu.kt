import kotlin.random.Random

/*
 Cú pháp:
    var tênMảng:Array<Kiểu DL> =Array(soHang,{Kiểu DL(số cột})
    var M:Array<IntArray> = Array(3,{IntArray(3)});
 Index của các phần tử
    Truy xuất hàng trước cột sau
*/
fun main(args: Array<String>) {
    //Khai báo mảng
    var M:Array<IntArray> =Array(3,{ IntArray(4) })
    var rd = Random
    println(M.indices)
    for(i in M.indices)
    {
        for(j in M.indices) {
            //print("$i$j\t")
            M[i][j]=rd.nextInt(51)
        }
        //println()
    }
    //Xuat 1 phan tu
    println(M[0][0])
    println(M[0][1])
    println(M[0][2])
    //Xuat ca mang
    for(i in M.indices){
        for(j in M.indices){
            print("${M[i][j]}\t")
        }
        println()
    }
}