package class07_advance

/**
 * 隐式转换 —— 隐式参数
 * @author HuanyuLee
 */
object Code07_ImplicitParameters {

    implicit val name: String = "Tom"
    implicit val age: Int = 18

    def func(implicit name: String, age: Int): Unit = {
        println(s"${name}是一名大数据开发工程师, 今年${age}岁了.")
    }

    def g(girlfriend: String)(implicit age: Int): Unit = {
        if (age == 18)
            println(s"你的女朋友${girlfriend}美若天仙, 永远${age}岁!!!")
        else
            println(s"实际上，你的女朋友${girlfriend}很漂亮, 今年都${age}啦!!!")
    }

    def main(args: Array[String]): Unit = {
        func
        g("小红")
        g("小红")(30)
    }
}
