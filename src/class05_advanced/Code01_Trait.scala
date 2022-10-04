package class05_advanced

/**
 * 特质 (Traits) 用于在类 (Class)之间共享程序接口 (Interface)和字段 (Fields)。
 * 它们类似于Java 8的接口。
 * 类和对象 (Objects)可以扩展特质，但是特质不能被实例化，因此特质没有参数。
 * @version Scala2.13
 * @author HuanyuLee
 */

trait God {
    def help(): Unit = {
        println("god ... help!")
    }
}

trait Devil {
    def kill(): Unit
}

abstract class Person(name: String) extends God with Devil {
    override def help(): Unit = {
        println("People show the side of God and help people!")
    }

    override def kill(): Unit = {
        println("People show the devil's side and kill people!")
    }

    def love(p: Person): Person

    def getName: String = name
}

class Man(name: String) extends Person(name) {
    override def love(wife: Person): Person = {
        println(s"$name love ${wife.getName}!")
        wife
    }
}

class Woman(name: String) extends Person(name) {
    override def love(husband: Person): Person = {
        println(s"$name love ${husband.getName}!")
        husband
    }
}

final class Husband(name: String) extends Man(name) {
    def sleep(wife: Wife): Woman = {
        println(s"$name make love with ${wife.getName}!")
        wife
    }
}

final class Wife(name: String) extends Woman(name) {
    def sleep(husband: Husband): Man = {
        println(s"$name make love with ${husband.getName}!")
        husband
    }
}


object Code01_Trait {
    def main(args: Array[String]): Unit = {
        val husband = new Husband("zhang san")
        val wife = new Wife("li hong")
        val boss = new Man("liu dong")
        val secretary = new Woman("wang ting")

        husband.love(wife)
        husband.love(secretary)

        wife.love(husband)
        wife.love(boss)

        husband.sleep(wife)
        wife.sleep(husband)

        //husband.sleep(secretary)
        //wife.sleep(boss)

        husband.kill()
        husband.help()

        val god = new God {}
        god.help()
    }
}
