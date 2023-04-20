package bethecompiler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author tung.dao
 * @date 3/1/2022
 */
public class InnerButton {
    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        BListener bListener = new BListener();
        b.addActionListener(bListener);

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class BListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (b.getText().equals("A")) {
                b.setText("B");
            } else {
                b.setText("A");
            }
        }
    }
}
