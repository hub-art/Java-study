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
            case "1" -> register(list);
            case "2" -> System.out.println("注册功能");
            case "3" -> System.out.println("忘记密码功能");
            default -> System.out.println("没有该选项");
        }
    }


    //注册功能
    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        if (username.length() >= 3 && username.length() <= 15) {
            if (isUsernameUnique(list, username)) {
                System.out.println("请输入密码");
                String passworld = sc.next();

            }
        } else {
            System.out.println("用户名长度不符合");
        }
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
                return false;
            }
        }
        return true;
    }

    //判断字符串组合
    public static boolean isAlphaNumeric(String str) {
        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }
}
