/*
 * File: A.java
 * Project: exercise
 * File Created: Saturday, 5th March 2022 12:08:33 pm
 * Author: thanh tung (thanhtungpfiev@gmail.com)
 * -----
 */
package exercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class A {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        panel.add(button);
        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
