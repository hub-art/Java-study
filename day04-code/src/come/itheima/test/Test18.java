package come.itheima.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        //需求:给你一个整数X。
        //如果x 是一个回文整数，打印 true ，否则，返回 false。
        //解释:回文数是指正序(从左向右)和倒序(从右左)读都是一样的整数
        //例如，121 是回文，而 123 不是

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位数");
//        int number = sc.nextInt();
//        int remainder1 = number / 100 % 10;
//        int remainder2 = number % 10;
//        if (remainder1 == remainder2){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }..


        //输入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x = sc.nextInt();
        //记录数据
        int temp = x;
         int num = 0;
         //用while循环依次取出各位数字
        while (x != 0){
            int ge = x % 10;
            x = x /10;
            //System.out.println(ge);
            //重新排列
            num = num * 10 + ge;
        }
            System.out.println(temp == num);
    }
}
