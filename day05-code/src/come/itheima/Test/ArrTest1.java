package come.itheima.Test;

public class ArrTest1 {
    public static void main(String[] args) {
        //定义一个数组，存储1，2，3，4，5
        //遍历数组得到每一个元素，求数组里面所有的数据和

        //定义一个数组
        int []arr={1,2,3,4,5};
        int sum = 0;

        //遍历取出数组里边的数据
        for (int i = 0; i < arr.length; i++) {
            //把遍历出的数据循环相加
            sum += arr[i];
        }
        //输出打印相加后的结果
        System.out.println("数组里所有的数据和是" + sum);
    }
}
