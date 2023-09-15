package come.itheima.test;

public class Student {
    //1.私有化成员变量
    //2.空参构造方法
    //3.带全部参数的构造方法
    //get/set方法
    private String name;
    private int age;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
