package come.itheima.test;

import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求：
        定义方法实现随机产生一个五位的验证码
        验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位数字
         */

        //分析：
        //定义一个动态数组
        //把26个英文字母大小写导入到数组
        //定义一个空的字符串变量用来存储随机结果
        //导包
        //随机获取四个英文字母并存入提前定义好的字符串变量
        //定义一个数值变量并赋值随机数
        //把随机获取的数字存入定义好的字符串变量
        //输出打印验证码

        //定义一个动态数组
        char [] arr = new char[26+26];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //根据Ascall码强转为字符来获得大小写字母
            if (i <= 25){
                //添加小写字母
                arr[i] = (char)(97 + i);
            }else {
                //添加大写字母
                arr[i] = (char)(65 + i -26);
            }
        }
        //定义一个空的字符串变量用来存储随机结果
        String result = "";
        Random r = new Random();
        //循环四次取四次随即结果
        for (int i =0;i <4;i++){
            int randomIndex = r.nextInt(arr.length);
            //把每次结果都添加到提前定义好的空的字符串变量中
            result = result + arr[randomIndex];
//            //检验
//            System.out.println(result);
        }
        //定义一个数值变量来存储随机数
        int number = r.nextInt(10);
        //把获取的随机数添加到定义好的字符串变量中
        result = result + number;
        //输出打印验证码
        System.out.println(result);
    }
}
