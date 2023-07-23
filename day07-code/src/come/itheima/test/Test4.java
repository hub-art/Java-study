package come.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*
         需求：
         把一个数组中的元素赋值到另一个新数组中去
         */

        //分析：
        //先定义一个静态数组
        //定义一个动态数组
        //循环遍历第一个数组赋值给第二个数组

        //定义一个数组
        int []arr = {1,2,3,4,5};
        //定义一个空数组长度与arr[]相同
        int []newArr = new int[arr.length];
        //循环遍历arr[]
        for (int i = 0; i < arr.length; i++) {
            //arr[]与newArr[]下标索引相同用同一个变量
            //遍历赋值
            newArr[i] = arr[i];
        }
        //遍历newArr[]检查结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
