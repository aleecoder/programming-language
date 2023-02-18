package class05_oop

import scala.io.StdIn._

/**
 * 模式匹配
 * @author HuanyuLee
 */
object Code09_PatternMatching {
    def main(args: Array[String]): Unit = {
        //简单匹配
        val colorNum: Int = readInt()
        val str = colorNum match {
            case 1 => "red"
            case 2 => "green"
            case 3 => "yellow"
            case _ => "Not Allowed"
        }
        println(str)

        //类型匹配
        //Java 中如何做？instanceof判断
        for (elem <- List(1, 3.14, "Hadoop")) {
            val str = elem match {
                case i: Int => i + " is an int value."
                case d: Double => d + " is a double value."
                case s: String => s + " is a string value."
                case _ => "This is an unexpected value."
            }
            println(str)
        }

        //case类的匹配
        case class Car(brand: String, price: Int)
        val byd = Car("BYD", 89000)
        val bmw = Car("BMW", 1200000)
        val benz = Car("Benz", 1500000)
        for (car <- List(byd, bmw, benz)) {
            car match {
                case Car("BYD", 89000) => println("Hello,BYD!")
                case Car(brand, price) => printf("Brand: %s, Price: %d, do you want it?\n", brand, price)
            }
        }

        //Option类型
        //（1）标准类库中的Option类型用case类来表示那种可能存在、也可能不存在的值
        //（2）当预计到变量或函数返回值可能不会引起任何值时，建议使用Option类型
        //（3）Option类包含一个子类Some，当存在可以被引用的值时，可以使用、Some来包含这个值，例如Some("Hadoop)
        //（4）而None则被声明为一个对象，而不是一个类，表示没有值
        val books = Map("hadoop" -> 5, "spark" -> 10, "hbase" -> 7)
        println(books.get("hadoop")) //Option[Int] = Some(5)
        println(books.get("hive")) //Option[Int] = None
        println(books.getOrElse("flink", "No such Book"))
    }
}
