package come.heima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        //定义数组存储4个女朋友的对象
        GirlFriend[] arr = new GirlFriend[4];

        //定义四个对象
        GirlFriend gf1 = new GirlFriend("张三",18,"女","跑步");
        GirlFriend gf2 = new GirlFriend("李四",19,"男","打游戏");
        GirlFriend gf3 = new GirlFriend("王五",22,"男","听歌");
        GirlFriend gf4 = new GirlFriend("小明",20,"女","游泳");

        //把女朋友对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //定义一个变量sum存储年龄的和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            int age = arr[i].getAge();
            sum += age;
        }

        //求年龄平均值
        int avg = sum / arr.length;

        //定义一个变量用来计数
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avg){
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
                count++;
            }
        }
        System.out.println("比平均值低的女朋友有" + count + "个");
    }
}
