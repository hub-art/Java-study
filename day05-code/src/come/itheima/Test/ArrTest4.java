package come.itheima.Test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值：33，5，22，44，55

        //定义一个数组
        int []arr = {33,5,22,44,55};
        //先给定义一个值
        int max = arr[0];
        //for循环遍历取出数组里的值依次比较
        for (int i = 1; i < arr.length; i++) {
            //如果数组里的值比max大就赋给max
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //输出打印检查结果
        System.out.println("最大值是" + max);
    }
}
