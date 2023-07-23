package come.itheima.methoddemo;

public class MethDemo4 {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义的格式和调用的格式

        getSum(99,11);
    }

    public static void getSum(int number1,int number2){
        int result = number1 + number2;
        System.out.println(result);
    }
}
