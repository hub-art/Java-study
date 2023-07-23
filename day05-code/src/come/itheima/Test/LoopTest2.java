package come.itheima.Test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++){
            if (i * i == x){
                System.out.println(x + "的平方根为" + i);
                break;
            }else if (i * i > x){
                System.out.println(i-1 + "就是" + x +"平方根的整数部分");
                break;
            }
        }
    }
}
