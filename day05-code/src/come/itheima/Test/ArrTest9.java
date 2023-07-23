package come.itheima.Test;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1~5.要求打乱数组中所有数据的顺序。
         */

        //定义一个数组
        int []arr = {1,2,3,4,5};
        //导入随机数
        Random r = new Random();
        for (int i = 0;i < arr.length;i++){
            //利用随机数随机抽取范围内的索引
            int randomIndex = r.nextInt(5);
            //定义一个临时变量记录数据
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //查看打乱后的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
