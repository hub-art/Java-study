package Message;

public class MessageUtil {
    //成员属性
    private String message;
    private int money; //金额

    //构造函数
    public MessageUtil(String message){
        this.message = message;
    }

    //成员方法：打印信息
    public String printMessage(){
        System.out.println(this.message);
        return this.message;
    }

    //存钱操作
    public void depositeMoney(int i){
        money += i;
    }

    //查看账户
    public int showMoney(){
        return money;
    }

}
