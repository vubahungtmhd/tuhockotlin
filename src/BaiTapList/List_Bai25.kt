package BaiTapList

fun main(args: Array<String>) {
  //Nhập vào 1 danh sách List
  //Tạo 1 list mới là ^2 của list cũ
  //Xác định bao nhiêu phần tử lớn hơn 50
  println("Nhập vào số lượng phần tử: ")
  var soPt:String?= readLine()
  var n:Int=0
  if(soPt!=null)
    n=soPt.toInt()
  var listNguyen:MutableList<Int> = mutableListOf()
  println("Mời nhập phần tử của List")
  for(i in 0..n-1)
  {
    print("List[$i]= ")
    var n= readln()!!.toInt()
    listNguyen.add(n)
  }
  println(listNguyen)
  //Mảng bình phương
  var m2:MutableList<Int> = mutableListOf()
  for(i in listNguyen)
  {
    m2.add(i*i)
  }
  println("Mảng bình phương là: ")
  println(m2)
  //Đếm phần tử >50
  var dem=0
  for(i in m2)
  {
    if(i>50)
      dem++
  }
  if(dem==0)
    println("Không có phần tử lớn hơn 50")
  else
    println("Có $dem phần tử lớn hơn 50")
}