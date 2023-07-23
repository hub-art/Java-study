package come.heima.test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role();
        Role r2 = new Role();
        r1.Role("小明",100,'男');
        r2.Role("小王",100,'女');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true){
            //r1开始攻击r2
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "k.o了" + r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "k.o了" + r1.getName());
                break;
            }
        }

    }
}
