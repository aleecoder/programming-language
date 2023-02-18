package class05_oop

/**
 * 构造器
 * @author HuanyuLee
 */
class Counter {
    private var value = 0 //用来存储计数器的起始值
    private var name = "" //表示计数器的名称
    private var mode = 1 //用来表示计数器类型（1:表示步数计数器，2:表示时间计数器）

    def this(name: String) { //第一个辅助构造器
        this() //调用主构造器
        this.name = name
    }

    def this(name: String, mode: Int) { //第二个辅助构造器
        this(name) //调用前一个辅助构造器
        this.mode = mode
    }

    def increment(step: Int): Unit = value += step

    def current: Int = value

    def info(): Unit = printf("Name:%s and mode is %d\n", name, mode)
}

/**
 * Scala的每个类都有主构造器
 * 与Java不同，Scala的主构造器是整个类体，需要在类名后列出构造器所需的所有参数
 * 这些参数被编译成字段，字段的值就是创建对象时传入的参数的值
 * @param name 计数器的名称
 * @param mode 计数器类型
 */
// val 定义常量 取代了final
// var 定义变量
// Scala的类里，方法外的代码是默认在构造器中的
// 因此只需要关注个性化构造！！！
// 类名构造器中的参数就是类的成员属性，默认是private val 类型
// 只有在类名构造器中的参数可以设置成var，其它方法中的参数必须为val类型，因为要满足纯函数
class Calculator(val name: String, private val mode: Int) {
    private var value = 0

    def increment(step: Int): Unit = value += step

    def current: Int = value

    def info(): Unit = printf("Name:%s and mode is %d\n", name, mode)
}

object MyCounter {
    def main(args: Array[String]): Unit = {
        val mc = new Counter //主构造器
        val c1 = new Counter("Runner") //第一个辅构造器
        val c2 = new Counter("Timer", 2) //第二个辅构造器

        mc.info()
        mc.increment(1)
        printf("Current value is :%d\n\n", mc.current)

        c1.info()
        c1.increment(2)
        printf("Current value is :%d\n\n", c1.current)

        c2.info()
        c2.increment(3)
        printf("Current value is :%d\n\n", c2.current)

        //Scala主构造器
        val cal = new Calculator("Timer", 2)
        cal.info()
        cal.increment(4)
        printf("Current value is :%d\n", cal.current)
    }
}