package come.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我现在键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();//abc
        //2.代码中再定义一个字符串abc
        String str2 = "abc";
        //3.用==比较，这两者能一样吗？
        System.out.println(str1 == str2);//false
    }
}
