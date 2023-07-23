package come.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //键盘输入录入价格
        Scanner sc = new Scanner(System.in);

        int money;
        //判断输入的价格是不是七位数
        while (true) {
            System.out.println("请录入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 999999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        while (money != 0) {
            int ge = money % 10;
            money = money / 10;
            //根据输入的价格取出相应的繁体
            String captilNumber = getCaptilNumber(ge);
            moneyStr = captilNumber + moneyStr;
        }
        System.out.println(moneyStr);

        //位数补齐七位,补 "零"
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        String result = "";
        //把单位加进去
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元",};
        for (int i = 0; i < moneyStr.length(); i++) {
            result = result + moneyStr.charAt(i) + arr[i];
        }
        //输出打印结果
        System.out.println(result);
    }

    //定义方法根据价格获取每一位对应的繁体
    public static String getCaptilNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String c = arr[number];
        return c;
    }
}
