package come.heima.test0530;

public abstract class Person {
    String name;
    String sex;
    String profession;

    public abstract void printProfession();
}

class Student extends Person {
    public void printProfession() {
        System.out.println("学生");
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.printProfession();
    }
}
