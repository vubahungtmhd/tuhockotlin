import jdk.swing.interop.SwingInterOpUtils

fun main(args: Array<String>) {
    var s:String="Chúng ta không thuộc về nhau "
    var s2="Nắng ấm xa dần"
    println(s+s2)
    /*
    Bảng kí tự đặc biệt
    / Thêm dấu \ + với kí tự đặc biệt

   - Kiểm tra vị trí xuất hiện đầu tiên của kí tự hoặc chuỗi
            indexof()

   - Kiểm tra vị trí xuất hiện cuối cùng của kí tự hoặc chuỗi
            lastIndexOf()
   - Kiểm tra chuỗi con:
        Contains()
   - Trích chuỗi con từ chuỗi ban đầu:
        SubString()
   - Thay thế toàn bộ chuỗi: Replace()
    var s:String="aahflagla"
        s.replace("str old","str new",true/false: true là ko phân biệt hoa thường)
    - Thay thế chuỗi đầu tiên tìm thấy:()
        s.replaceFirst("str old","str new",true/false)



    */
    var s3:String="Thầy Huấn đã từ nói: \"Không làm mà đòi có ăn thì chỉ có ăn cứt \""
    println(s3)
    var s4="Dòng 1\n dòng 2"
    println(s4)
    //Kích thước chuỗi length
    println(s4.length)
    //Tìm kiếm xuất hiện đầu tiên
    var s5="Ngày hôm qua, chia tay anh nói những lời trăn trối em đừng u sầu"
    println(s5.indexOf("tay"))
    //Tìm kiếm xuất hiện cuối cùng lastIndexOf\
    var s6="Em là đồ đần aaaaaa"
    println(s6.lastIndexOf("a"))
    //Kiểm tra chuỗi con Contains
    var s7="Chúng ta không thuộc về nhau của ca sĩ Sơn Tùng MTP"
    var s8="Sơn Tùng MTP"
    var s9="Tuấn Hưng"
    var check:Boolean=s7.contains(s8)//Chuỗi s8 có phải con s7 k
    var check2:Boolean=s7.contains(s9)//Chuỗi s9 có phải con s7 k
    println(check)//true
    println(check2)//false
    //Trích xuất chuỗi
    var s10="0123456789"
    var s11=s10.substring(2,9)//Từ vị trí từ 2 đến 8 (sát 9)
    println(s11)
    var s12:String="học Học nữA HọC mãI"
    //Thay thế chuỗi
    var s13=s12.replace("học","Ngủ")
    println(s12)
    println(s13)// Vì phân biệt hoa thường nên sẽ chỉ thay được mỗi chữ đầu
    var s14=s12.replace("học","Ngủ",true)
    println(s12)
    println(s14)
    //Thay thế chuỗi đầu tiên tìm thấy
    var s15:String="Em nhớ em nhiều em chắc không hiểu được"
    var s16=s15.replaceFirst("Em","Anh",ignoreCase = false)
    println(s15)
    println(s16)
    var s17=s15.replaceFirst("eM","Anh",true)
    println(s15)
    println(s17)
}