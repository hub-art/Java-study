package come.itheima.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        //要说的话
        String talk = "玩的真好，下次不要玩了，CNM，MLGB，SB，TMD";

        //定义一个敏感词库
        String[] arr={"CNM","MLGB","SB","TMD"};
        //替换敏感词
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        //输出打印替换后的话
        System.out.println(talk);
    }
}
