package come.itheima.test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        //需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)
        //将两数相除，要求不使用乘法、除法和 % 运算符。
        // 得到商和余数。

        //定义两个变量记录除数和被除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个除数");
        int divisor = sc.nextInt();
        System.out.println("请输入一个被除数");
        int dividend = sc.nextInt();
        //定义一个变量记录循环次数，也就是商
        int count = 0;
            while (divisor >= dividend){
                divisor -= dividend;
                count ++;
            }

        System.out.println("商是" + count);
        System.out.println("余数是" + divisor);
    }
}
