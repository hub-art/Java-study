package come.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //要说的话
        String talk = "玩的真好，下次不要玩了，CNM，MLGB，SB，TMD";
        //替换敏感词
        talk = talk.replace("TMD","***");
        //输出打印替换后的话
        System.out.println(talk);
    }
}
