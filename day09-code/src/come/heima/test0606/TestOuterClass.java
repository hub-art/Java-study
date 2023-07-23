package come.heima.test0606;

public class TestOuterClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.printInfo();
        OuterClass.InnerClass ic=oc.new InnerClass();
        ic.display();
    }
}
