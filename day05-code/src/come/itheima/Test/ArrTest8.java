package come.itheima.Test;

public class ArrTest8 {
    public static void main(String[] args) {
        /*
         需求：定义一个数组，存入1，2，3，4，5.按照要求交换索引对应的元素。
         交换前：1，2，3，4，5
         交换后：5，4，3，2，1
         */

        //定义一个数组
        int[] arr = {1,2,3,4,5};
        //利用循环交换数据
        for (int i = 0 ,j = arr.length -1;i< j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //查看结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//5 4 3 2 1
        }
    }
}
