package come.heima.test0530;

public class Example10 {
    public static void main(String[] args) {
        Inter inter = new InterImpl(); // 实例化InterImpl类并赋值给Inter接口类型的变量
        System.out.println("num的初始值为：" + Inter.num);
        inter.method(); // 调用Inter接口中的method方法
    }
}
