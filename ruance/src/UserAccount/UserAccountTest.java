package UserAccount;

import UserAccount.UserAccount;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountTest extends UserAccount {

    @Test
    public void testDepositeMoney() {
        //测试depositeMoney()方法
        //1-创建类对象   UserAccount
        UserAccount account = new UserAccount();
        //2-调用类中的方法 实现存钱操作
        account.depositeMoney(100);
        //3-测试 钱是否存储成功
        assertEquals(100,account.showMoney());//100==account.showMoney()
    }

    @Test
    public void testWithdrawMoney() {
        UserAccount account = new UserAccount();
        account.depositeMoney(100);
        account.withdrawMoney(50);
        assertEquals(50,account.showMoney());
    }

    @Test
    public void testShowMoney() {
    }
}