package come.heima.test0516;

public class Sub extends Base{
    public String color;
    public Sub(double size,String name,String color){
        super(size,name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub(5.6,"测试对象","红色");
        System.out.println(s.size + "__" + s.name + "__" + s.color);
    }
}
