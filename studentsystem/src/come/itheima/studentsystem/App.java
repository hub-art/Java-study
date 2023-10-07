package come.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("----------欢迎来到学生管理系统----------");
        System.out.println("请选择操作1登录 2注册 3忘记密码");

        String number = sc.next();
        switch (number) {
            case "1" -> login(list);
            case "2" -> register(list);
            case "3" -> forgetPassword(list);
            case "4" -> {
                System.out.println("谢谢使用，再见");
                System.exit(0);
            }
            default -> System.out.println("没有该选项");
        }
    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    private static void register(ArrayList<User> list) {
        //用户名，密码，身份证号，手机号码放到用户对象中
        //把用户对象添加到集合中
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        //开发细节：先验证格式是否正确，再验证是否唯一
        //  因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。

        //用户名长度必须在3~15位之间
        //只能是字母加数字的组合，但是不能是纯数字
        boolean flag1 = checkUsername(username);
        //用户名唯一

    }

    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //当代码执行到这里，表示用户名的长度是符合需求的。
        //继续校验：只能是字母加数字的组合
        //循环得到username里面的每一个字符，如果有一个字符不是字母或者数字，那么久返回false
        for (int i = 0; i < username.length(); i++) {
            //i索引
            char c = username.charAt(i);
            if (!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                return false;
            }
        }
        //当代码执行到这里，表示什么?


        //但是不能是纯数字

        return false;
    }

    private static void login(ArrayList<User> list) {
        System.out.println("登入");
    }


}
