package come.heima.test0613;

public class TestString3 {
    public static void main(String[] args) {
        String s = "Java programming";
        System.out.println("字符串的长度：" + s.length());
        System.out.println("字符串中第一个字符" + s.charAt(0));
        System.out.println("字符a第一次出现的位置"+s.indexOf('a'));
        System.out.println("字符a最后一次出现的位置" + s.lastIndexOf('a'));
        System.out.println("子字符串Java第一次出现的位置"+s.indexOf("Java"));
        System.out.println("判断你字符串是否以ing结尾"+s.endsWith("ing"));
        System.out.println("判断字符串是否以Java开头"+s.startsWith("Java"));
    }
}
