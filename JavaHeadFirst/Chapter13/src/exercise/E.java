/*
 * File: E.java
 * Project: exercise
 * File Created: Saturday, 5th March 2022 12:10:32 pm
 * Author: thanh tung (thanhtungpfiev@gmail.com)
 * -----
 */
package exercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class E {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
