/*
 * File: Panel1.java
 * Project: flowlayout
 * File Created: Thursday, 3rd March 2022 3:27:47 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package flowlayout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 panel = new Panel1();
        panel.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("huh?");
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
