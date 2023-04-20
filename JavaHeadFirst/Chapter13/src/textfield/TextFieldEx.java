/*
 * File: TextFieldEx.java
 * Project: textfield
 * File Created: Thursday, 3rd March 2022 4:19:27 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package textfield;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEx implements ActionListener {
    JTextField t;
    public static void main(String[] args) {
        TextFieldEx t = new TextFieldEx();
        t.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JLabel label = new JLabel("Dog's first name: ");
        t = new JTextField(20);
        t.addActionListener(this);
        panel.add(label);
        panel.add(t);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(t.getText());
    }
}
