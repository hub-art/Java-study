package come.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        System.out.println("输入两个数字表示一个范围");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int count = 0;
        for (;number1 <= number2; number1++){
            if (number1 % 3 == 0 && number1 % 5 == 0){
                count ++;
            }
        }
        System.out.println("范围中既能被3整除，又能被5整除的数字有" +count + "个");
    }
}
