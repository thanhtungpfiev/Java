package secondgui;

import javax.swing.*;
import java.awt.*;

/**
 * @author tung.dao
 * @date 3/1/2022
 */
public class SimpleGui2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        MyDrawPanel2 myDrawPanel2 = new MyDrawPanel2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(myDrawPanel2);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
