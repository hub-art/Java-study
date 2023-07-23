package come.heima.test0516;

public class NewPhone extends Phone {
    @Override
    public void call() {
        super.call();
        System.out.println("开启语言");
        System.out.println("关闭语言");
    }
}

