import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("codeImage.jpeg");
        Border border = BorderFactory.createLineBorder(Color.blue, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, or RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, or BOTTOM of ImageIcon
        label.setForeground(Color.white); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set text font
        label.setIconTextGap(-5); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
        //label.setBounds(100, 100, 350, 350); //set x, y position within frame as well as dims

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}