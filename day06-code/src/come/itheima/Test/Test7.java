package come.itheima.Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
         */

        //定义一个数组
        int[] arr = {1,2,3,4,5,6};
        System.out.println(contains(arr,20));
    }

    public static boolean contains(int[] arr,int number){
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                return true;
            }
        }
        return false;
    }
}

