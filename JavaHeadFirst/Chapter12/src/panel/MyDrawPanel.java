package panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Admin
 * @date 2/28/2022
 */
public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        g.setColor(Color.orange);
//        g.fillRect(20, 50, 100, 100);

//        Image image = new ImageIcon("catzilla.jpg").getImage();
//        g.drawImage(image, 3, 4, this);

//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//        int red = (int) (Math.random() * 256);
//        int green = (int) (Math.random() * 256);
//        int blue = (int) (Math.random() * 256);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);

        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

    public static void main(String[] args) {
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        JFrame frame = new JFrame();
        frame.getContentPane().add(myDrawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
