package come.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Phone>list = new ArrayList<>();
        //创建对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        //把对象添加到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //调用方法将低于3000的手机信息返回
        ArrayList<Phone> phoneInfo = getPhoneInfo(list);
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone p = phoneInfo.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }
    }

    //定义一个方法将价格低于3000的手机信息返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone>list){
        ArrayList<Phone>info = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if (p.getPrice()<3000){
                info.add(list.get(i));
            }
        }
        return info;
    }
}
