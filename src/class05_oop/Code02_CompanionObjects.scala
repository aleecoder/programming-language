package class05_oop

/**
 * 伴生对象
 * Scala源代码编译后都会变成JVM字节码
 * 在编译源代码文件后，Scala里面的class和object在Java层面都会被合二为一
 * class里面的成员成了实例成员，object成员成了static成员
 * @author HuanyuLee
 */

class Man(val name: String) {
    // object Man 中私有的属性和方法依然可以被访问
    private val id: Int = Man.CardID()

    def info(): Unit = printf("The id of %s is %d\n", name, id)
}

object Man {
    private var ID = 0
    //伴生对象中定义的 PersonID() 实际上实现了Java中静态方法的功能
    private def CardID(): Int = {
        ID += 1
        ID
    }
}

object Code02_CompanionObjects {
    def main(args: Array[String]): Unit = {
        val m1 = new Man("ZiYu")
        val m2 = new Man("MinXin")
        m1.info()   //The id of ZiYu is 1
        m2.info()   //The id of MinXin is 2
    }
}
