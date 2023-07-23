package jieke;

public class Test1 {
    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        int x;
        if (a>9&&b>5){
            x = a*a*b;
            System.out.println("x=a*a*b的值"+x);
        }else {
            if (a<0&&b<0){
                x=a-b;
                System.out.println("x=a-b的值"+x);
            }else{
                x=a+b;
                System.out.println("x=a+b的值"+x);
            }
        }

    }
}



