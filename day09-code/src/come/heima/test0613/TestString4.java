package come.heima.test0613;

public class TestString4 {
    public static void main(String[] args) {
        String s1 = "Student";
        String s2 = "student";
        System.out.println("s1.equals(s2)=" + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2)=" + s1.equalsIgnoreCase(s2));
        System.out.println("s1.compareTo(s2)=" + s1.compareTo(s2));
    }
}
