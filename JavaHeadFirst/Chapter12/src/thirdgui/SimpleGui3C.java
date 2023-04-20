package thirdgui;

import secondgui.MyDrawPanel2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author tung.dao
 * @date 3/1/2022
 */
public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui3C = new SimpleGui3C();
        gui3C.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel2 drawPanel2 = new MyDrawPanel2();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel2);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
