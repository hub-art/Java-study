package come.itheima.Test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /*
         生成10个~100之间的随机数存入数组。
         1)求出所有数据的和
         2)求所有数据的平均数
         3)统计有多少个数据比平均值小
         */


        //定义一个数组
        int[] arr = new int[10];
        //把随机数存到数组中
        Random r = new Random();
        int i = 0;
        while (i < arr.length){
            arr[i] = r.nextInt(100);
            i ++;
            //测试：显示数据
            System.out.println(arr[i - 1]);
        }
        //(1)求出所有数据的和
        int sum = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            sum += arr[i1];;
        }
        //打印sum查看结果
        System.out.println("数组中所有数据的和是" + sum);

        //(2)求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("所有数据的平均数是" + avg);

        //(3)统计有多少个数据比平均值小
        //定义一个数值记录结果
        int count = 0;
        //for循环遍历数据依次比较
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] < avg){
                count ++;
            }
        }
        System.out.println("共有" + count + "个比平均值小的数据");
    }
}
