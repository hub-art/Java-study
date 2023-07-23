package come.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
         需求：
         在歌唱比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。*
         选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
         */

        //分析：
        //1.手动录入6为评委打的分数
        int []scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2.最大值
        int max = getMax(scoreArr);
        System.out.println("最大值是" + max);
        //3.最小值
        int min = getMin(scoreArr);
        System.out.println("最小值是" + min);
        //4.求和
        int sum = getSum(scoreArr);
        System.out.println("和是" + sum);
        //5.求去掉最大值和最小值后的平均值
        int avg = (sum - max -min) / (scoreArr.length - 2);
        System.out.println("去点最大值和最小值后的平均值为" + avg);
    }
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    //3.最小值
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (min > scoreArr[i]){
                min = scoreArr[i];
            }
        }
        return min;
    }

    //2.最大值
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (max < scoreArr[i]){
                max = scoreArr[i];
            }
        }
        return max;
    }

    //1.手动录入6为评委打的分数
    public static int[] getScores(){
        //定义一个长度为6的数组
        int []scores = new int[6];
        Scanner sc = new Scanner(System.in);
        //遍历数组依次输入赋值
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            scores[i] = score;
        }
//        //循环遍历检查数组
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
        return scores;
    }
}
