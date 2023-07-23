package come.heima.test0606;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowTest extends JFrame {
    public WindowTest(){
        this.addWindowListener(new A());
        this.setSize(300,300);
        this.setVisible(true);
    }
    class A extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new WindowTest();
    }
}