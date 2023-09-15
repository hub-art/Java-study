package come.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        //创建对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 19);

        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
