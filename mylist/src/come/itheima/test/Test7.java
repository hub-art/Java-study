package come.itheima.test;

import java.util.ArrayList;

public class Test7 {
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

        //
        int index = getIndex(list, "004");
        System.out.println(index);
    }

    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
