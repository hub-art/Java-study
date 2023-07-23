package come.itheima.Test;

public class Test2 {
    public static void main(String[] args) {
        //需求：定义一个方法，求圆的面积，将结果在方法中进行打印。
        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法

        getArea(2);
    }

    public static void getArea(double r){
        double result = 3.14 * r * r;
        System.out.println(result);
    }
}
