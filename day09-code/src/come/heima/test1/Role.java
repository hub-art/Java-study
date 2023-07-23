package come.heima.test1;

import java.util.Random;

public class Role {
    /*
    格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
     */

    private String name;
    private int blood;

    public Role(){

    }
    public void Role(String name,int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }

    //定义一个方法去攻击别人
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);
    //方法调用者攻击参数

    public void attack(Role role){

        //随机1 - 20 伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        System.out.println(this.getName() +"打了" + role.getName() + "一拳，造成了" + hurt + "点伤害，"
                + role.getName() + "还剩下"+ remainBlood +"滴血");
    }
}
