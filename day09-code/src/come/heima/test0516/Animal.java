package come.heima.test0516;

public class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal 带一个参数的构造方法，该动物的name为" + name);
    }
    public Animal(String name,int age){
        this(name);
        System.out.println("Animal 带两个参数的构造方法，其 age 为" + age);
    }
}
