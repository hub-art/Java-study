package come.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String result = "abc";
        System.out.println(reverser(result));
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
