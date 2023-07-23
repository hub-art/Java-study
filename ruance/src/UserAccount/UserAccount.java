package UserAccount;

public class UserAccount {
    private int money;
    public UserAccount(){
        money = 0;
    }
    //存钱
    public void depositeMoney(int i){
        money += i;
    }
    //取钱，方法还未完成开发
    public void withdrawMoney(int i){
        money -= i;
    }
    //查看账户
    public int showMoney(){
        return money;
    }
}
