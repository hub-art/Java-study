package come.heima.test0606;

public class OuterClass {
    private int x = 10;

    class InnerClass {
        int y = 20;

        public void display() {
            System.out.println("内部类：" + x + "," + y);
        }
    }

    public void printInfo() {
        System.out.println("外部类:" + x);
    }
}


