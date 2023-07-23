package Message;

import UserAccount.UserAccount;
import org.junit.*;

import static org.junit.Assert.*;


public class MessageUtilTest{
    MessageUtil message = new MessageUtil("你好！中国");
    @BeforeClass
    public static void setUpBefore() throws Exception{
        System.out.println("------@BeforeClass------");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("------@AfterClass------");
    }
    @Before     //该方法必须在类中的每一个测试方法之前执行----该类中的所有测试方法，执行时都会执行该方法
    public void setUp() throws Exception {
        System.out.println("------@Before----setUp()----");
    }

    @After      //该方法必须在每个测试方法运行之后执行
    public void tearDown() throws Exception {
        System.out.println("------@After----terDown()----");

    }

    @Test
    public void printMessage() {

    }

    @Ignore     //忽略注解，被注解的方法不执行
    @Test
    public void testPrintMessage() {
        System.out.println("----------testPrintMessage----------");
        //fail("Not yet implemented"); 让测试失败，给出指定信息
        //测试：大于信息方法
        String m = message.printMessage();//实际结果
        //判定实际结果与预期结果是否相同 alt + / assertEquals(预期结果，实际结果);
        assertEquals("你好！中国",m);
    }
    @Test
    public void testDepositeMoney(){
        System.out.println("----------testDepositeMoney----------");
        //存100进去
        message.depositeMoney(100);
        assertEquals(100,message.showMoney());
    }
}