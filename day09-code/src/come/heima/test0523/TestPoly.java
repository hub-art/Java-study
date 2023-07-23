package come.heima.test0523;

public class TestPoly {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        func(an1);
        an1 = new Dog();
        func(an1);
        an1 = new Cat();
        func(an1);
    }
    public static void func(Animal an){
        an.shout();
        if (an instanceof Dog){
            Dog d = (Dog) an;
            d.sleep();
        }
    }
}
