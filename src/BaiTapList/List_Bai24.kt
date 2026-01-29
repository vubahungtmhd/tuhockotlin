package BaiTapList

import kotlin.random.Random

fun main() {
  /*Viết CT tạo ra 1 list có n phần tử do người dùng nhập vào
    các phần tử sẽ ngẫu nhiên(1,100)*/
  var rd= Random
  println("Nhập số phần tử của List")
  var sc:String?= readLine()
  var n:Int=0
  if(sc!=null)
    n=sc.toInt()
  var listNguyen:MutableList<Int> = mutableListOf()
  for(i in 0..n-1)
  {
    listNguyen.add(rd.nextInt(100))
  }
  println(listNguyen)

}