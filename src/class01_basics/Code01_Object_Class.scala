package class01_basics

/**
 * object 和 class 一些细节
 * @author HuanyuLee
 */
object XX {
    var girl = "li hong"
    private var boy = "zhang san"
    // 方法体外的语句，scala编译后将它放在了static静态代码块里，优先被执行
    //println("main:: up...")
    private val t = new T("woman")
    t.printMsg()
    println("-----------------------------")
    private val t2 = new T(100)
    t2.printMsg()

    def main(args: Array[String]): Unit = {
        println("-----------------------------")
        val tt = new TT()
        tt.printMsg()
    }

    //println("main:: down...")
}

// val 定义常量 取代了final
// var 定义变量
// Scala的类里，方法外的代码是默认在构造器中的
// 因此只需要关注个性化构造！！！
// 类名构造器中的参数就是类的成员属性，默认是private val 类型
// 只有在类名构造器中的参数可以设置成var，其它方法中的参数必须为val类型，因为要满足纯函数
class T(sex: String) {
    var a = 1

    //val SEX = "man"

    // 个性化构造
    def this(a: Int) {
        this("man") // 必须调用默认构造器
        //this.SEX = "woman" // error
        this.a = a
    }

    def printMsg(): Unit = {
        println(s"T::sex = $sex")
    }

    def f(i: Int): Unit = {
        //i = 3  // error: reassignment to val
    }
}

class TT {
    var a = 11
    var name = "scala"
    println("T::up")

    // 个性化构造
    def this(a: Int) {
        this() // 必须调用默认构造器
        this.a = a
    }

    def printMsg(): Unit = {
        // scala中字符串的拼接
        println(s"TT::name = $name")
        // 调用object的属性
        println(s"girl = ${XX.girl}")
        //println(s"boy = ${XX.boy}")   // error
        println(s"${a + 1}")
    }

    println("T::down")
}
