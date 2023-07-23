package com.itheima.test5;

public class Student {
    private String name;
    private int age;


    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

}
