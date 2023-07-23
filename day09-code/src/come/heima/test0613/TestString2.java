package come.heima.test0613;

public class TestString2 {
    public static void main(String[] args) {
        String str1 = "JAVA      ";
        String str2 = "programming";
        System.out.println(str1.trim().concat(str2));
        System.out.println(str1.replace('A','a'));
        System.out.println(str2.trim().toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str2.substring(5,8));
    }
}
