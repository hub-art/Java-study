package come.itheima.test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag){
                break;
            }else {
                System.out.println("当前的字符不符合规则，请重新输入");
                continue;
            }
        }

        //将内容变成罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = changeLuoma(c);
            sb.append(s);
        }

        System.out.println(sb);
    }


    public static String changeLuoma(char number) {
        String str  = switch (number){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;


    }

    //要求1：长度为小于等于9
    //要求2：只能是数字
    public static boolean checkStr(String str) {
        //要求1：长度为小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                 char c = str.charAt(i);
                 return false;
            }
        }
        //只有当字符串里面所有的字符全部判断完毕了，我才能认为当前的字符串是符合规则
        return true;
    }
}
