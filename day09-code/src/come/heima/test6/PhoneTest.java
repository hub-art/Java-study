package come.heima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个数组存储3部手机对象
        Phone[] arr = new Phone[3];

        //定义3部手机对象
        Phone p1 = new Phone("vivo",2400,"蓝色");
        Phone p2 = new Phone("华为",5400,"黑色");
        Phone p3 = new Phone("红米",1800,"红色");

        //把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //定义一个变量计算价格的和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            int price = arr[i].getPrice();
            sum += price;
        }
        int avg = sum / arr.length;
        System.out.println("平均价格为" + avg);
    }
}
