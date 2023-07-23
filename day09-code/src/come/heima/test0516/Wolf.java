package come.heima.test0516;

public class Wolf extends Animal{
    public Wolf(){
        super("士狼",3);
        System.out.println("Wolf 无参数的构造方法");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}
