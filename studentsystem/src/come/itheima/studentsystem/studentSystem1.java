package come.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        //登陆界面
        System.out.println("----------欢迎来到学生管理系统----------");
        System.out.println("请选择操作1登录 2注册 3忘记密码");

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        switch (number) {
            case "1" -> register();
            case "2" -> System.out.println("注册功能");
            case "3" -> System.out.println("忘记密码功能");
            default -> System.out.println("没有该选项");
        }
    }


    //注册功能
    public static void register() {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        
    }

    //登录功能
    public static void login() {

    }

    //忘记密码功能
    public static void forgotPassword() {

    }

    //判断用户名是否唯一
    public static boolean isUsernameUnique(ArrayList<User> list, String username) {
        for (User u : list) {
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
