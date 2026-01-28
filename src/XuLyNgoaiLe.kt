import java.lang.Exception

fun main(args: Array<String>) {
    /*
    Ngoại lệ là những lỗi có thể phat sinh
    Mục đich:
    + Hiển thị ra lỗi
    + Chương trình vẫn có thể chạy mà k bị treo
    - Sử dụng try catch familli
    * */
    var a:Int=10
    var b:Int=0
    try {
        var c:Int=a/b
        println(c)
    }
    catch (e:Exception) {
        e.printStackTrace()
    }
    finally {
        //Code có gặp lỗi hay k gặp lỗi thì bắt buộc phải dùng
        //đoạn code trong finally
        println("Thoát khỏi database")
    }
    println("Mô phỏng đoạn code sau của chươn trình")
}