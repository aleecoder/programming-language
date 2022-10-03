package class03_functions

import java.util.Date

/**
 * 偏应用函数
 * @author HuanyuLee
 */
object Code04_PartialApplicationFunction {
    private def printLog(date: Date, tp: String, msg: String): Unit = {
        println(s"${date} :: ${tp}\t[\t${msg}]")
    }

    var info: (Date, String) => Unit = printLog(_, "info", _)
    var error: (Date, String) => Unit = printLog(_, "error", _)
    var debug: (Date, String) => Unit = printLog(_, "debug", _)

    def main(args: Array[String]): Unit = {
        //printLog(new Date(),"info","ok")
        //printLog(new Date(),"error","exception")
        //printLog(new Date(),"debug","null")
        info(new Date(), "ok")
        error(new Date(), "exception")
        debug(new Date(), "null")
    }
}
