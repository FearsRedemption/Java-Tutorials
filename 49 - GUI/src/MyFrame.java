import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("JFrame Title Goes Here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents this from being resized
        this.setSize(420, 420); //sets the x and y dims of this
        this.setVisible(true); //makes this visible

        ImageIcon image = new ImageIcon("logo.png"); //create an IconImage
        ImageIcon background = new ImageIcon("cow.jpeg");
        this.setIconImage(image.getImage()); //change icon of this (top left icon and taskbar icon)
        /*
            Color by name = Color.green
            Color by RGB = new Color(123, 50, 250)
            Color by Hex = new Color(0x000000)
        */
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
