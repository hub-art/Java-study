package come.itheima.stringdemo;


public class StringDemo11 {
    public static void main(String[] args) {
        String id = "130533200408155533";
        //截取相应的年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        //按格式输出相应的信息
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");

        //截取第17位根据奇偶判断男女
        char gender = id.charAt(16);
        //利用ASCALL码进行转换
        int num = gender - '0';
        //if判断奇偶判断男女
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
