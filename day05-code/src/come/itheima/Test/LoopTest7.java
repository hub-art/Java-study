package come.itheima.Test;

import java.beans.beancontext.BeanContext;
import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        //测试：显示随机数字
        System.out.println(number);
        //拓展：保底机制
        //记数器
        //用来统计猜了多少次了
        int count = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int guessNumber =sc.nextInt();

            //三次触发保底
            count++;
            if (count == 3){
                System.out.println("猜中了");
                break;
            }
            
            if (guessNumber > number){
                System.out.println("大了");
            }else if (guessNumber < number){
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
