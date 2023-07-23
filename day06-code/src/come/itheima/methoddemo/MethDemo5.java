package come.itheima.methoddemo;

public class MethDemo5 {
    public static void main(String[] args) {

        int sum = getSum(12,12,12);
        //检查结果
        System.out.println(sum);
    }
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
