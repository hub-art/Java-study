package java0915;

import java.util.HashSet;

public class TestHashSetStudent {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        // 创建多个Student对象并添加到集合中
        Student student1 = new Student("001", "张三", "男", "学校A", "系部A");
        Student student2 = new Student("002", "李四", "男", "学校B", "系部B");
        Student student3 = new Student("001", "张三", "男", "学校A", "系部A"); // 重复的学生对象
        Student student4 = new Student("003", "王五", "女", "学校C", "系部C");

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        // 输出集合中的元素
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

class Student {
    private String id;
    private String name;
    private String sex;
    private String college;
    private String department;

    public Student(String id, String name, String sex, String college, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.college = college;
        this.department = department;
    }

    // 重写equals()方法，判断两个Student对象是否相等
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id.equals(student.id) && name.equals(student.name) && college.equals(student.college);
    }

    // 重写hashCode()方法
    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode() + college.hashCode();
    }

    // 输出Student对象的信息
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", college='" + college + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
