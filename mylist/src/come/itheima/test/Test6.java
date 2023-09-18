package come.itheima.test;

import java.util.ArrayList;

/*
1.main方法中定义一个集合，存入三个用户对象
用户属性为：id，username，password
2.要求：定义一个方法，根据id查找对应的用户信息
如果存在，返回true
如果不存在，返回false
 */
public class Test6 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<User> list = new ArrayList<>();

        //创建三个用户对象
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "123456abc");

        //把用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调查方法查看id是否存在
        boolean flag = contains(list, "001");

        //打印结果
        System.out.println(flag);
    }

    /*
    定义一个方法，根据id查找对应的用户信息
    如果存在，返回true
    如果不存在，返回false
     */
    public static boolean contains(ArrayList<User> list, String id) {
        int index = getIndex(list, id);
        if (index >= 0){
            return true;
        }
        return false;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
