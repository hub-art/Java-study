package come.heima.test0523;

import java.sql.SQLOutput;

public class Root {
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参数的构造方法");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数的构造方法");
    }
    public Mid(String msg){
        this();
        System.out.println("Mid的无参数构造方法，其参数值：" + msg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        super("Struts2权威指南");
        System.out.println("执行Leaf的构造方法");
    }
}