/*
 * File: BoxLayout.java
 * Project: boxlayout
 * File Created: Thursday, 3rd March 2022 4:04:40 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package boxlayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class BoxLayoutEx {
    public static void main(String[] args) {
        BoxLayoutEx layout = new BoxLayoutEx();
        layout.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
