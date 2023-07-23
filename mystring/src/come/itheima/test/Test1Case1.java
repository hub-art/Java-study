package come.itheima.test;

import java.util.Scanner;

public class Test1Case1 {
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
            int number = c - 48;
            String s = changeLuoma(number);
            sb.append(s);
        }

        System.out.println(sb);
    }

    //定义一个罗马数字数组
    public static String changeLuoma(int number) {
        //定义一个数组，让索引跟罗马数字产生一个对应关系
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
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
