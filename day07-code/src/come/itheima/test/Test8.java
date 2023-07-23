package come.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*
        将加密后的结果解密出来
         */

        //分析：
        //1.定义数组记录解密后的结果
        int[] arr = {8,3,4,6};
        //2.反转
        for (int i = 0,j = arr.length - 1;i < j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.由于加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断，0~4之间+10    5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] += 10;
            }
        }
        //4.每一位减去5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        //5.将所有数字拼接，变成解密后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number *10 + arr[i];
        }
        //6.输出打印解密后的结果
        System.out.println(number);
    }
}