package come.itheima.arraydemo;

import java.util.zip.ZipOutputStream;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //需求1：定义数组存储五个大学生的年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = {11,12,13,14,15};

        //需求2：定义数组存储3个学生姓名
        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = {"zhangsan","lisi","wangwu"};

        //需求3：定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.93,1.75,1.73,1.81};
        double[] arr6 = {1.93,1.75,1.73,1.81};
        System.out.println(arr6);//[D@4eec7777
    }
}
