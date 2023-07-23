package come.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //定义正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //三次机会
        for (int i = 0; i < 3; i++) {
            //键盘录输入的用户名密码
            Scanner sc = new Scanner(System.in);
            //请输入用户名
            System.out.println("请输入用户名");
            String username = sc.next();
            //请输入密码
            System.out.println("请输入密码");
            String password = sc.next();
            //判断输入的是否正确，正确则进入，不正确则提示"用户名或密码错误"
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登陆成功");
                //登录成功跳出循环
                break;
            } else {
                if ((2-i) != 0) {
                    System.out.println("用户名或密码错误，你还有" + (2-i) + "次机会");
                } else {
                    System.out.println("您的账户已被冻结，请联系xxx-xx-xxxx");
                }
            }
        }

    }
}
