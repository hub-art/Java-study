package jieke;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //导入Scanner包
        Scanner sc = new Scanner(System.in);

        //定义a和b并赋值
        int a = -1;
        int b = -1;

        //定义x和y，键盘录入赋值
        System.out.println("请输入x的值");
        int x = sc.nextInt();
        System.out.println("请输入y的值");
        int y = sc.nextInt();

        //判断
        if ((x > 0) || (y > 0)){
            a = 10;
        }else if ((x < 10) || (y < 10)){
            b = 0;
        }
        //输出最后结果
        System.out.println("a = " + a + "," + "b = " + b);
    }
}
