package come.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //遍历该字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //统计大写字母出现的次数
            //char类型的变量在参与计算的时候自动类型提升为int 查询ASCII码表
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }//统计小写字母出现的次数
            else if (c >= 'a' && c <= 'z') {
                smallCount++;
            }//统计数字出现的次数
            else if (c >= '1' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("数字有" + numberCount + "个");

    }
}
