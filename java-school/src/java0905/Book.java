package java0905;

public class Book extends Object{
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setPrice(Double price){
        if (price<0){
            price=0.0;
        }
        this.price=price;
    }
    //构造方法重载    overload重载  override重写
    public Book(){
        System.out.println("缺省构造方法");
    }
    public Book(String name,String author,Double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name,Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    public void finalize(){

    }
}