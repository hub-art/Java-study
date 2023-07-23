package come.itheima.Test;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：设计一个方法求数组的最大值，并将最大值返回
         */
        int[] arr = {41,29,33,94,55};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[]arr){
        //先定义max并赋予一个值
        int max = arr[0];
        //遍历数组中的元素并依次比较
        //
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //将最大值返回
        return max;
    }
}
