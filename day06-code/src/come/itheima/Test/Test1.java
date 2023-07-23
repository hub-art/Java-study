package come.itheima.Test;

public class Test1 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
        getlength(20,30);
    }

    public static void getlength(double num1,double num2){
        double result = (num1 + num2) * 2;
        System.out.println(result);
    }
}
