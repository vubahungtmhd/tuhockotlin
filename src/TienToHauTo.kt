fun main(args: Array<String>) {
    //Toan tu tien to, hau to
    /*
    - Toán tử ++ phương thức a.inc()
    - Toán tử -- a.dec()
    - Phương thức inc() và dec() không thay đổi giá trị
    noi tại của biến mà lưu sang 1 biến khác
    Postfix: x++
    Prefix: ++x
    - Ưu tiên tính toán
    + Prefix
    + Các phép tính kahsc
    + Gán giá trị cho biến ở bên trái dấu bằng
    + Tính postfix
    */
    //Toán tu tiền tố hậu tố
    var x=99
    var y=10
    var z=17
    var t=88
    //x++
    x++
    y--
    ++z
    --t
    println("x= $x")
    println("y= $y")
    println("z= $z")
    println("t= $t")
    var x1=1
    var y1=2
    var z1=x1++ - ++y1 +1
    println("x= $x1")
    println("z= $z1")
}