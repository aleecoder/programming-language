package class05_oop

/**
 * 特质
 * 特质 (Traits) 用于在类 (Class)之间共享程序接口 (Interface)和字段 (Fields)。
 * 它们类似于Java 8的接口。
 * 类和对象 (Objects)可以扩展特质，但是特质不能被实例化，因此特质没有参数。
 * (1)Java中提供了接口，允许一个类实现任意数量的接口
 * (2)Scala中没有接口的概念，而是提供了特质，它不仅实现了接口的功能，还具备了很多其他的特性
 * (3)Scala的特质，是代码重用的基本单元，可以同时拥有抽象方法和具体方法
 * (4)Scala中一个类只能单继承一个超类，却可以实现多个特质，从而重用特质中的方法和字段，实现了多重继承
 * @author HuanyuLee
 */

trait CarID {
    var id: Int

    def currentID(): Int //定义了一个抽象方法
}

trait CarGreeting {
    def greeting(msg: String): Unit = println(msg)
}

//把特质混入类中，使用extends混入第一个特质，后面可以反复使用with混入更多特质
class BYDCarID extends CarID with CarGreeting {
    override var id: Int = 10000

    def currentID: Int = {
        id += 1
        id
    }
}

class BMWCarID extends CarID with CarGreeting {
    override var id: Int = 20000

    def currentID: Int = {
        id += 1
        id
    }
}

object Code08_Trait {
    def main(args: Array[String]): Unit = {
        val byd = new BYDCarID
        val bmw = new BMWCarID

        byd.greeting("Welcome my first Car!")
        printf("My first CarID is %d.\n", byd.currentID)

        bmw.greeting("Welcome my second Car!")
        printf("My second CarID is %d.\n", bmw.currentID)
    }
}
