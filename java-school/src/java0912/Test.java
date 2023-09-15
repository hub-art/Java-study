package java0912;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {

        //创建集合存储歌曲
        ArrayList<String> list = new ArrayList<>();

        //添加初始歌曲
        list.add("稻香");
        list.add("夜曲");
        list.add("夜的第七章");
        list.add("听妈妈的话");
        list.add("龙卷风");

        //循环打印主页面
        while (true){
            //歌单
            String playlist = playlistFlushed(list);

            System.out.println("---------------欢迎来到点歌系统---------------" +
                    "\n0.添加歌曲至列表" +
                    "\n1.将歌曲置顶" +
                    "\n2.将歌曲前移一位" +
                    "\n3.退出" +
                    "\n歌曲列表:" + playlist
            );
            System.out.println("请输入要执行的操作序号(0-3):");

            //根据输入的序号执行对应的操作
            switch (input()){
                case 0 -> add(list);
                case 1 -> top(list);
                case 2 -> forward(list);
                case 3 -> quit();
                default -> System.out.println("没有这个选项！");
            }

        }
    }
    //刷新歌单
    public static String playlistFlushed(ArrayList<String> list){

        //创建字符串用来打印歌曲
        StringJoiner sj = new StringJoiner(",","[","]");
        //获取迭代器
        Iterator it = list.iterator();
        //遍历集合，并将集合中的歌曲存储到字符串
        while (it.hasNext()){
            sj.add((String) it.next());
        }
        //返回歌单
        return sj.toString();
    }

    //歌曲置顶
    public static void setBefore(ArrayList<String> list,int index){
        String song = list.get(index);
        for (int i = list.size(); i > 0; i--) {
            if(i > index){
                continue;
            }
            list.set(i,list.get(i - 1));
        }
        list.set(0,song);
    }

    //输入序号判断
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int input = 4;
        try {
            input = sc.nextInt();
        }catch (Exception e){
            System.out.println("您输入的序号不合法，请重新输入：");
            input();
        }finally {
            return input;
        }
    }

    //歌单歌曲查找
    public static int songFind(ArrayList<String> list,String song){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(song)){
                return i;
            }
        }
        return -1;
    }

    //0.添加歌曲
    public static void add(ArrayList<String> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的歌曲名称:");
        String song = sc.next();
        if(songFind(list,song) >= 0){
            System.out.println("添加失败，歌曲已存在");
            return;
        }
        list.add(song);
        System.out.println("已添加歌曲:" + song);
    }

    //1.置顶歌曲
    public static void top(ArrayList<String> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要置顶的歌曲名称:");
        String song = sc.next();
        int index = songFind(list,song);
        if(index >= 0){
            setBefore(list,index);
            System.out.println("已将歌曲" + song + "置顶");
            return;
        }
        System.out.println("置顶失败，歌曲不存在");
    }

    //2.前移歌曲
    public static void forward(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要前移的歌曲名称:");
        String song = sc.next();
        int index = songFind(list, song);
        if (index == 0) {
            System.out.println("该歌曲已经是第一位了");
        } else if (index > 0) {
            list.set(index,list.get(index - 1));
            list.set(index - 1,song);
            System.out.println("已将歌曲" + song + "置前");
        }else {
            System.out.println("前移失败，歌曲不存在");
        }
    }

    //3.退出
    public static void quit(){
        System.out.println("您已退出系统");
        //退出
        System.exit(0);
    }
}
