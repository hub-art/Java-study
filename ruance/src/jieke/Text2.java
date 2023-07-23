package jieke;
public class Text2 {
    public static void main(String[] args) {
        String name="abcdefhcy";
        String mima="12345";
        if (name.length()==8&&mima.length()>=6){
            System.out.println("注册成功");
        }else{
            if (name.length()!=8&mima.length()<6){
                System.out.println("用户名和密码都不符合要求");
            }else{
                if (name.length()!=8){
                    System.out.println("用户名不符合要求");
                }else{
                    System.out.println("密码不符合要求");
                }
            }
        }
    }
}

