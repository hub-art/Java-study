package come.heima.test0530;

public class TestFinalVariable {
    final int a = 6;
    final String str;
    final int c;
    final static double d;

    {
        str = "Hello";
        //a=9
    }

    static {
        d = 5.6;
    }

    public TestFinalVariable() {
        //str="java";不合法
        c = 5;
    }

    public void changeFinal() {
        //d=1.2
        //ch='a'
    }
}
