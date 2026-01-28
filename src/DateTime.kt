import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal=Calendar.getInstance()//Hien thi xem co nhung gi
    println(cal)
    //Lấy ngày tháng hiện tại
    var ngay=cal.get(Calendar.DAY_OF_MONTH)
    var thang=cal.get(Calendar.MONTH)
    var nam=cal.get(Calendar.YEAR)
    println("Ngày tháng năm hiện tại $ngay/${thang+1}/$nam")
    //Cài theo ý muốn
    var cal1=Calendar.getInstance()
    cal1.set(Calendar.YEAR,2001)
    cal1.set(Calendar.MONTH,4)
    cal1.set(Calendar.DAY_OF_MONTH,3)
    //Lấy thông tin
    var ngs=cal1.get(Calendar.DAY_OF_MONTH)
    var tgs=cal1.get(Calendar.MONTH)
    var nas=cal1.get(Calendar.YEAR)
    println("Ngày tháng năm sinh $ngs/${tgs+1}/$nas")
    //Xuất theo định dạng mẫu ngày/tháng/năm
    var date=cal.time;
    var dinhDang=SimpleDateFormat("dd/MM/yyyy")
    println(dinhDang.format(date))
    //Xuất theo định dạng ngày/tháng/năm giờ/phút/giây
    var dinhDang2=SimpleDateFormat("dd/MM/yyyy hh/mm/ss a")
    println(dinhDang2.format(date))
}