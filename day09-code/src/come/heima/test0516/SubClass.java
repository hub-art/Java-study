package come.heima.test0516;

public class SubClass extends BaseClass{
    public int a = 7;
    public void accessOwner(){
        System.out.println(a);
    }
    public void accessBase(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        System.out.println(sc.a);
        sc.accessOwner();
        sc.accessBase();
    }
}
