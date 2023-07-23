package come.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
        把数字中的每一位都放到数组中去
         */

        //分析：
        //先有一个数字
        //确定这个数字的长度
        //定义一个空的数组
        //用取余除获得每一位上的数字
        //把每一位上的数字依次赋值给定义好的数组

        //定义一个数值
        int number = 12345;
        //定义一个临时变量来记录数字
        int temp = number;
        //定义一个计数器来统计数字长度
        int count = 0;
        //取整除来统计长度
        while (number != 0){
            number = number / 10;
            count++;
        }
        System.out.println("长度为：" + count);
        //定义一个动态数组，长度为count
        int []arr = new int[count];
        //定义一个变量作下标索引
        int index = arr.length - 1;
        while (temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
