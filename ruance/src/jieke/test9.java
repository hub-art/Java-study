package jieke;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        //导入scanner包
        Scanner sc = new Scanner(System.in);
        //定义用户名和密码并赋值
        String username = "admin";
        String password = "123";

        //定义输入的用户名和密码，键盘录入
        System.out.println("请输入用户名名称");
        String sc_username = sc.nextLine();
        System.out.println("请输入密码");
        String sc_password = sc.nextLine();

        //用户名或密码为空
        if (sc_username.isEmpty() && sc_password.isEmpty()){
            System.out.println("用户名或密码不能为空");
        }//账户名和密码正确
        else if (sc_username.equals(username) && sc_password.equals(password)){
            System.out.println("登陆成功");
        }//用户名错误
        else if (!sc_username.equals(username) && sc_password.equals(password)){
            System.out.println("请输入正确的用户名");
        }//密码错误
        else if (sc_username.equals(username) && !sc_password.equals(password)){
            System.out.println("请输入正确的密码");
        }//用户名和密码都错误
        else if (!sc_username.equals(username) && !sc_password.equals(password)){
            System.out.println("请输入正确的用户名和密码");
        }
    }
}
