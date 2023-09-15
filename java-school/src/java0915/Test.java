package java0915;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // 创建带泛型ArrayList集合alist1，里面存入五个字符串
        ArrayList<String> alist1 = new ArrayList<String>();
        alist1.add("hello");
        alist1.add("world");
        alist1.add("java");
        alist1.add("python");
        alist1.add("javascript");

        // 通过普通循环输出集合中的元素内容
        for (int i = 0; i < alist1.size(); i++) {
            System.out.print(alist1.get(i) + " ");
        }
        System.out.println();

        // 删除下标为2的元素
        alist1.remove(2);

        // 通过foreach 循环输出集合
        for (String str : alist1) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 创建集合alist2，里面存入三个字符串，把集合alist2加入alist1
        ArrayList<String> alist2 = new ArrayList<String>();
        alist2.add("apple");
        alist2.add("banana");
        alist2.add("orange");
        alist1.addAll(alist2);

        // 通过迭代器输出集合内容
        Iterator<String> it = alist1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 把集合清空，再输出集合
        alist1.clear();
        System.out.println(alist1);
    }
}