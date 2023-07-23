package come.itheima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int []arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                result = result + arr[i] + "]";

            }else {
                result = result + arr[i] + ", ";
            }
        }
        return result;
    }
}
