package class05_oop;

/**
 * @author HuanyuLee
 * @date 2022/10/2
 */
public class Code00_JavaStatic {
    static {
        System.out.println("main:: up...");
    }
    public static void main(String[] args) {
        System.out.println("main...");
    }

    static {
        System.out.println("main:: down...");
    }
}
