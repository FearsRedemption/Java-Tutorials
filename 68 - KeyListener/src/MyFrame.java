import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    ImageIcon icon;
    Image image;
    Image newImg;
    JLabel label;
    int speed = 10;
    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("img.png");
        image = icon.getImage();
        newImg = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);

        label = new JLabel();
        label.setBounds(0,0,100, 100);
        label.setIcon(icon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses a KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - speed, label.getY());
            case 'd' -> label.setLocation(label.getX() + speed, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - speed);
            case 's' -> label.setLocation(label.getX(), label.getY() + speed);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - speed, label.getY());
            case 39 -> label.setLocation(label.getX() + speed, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - speed);
            case 40 -> label.setLocation(label.getX(), label.getY() + speed);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called when a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
