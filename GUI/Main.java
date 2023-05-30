package GUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

import static java.awt.Color.CYAN;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // Create a frame
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit our of application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("narwhal.png"); //create an ImageIcon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(new Color(212,0,123));

    }
}
