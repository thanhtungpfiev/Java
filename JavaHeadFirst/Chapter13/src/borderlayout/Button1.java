/*
 * File: Button1.java
 * Project: borderlayout
 * File Created: Thursday, 3rd March 2022 3:10:49 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package borderlayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;

public class Button1 {
    public static void main(String[] args) {
        Button1 button1 = new Button1();
        button1.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
