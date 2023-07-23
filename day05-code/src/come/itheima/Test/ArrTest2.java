package come.itheima.Test;

public class ArrTest2 {
    public static void main(String[] args) {
        //定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字

        //定义一个数组
        int [] arr ={1,2,3,4,5,6,7,8,9,10};

        //定义一个变量记数
        int count = 0;
        //for循环遍历取出数组中的元素
        for (int i = 0; i < arr.length; i++) {
            //if判断是否能被3整除
            if (arr[i] % 3 == 0){
                count++;
            }
        }
        //输出打印统计结果
        System.out.println("一共有" + count + "个能被3整除的数字");
    }
}
