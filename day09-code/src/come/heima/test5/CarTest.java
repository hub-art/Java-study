package come.heima.test5;

import come.heima.test3.Goods;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //定义数组
        Car[] arr = new Car[3];

        //
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入汽车品牌
            System.out.println("请输入第"+ (i+1) +"辆汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);

            //录入汽车价格
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);

            //录入颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            //把汽车对象添加到数组中
            arr[i] = c;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice()+ "," + car.getColor());
        }
    }
}
