package class05_oop

/**
 * 样例类（Case classes）和普通类差不多，结合模式匹配更好理解
 * 样例类非常适合用于不可变的数据。
 * 比如，在分布式环境下，在一台机器A上准备一批数据封装成对象。序列化后交给另外一台机器B上的一个进程
 * B收到数据后要判断这批数据代表什么意思，是哪个对象哪个类型，比较麻烦
 * 这时可以将这些数据封装成样例类，如果里面的内容一样，那一定判断为true
 * @author HuanyuLee
 */

case class Dog(name: String, age: Int)

object Code05_CaseClasses {
    def main(args: Array[String]): Unit = {
        // 样例类可以省略 new
        val dog1 = Dog("Husky", 18)
        val dog2 = Dog("Husky", 18)
        println(dog1.equals(dog2)) // true
        println(dog1 == dog2) // true
    }
}
