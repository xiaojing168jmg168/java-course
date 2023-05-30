package GuiLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //jLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("narwhal.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("Mv Boli", Font.PLAIN,20));
        label.setIconTextGap(-25);//set gap of text to image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of incon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);//set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);

        frame.setVisible(true);
        frame.add(label);
        frame.pack();//make sure add all your components and the pack
    }

}
