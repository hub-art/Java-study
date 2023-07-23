package come.heima.test0613;

public class TestString1 {
    public static void main(String[] args) {
        byte[] b={65,66,67};
        System.out.println(new String(b));
        char[]c ={'a','b','c'};
        System.out.println(new String(c));
        System.out.println(new String("软件技术"));
        System.out.println(new StringBuffer("abc"));
    }
}
