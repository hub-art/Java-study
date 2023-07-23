package come.heima.test0523;

import java.sql.SQLOutput;

public class Animal {
    public void shout(){
        System.out.println("动物要叫");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵...");
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("旺旺旺...");
    }
    public void sleep(){
        System.out.println("喵喵喵");
    }
}