package come.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        需求：
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
         */


        Scanner sc = new Scanner(System.in);
        //输入机票原价
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        //输入月份
        System.out.println("请输入月份");
        int month = sc.nextInt();
        //输入要乘坐的仓位
        System.out.println("请输入是头等舱还是经济舱 0 代表头等舱 1 代表经济舱");
        int seat = sc.nextInt();

        //先判断是淡季还是旺季

        //旺季
        if (month >= 5 && month <= 10){
            //头等舱
            ticket = getTicket(ticket, seat, 0.9, 0.85);
            //淡季
        }else if ((month <= 11 && month <= 12) || (month >= 1 && month <= 4)){
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        }else {
            System.out.println("录入的月份不合法");
        }
        //输出打印最后打折后的计算结果
        System.out.println("机票价格为" + ticket);
    }

    private static int getTicket(int ticket, int seat, double v, double v2) {
        //头等舱
        if (seat == 0) {
            ticket *= v;
        }
        //经济舱
        else if (seat == 1) {
            ticket *= v2;
        } else {
            System.out.println("没有这个仓位");
        }
        return ticket;
    }
}
