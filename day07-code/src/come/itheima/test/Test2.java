package come.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        判断101-200之间有多少个素数，并打印所有素数。
         */

        //分析
        //素数：除1和自身以外没有其它除数
        //外循环：遍历101-200
        //内循环：每次循环都除大于等于2小于自身的数
        //定义一个flag，有其它除数赋值为false
        //每次内循环结束if(flag)判断
        //true  输出打印该数  false   不执行，进行下一次循环

        //定义一个计数器
        int count = 0;
        //for循环遍历101-200
        for (int i = 101; i <= 200; i++) {
            //
            boolean flag = true;
            //内循环
            for (int j = 2; j < i; j++) {
                //判断有没有其它除数
                if (i % j == 0){
                    //如果有就给flag赋值为false
                    flag = false;
                    break;
                }
            }
            //如果flag位true就输出打印结果，如果为false就直接跳过
            if (flag){
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}
