/*
 * File: SimpleChatClientA.java
 * Project: chat_client
 * File Created: Wednesday, 9th March 2022 10:36:33 am
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package chat_client;

import java.awt.*;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClientA client = new SimpleChatClientA();
        client.go();
    }

    public void go() {
        // make gui and register a listener with the send button
        // call the setUpNetworking() method
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        setUpNetworking();

        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setUpNetworking() {
        // make a Socket, then make a PrintWriter
        // assign the PrintWriter to writer instance variable
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // get the text from the text filed and
            // send it to the server using a writer (a PrintWriter)
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    } // close SendButtonListener inner class
} // close outer class
