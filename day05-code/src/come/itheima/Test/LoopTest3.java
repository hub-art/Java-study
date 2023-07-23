package come.itheima.Test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //质数：大于1的自然数中除了1和本身外没有其他因数

        //定义一个变量，表示标记
        //标记是否为一个质数
        //true：是一个质数
        //false：不是一个质数
        boolean flag=true;

        //输入一个大于1的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的整数");
        int x = sc.nextInt();

        //被除数区间在2和输入的数之间
        for (int i = 2; i < x; i++){
            //除了1和本身外不能再被其他自然数整除
            if (x % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(x + "是一个质数");
        }else {
            System.out.println(x + "不是一个质数");
        }
    }
}
