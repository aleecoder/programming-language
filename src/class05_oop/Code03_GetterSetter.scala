package class05_oop

/**
 * @author HuanyuLee
 */
class Board {
    private var _x = 0
    private var _y = 0

    def increment(step: Int): Unit = x += step
    def current: Int = x

    def x: Int = _x //getter
    def y: Int = _y //getter

    def x_=(x: Int): Unit = { //setter
        if (x > 0) _x = x
    }

    def y_=(y: Int): Unit = { //setter
        if (y > 0) _y = y
    }
}

object MyBoard {
    def main(args: Array[String]): Unit = {
        val c = new Board
        println(c.x)    //取出 x 的值
        c.x = 10        //为 x 设置新的值
        c.increment(5)
        println(c.current)
    }
}
