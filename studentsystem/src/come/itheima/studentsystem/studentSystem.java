package come.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");

            Scanner sc = new Scanner(System.in);
            String number = sc.next();

            switch (number) {
                case "1" -> addStudent(list);
                case "2" -> {
                    boolean flag = deleteStudent(list);
                    if (!flag){
                        break;
                    }
                }
                case "3" -> updateStudent(list);
                case "4" -> findStudent(list);
                case "5" -> System.exit(0);//停止虚拟机运行
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //利用空参构造先创建学生对象
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        //id唯一
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                System.out.println("id重复，请重新输入");
                addStudent(list);
            }
        }
        s.setId(id);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生的家庭地址");
        String address = sc.next();
        s.setAddress(address);
        //把对象添加到集合中
        list.add(s);
    }

    //删除学生
    public static boolean deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)){
                list.remove(i);
                return true;
            }
        }
        System.out.println("不存在");
        return false;
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {

    }

    //查询学生
    public static void findStudent(ArrayList<Student> list) {

    }
}
