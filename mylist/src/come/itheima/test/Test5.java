package come.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student>list = new ArrayList<>();

        //长度为0
        //键盘录入学生信息并添加到集合中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //将学生信息添加到集合中
            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
