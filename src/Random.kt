import kotlin.random.Random

/*
- Random số nguyên:
    +var rd=Random
     var rdNguyen=rd.nextInt(10) từ 0 đến sát 10 (9)
- Random số nguyên trong đoạn từ a đến sát b
     var rdNguyen=rd.nextInt(10,10) tù 10 đến 9(sát 10)
- Random số thuc
    var rdThuc=rd.nextDouble() 0 đến sát 1;
    var rdThuc=rd.nextDouble()*10; từ 0 đến sát 10
    var rdThuc=rd.nextDouble()*100....
*/
fun main(args: Array<String>) {
    var rd= Random
    //Số nguyên
    var rdNguyen=rd.nextInt(10)
    println(rdNguyen);
    //Số thực từ 0 đến sát 1
    var rdThuc=rd.nextDouble()
    println(rdThuc)
    //Số thực từ 0 đến khác 1
    //Random 1 số nguyên và 1 số thức rồi cộng vào nhau
    var phanNguyen=rd.nextInt(-50,50)
    var phanThapPhan=rd.nextDouble()
    var rdSoThapPhan=phanNguyen+phanThapPhan
    println(rdSoThapPhan)
    //Random * n
    var rdThuc1=rd.nextDouble()*10;
    println(rdThuc1)

}