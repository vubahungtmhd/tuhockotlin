package BaiTapList

fun main(args: Array<String>) {
  var quest:List<String> = listOf(
    "2+5+7= ",
    "5*10=",
    "sqrt(16)=",
    "12%2=")
  var answer:List<Int> = listOf(14,50,4,0)
  for(i in quest.indices)
  {
    print(quest[i])
    var userAnswer:Int= readln()!!.toInt()
    if(userAnswer==answer[i])
      println("correct")
    else
      println("Wrong, the answer is ${answer[i]}")
  }

}