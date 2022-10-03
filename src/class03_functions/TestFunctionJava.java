package class03_functions;

/**
 *
 * @author HuanyuLee
 */
public class TestFunctionJava {
    // Java中方法是不能嵌套定义的！！！
    /* public static double f(int r) {
        public static double g () {
            return Math.PI * r * r;
        }
        return g();
    } */
    public static double f(int r) {
        return g(r);
    }

    public static double g(int r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        double f = f(3);
        System.out.println("f = " + f);
    }
}
