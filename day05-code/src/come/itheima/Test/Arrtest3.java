package come.itheima.Test;

import java.util.zip.Adler32;

public class Arrtest3 {
    public static void main(String[] args) {
        //定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素。
        //要求：
        //1.如果是奇数，则将当前数字扩大两倍
        //2.如果是偶数，则将当前数字变成二分之一

        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //for循环遍历取出数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //if判断是奇数还是偶数
            if (arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
        }
        //检查结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
