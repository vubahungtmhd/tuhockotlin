package BaiTapList

import javax.sound.midi.Soundbank

fun main(args: Array<String>) {
  //In ra số lớn t2 và bé t2
  var listNguyen:MutableList<Int> = mutableListOf()
  println("Nhập số phần tử n= ")
  var n:Int= readln()!!.toInt()
  for(i in 0 until n)
  {
    print("M[$i]= ")
    var temp= readln()!!.toInt()
    listNguyen.add(temp)
  }
  println("List vừa nhập là: ")
  println(listNguyen)
  println("List sau khi sắp xếp là: ")
  listNguyen.sort()
  println(listNguyen)
  //Tìm số lớn thứ 2 thì ta xóa lớn nhất đi nghĩa là cuối chuỗi, tương tự với số bé thứ 2
  listNguyen.removeAt(n-1)
  listNguyen.removeAt(0)
  println("Số nhỏ thứ 2 chuỗi là : ${listNguyen[0]}")
  println("Số lớn thứ 2 chuỗi là : ${listNguyen[listNguyen.size-1]}")


}