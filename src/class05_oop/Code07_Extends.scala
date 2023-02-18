package class05_oop

/**
 * 继承
 *
 * 与Java不同之处：
 * (1)重写一个非抽象方法必须使用override修饰符
 * (2)只有主构造器可以调用超类的主构造器
 * (3)在子类中重写超类的抽象方法时不需要使用override关键字
 * (4)可以重写超类中的字段
 *
 * 与Java相同之处：
 * (1)不允许从多个超类继承
 * (2)使用特质（Trait）解决多重继承
 * @author HuanyuLee
 */

abstract class Car { //抽象类不能直接被实例化
    val carBrand: String //抽象字段，没有初始化

    def info(): Unit //抽象方法，不需要使用abstract关键字

    def greeting(): Unit = println("Welcome to my car!")
}

class BMCar extends Car {
    override val carBrand: String = "BMW"

    def info(): Unit = printf("This is a %s car. It is expensive.\n", carBrand)

    override def greeting(): Unit = println("Welcome to my BMW car!")
}

class BYDCar extends Car {
    override val carBrand: String = "BYD"

    def info(): Unit = printf("This is a %s car. It is cheap.\n", carBrand)

    override def greeting(): Unit = println("Welcome to my BYD car!")
}

object Code07_Extends {
    def main(args: Array[String]): Unit = {
        val bmw = new BMCar
        val byd = new BYDCar

        bmw.greeting()
        bmw.info()

        byd.greeting()
        byd.info()
    }
}
