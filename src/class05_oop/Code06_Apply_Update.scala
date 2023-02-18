package class05_oop

/**
 * apply方法
 *      用括号传递给变量（对象）一个或多个参数时，Scala会把它转换成对apply方法的调用
 * update方法
 *      当对带有括号并包含一到若干参数的对象进行赋值时，编译器将调用对象的update方法，
 *      在调用时，是吧括号里的参数和等号右边的对象一起作为update方法的输入参数来执行调用
 * @author HuanyuLee
 */

class Boy {
    def apply(): Unit = println("Apply method in class is called!")

    def greetingOfClass(): Unit = println("Greeting method in class is called!")
}

object Boy {
    def apply(): Unit = println("Apply method in object is called!")

    def tech(): Unit = println("xxx")
}

object Code06_Apply_Update {
    def main(args: Array[String]): Unit = {
        Boy() //调用伴生对象中的apply方法
        val boy = new Boy
        boy() //调用伴生类中的apply方法

        //Scala中的Array对象定义了apply方法，因此可以采用如下方式初始化
        //不需要new关键字、不用构造器，直接传递3个参数，Scala就会转换成apply方法的调用
        //也就是调用Array类的伴生对象Array的apply方法，完成数组的初始化
        val arr = Array[String]("BigData", "Hadoop", "Spark")
        //实际上，调用伴生类Array中的update方法，来执行arr.update(0, "Flink")
        arr(0) = "Flink"
    }
}
