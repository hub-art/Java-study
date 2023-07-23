package come.heima.test0509;

public class Dog extends Animal{
    public void say(){
        System.out.println("狗叫：汪汪汪");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.weight = 150;
        d.eat();
        d.say();
    }
}
