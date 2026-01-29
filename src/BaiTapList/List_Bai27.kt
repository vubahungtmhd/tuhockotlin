package BaiTapList

fun main(args: Array<String>) {
  var listN:MutableList<Int> = mutableListOf()
  println("Nhập số phần tử của List")
  var n:Int= readln()!!.toInt()
  for(i in 0 until n)
  {
    print("List[$i]=")
    var pt= readln()!!.toInt()
    listN.add(pt)
  }
  //So phan tu lon hon 5
  var list5:MutableList<Int> = mutableListOf()
  var vt5:MutableList<Int> = mutableListOf()
  for(i in listN.indices)
  {
    if(listN[i]>5)
    {
      list5.add(listN[i])
      vt5.add(i)
    }
  }
  println()
  if(list5.isEmpty())
    println("Không có phần tử nào lớn hơn 5")
  else {
    println("Danh sách các phần tử lớn hơn 5 là: $list5" )
    println("Vị trí các phần tử lơn hơn 5 là:  $vt5 ")
  }


}