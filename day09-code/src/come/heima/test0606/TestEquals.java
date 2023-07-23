package come.heima.test0606;

public class TestEquals {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        s2 = s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
