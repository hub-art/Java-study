package java0905;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("MySQL数据库应用", 89.5);
        Book b3 = new Book("Html","dhw",67.5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}