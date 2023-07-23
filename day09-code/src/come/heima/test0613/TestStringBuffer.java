package come.heima.test0613;

import java.util.Queue;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println("append后的结果："+sb);
        sb.insert(3, "Q");
        System.out.println("insert后的结果："+sb);
        sb.reverse();
        System.out.println("reverse后的结果："+sb);
    }
}
