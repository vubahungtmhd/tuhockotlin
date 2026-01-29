import jdk.swing.interop.SwingInterOpUtils

/*
 Hạn chế của mảng: không thể thêm, xóa phần tử
 List: có the thêm, xóa và thay đổi kích cỡ
 MutableList: Là collection có thể thay đổi kích thước dữ liệu: Thêm, sửa, xóa...
 List: Chỉ có nv readOnly, dùng để hiển thị thông tin
  -Ưu điểm:
  + List đỡ tốn bộ nhớ hơn MutableList. Nếu chỉ cần hiển thị thông tin thì dùng List
 Khai báo List
 var tenList:MutableLis< KieuDL: Int> =  mutableListOf()
 var tenList:List<Int> = listOf()
 Hiển thị: printf(tenList)
 Phương thức
  - size:                 Số phần tử của List
  - add() :               Thêm 1 phần tử
  - addAll() :            Thêm nhiều phần tử      ds6.addAll(mutableListOf(11,9,7,3))
  - removeA() t           xóa tại index
  - Remove()              xóa phần tử
  - clear()               xóa toàn bo List
  - Sort()                sắp xếp tăng
  - SortDescending()      sắp xếp giảm
  - filer {}              lọc dữ liệu             var ds7:MutableList<Int> = mutableListOf()
                                                  ds7= ds6.filter { x->x>10 }.toMutableList()
  - contains():           Kiểm tra tồn tại
*/
fun main(args: Array<String>) {
  //Khai bao MutableList
  var ds1:MutableList<Int> = mutableListOf();
  println(ds1::class.java.typeName)
  //Khai bao List
  var ds2:List<Int> = listOf();
  println(ds2::class.java.typeName)
  //Khoi tao
  var ds3:MutableList<Int> = mutableListOf(2,45,4,6,7,9)
  var ds4:List<Int> = listOf(3,7,2,5,1)
  //Hien thi
  println(ds3)
  println(ds4)
  //Duyet List
  var ds5:MutableList<Int> = mutableListOf(2,5,4,6,7,8,9)
  println(ds5.indices)
  for(i in ds5.indices)
  {
    if(ds5[i]%2==0)
    {
      print("${ds5[i]}\t")
    }

  }
  println()
  //Size
  var ds6:MutableList<Int> = mutableListOf(2,5,4)
  println("Số phần tử: "+ds6.size)
  //Thêm 1 phần tử
  ds6.add(7)//Thêm vào cuối cùng
  ds6.add(2,10)//Chèn 10 vào vị trí index=2
  println(ds6)

  //Thêm nhiều phần tử
  //Thêm vào cuối
  ds6.addAll(mutableListOf(11,9,17,3))
  println(ds6)
  //Thêm vào vị trí cụ thể
  ds6.addAll(4, mutableListOf(3,2,56,2))
  println(ds6)
  //Xóa tại 1 vị trí index
  ds6.removeAt(5)
  println(ds6)
  //Xóa phần tử đầu tiên trùng khớp
  ds6.remove(2)
  println(ds6)
  //SX tăng
  ds6.sort()
  println(ds6)
  //Sx giảm
  ds6.sortDescending()
  println(ds6)
  //Lọc
  var ds7:MutableList<Int> = mutableListOf()
  ds7= ds6.filter { x->x>10 }.toMutableList()
  // var ds7= ds6.filter { x->x>10 } như này cũng ok
  println(ds7)
  //Contains()
  println(ds6.contains(10))
  println(ds6.contains(15))
  //Xóa hoàn toàn
  ds7.clear()
  println(ds7)
  //2. List thông thường readOnly
  var ds8:List<Int> = listOf(1,2,3,4,5)
  println( ds8[1])
}