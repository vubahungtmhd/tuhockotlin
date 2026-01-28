import java.lang.Exception

fun thuong(a:Int, b:Int):Int
{
    //Sử dụng throw Exception để hiển thị lỗi mà mình có thể dự đoán ược
    if(b==0)
        throw Exception("Mẫu = 0 không chia được")
    return a/b
}

fun main(args: Array<String>) {
    try {
        thuong(12,3)
        println("Thuong= ${thuong(12,3)}")
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    finally {
        println("Đã đăng xuất khỏi server")
    }
    println("Đoạn code phía sau")
}