package class05_oop

/**
 * 单例对象
 * @author HuanyuLee
 */
object Person {
    private var ID = 0
    def PersonID(): Int = {
        ID += 1
        ID
    }
}

object Code01_SingletonObject{
    def main(args: Array[String]): Unit = {
        printf("The first person id is %d.\n", Person.PersonID()) //1
        printf("The second person id is %d.\n", Person.PersonID()) //2
        printf("The third person id is %d.\n", Person.PersonID()) //3
    }
}