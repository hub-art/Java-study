package come.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：
        某系统的密码数字（大于0），比如1983，采用加密方式进行传输。
        规则如下
        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
         */

        //分析
        //1.先把整数中的每一位数都放到数组中去
        int[]arr = {1,9,8,3};
        //2.加密
        //每位数都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        //再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        //将所有数字反转
        for (int i = 0, j = arr.length - 1;i < j ;i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.将所有数字拼接起来，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
