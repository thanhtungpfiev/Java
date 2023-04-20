package gettingevents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Admin
 * @date 2/28/2022
 */
public class SimpleGui1B implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
