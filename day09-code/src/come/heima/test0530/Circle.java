package come.heima.test0530;

public class Circle implements Figure{
    double radius;
    public Circle(double r){
        radius=r;
    }
    public void area(){
        System.out.println("圆的面积="+PI*radius*radius);
    }
}

