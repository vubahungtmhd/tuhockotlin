fun main(args: Array<String>) {
    /*

    *Kiểu dữ liệu ( Tương tự Java)
    - Nguyên    : Int, Long, Short
    - Thực      : Double, Float
    - Luận lý   : Boolean
    - Mảng      : IntArray,LongArray....
    - Chuỗi     : String
    - Kí tự     : Char
    *Biến
    - Khai báo var: có thể thay đổi giá trị
    - Khai báo val: Hằng số
    + var tên_biến : Kiểu dữ liệu=[Gía trị];
    + var tên_biến= giá trị;
    Khai báo biến kiểu thực
    - var tên_biến: kiểu DL= GIÁ TRỊ;
    - var tenbien=Gía trị;
    - Khi xuất dữ liệu cần thêm f và F ở cuối giá trị
    Khai báo kiểu Nguyên
    - Kiểu Long: var soA:Long=999L;
                 var soA=999L;
    - Kiểu mảng
    + Khai báo: var tên_mảng: typeArray =typeArrayOf( giá trị 1,2,3,...);
    - Ép kiểu:
    + Kiểu rộng bé-> lớn
    + Kiểu hẹp lớn -> bé có thể mất dữ liệu

    */
    //Khởi tạo biến
    var a:Int =65;
    var b:Short=5;
    println("Gía trị của số a là: $a ");
    println("Gía trị của số a là:  "+a);
    //Khai báo biến
    var c:Double;
    var d:Byte;
    //Khai báo kiểu thực
    var y:Double=9.5;
    var z=10.5;
    println("Kiểu loại của y: "+(y::class.java.typeName));
    println("Kiểu loại của z: "+(z::class.java.typeName));
    //Khai báo kiểu nguyên
    var n1:Long=99999L;
    var n2=900000L;
    println("Gía trị của số n1 là: $n1");
    println("Gía trị của số n2 là: "+n2);
    println("Kiểu dữ liệu của n1 là:"+(n2::class.java.typeName));
    //Khai báo kí tự
    var kitu:Char='a';
    //Kiểu String
    var str3:String="Hôm nay anh tự học kotlin";
    var str4="Chúng ta là gì của nhau";
    println(str4);
    //Kiểu boolean
    var check1:Boolean=true;
    var check2:Boolean=false;
    //Kiểu mảng
    var mangSoThuc:FloatArray= floatArrayOf(0.5f,7.5f,0.8f,6.4f);
    var mangKiTu:CharArray= charArrayOf('a','b','c');
    //Hằng số
    val nhietDoSoi:Int=100;
    var nhietDoNongChay=999;
    //Ép kieu trong Kotlin

}
