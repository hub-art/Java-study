package jieke;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //导入Scanner包
        Scanner sc = new Scanner(System.in);
        //定义整数类型a、b、c、d并键盘录入a、b、c、d的值
        System.out.println("请输入a的值");
        int a = sc.nextInt();
        System.out.println("请输入b的值");
        int b = sc.nextInt();
        System.out.println("请输入c的值");
        int c = sc.nextInt();
        System.out.println("请输入d的值");
        int d = sc.nextInt();

        //定义 结果Y根据判断赋值
        int Y;
        if ((a > 12 && b < 13) && (c > 4 || d < 20)){
            Y = 3 * a + 10 * b + 5 * d - c;
        }else {
            Y = 10 * d - (a + b) * c / 5;
        }

        //输出结果
        System.out.println("Y的值是" + Y);
    }
}
