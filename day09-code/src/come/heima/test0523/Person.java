package come.heima.test0523;

public class Person {
    {
        int a = 6;
        if (a > 4){
            System.out.println("Person初始化块：局部变量a的值大于4");
        }
        System.out.println("Person的初始化块");
    }

    {
        System.out.println("Person的第二个初始化块");
    }
    public Person(){
        System.out.println("Person类的无参数构造方法");
    }

    public static void main(String[] args) {
        new Person();
    }
}
