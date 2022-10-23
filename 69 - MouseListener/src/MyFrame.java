import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon grin;
    ImageIcon smile;
    ImageIcon smirk;
    ImageIcon updown;
    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        grin = new ImageIcon("grin.png");
        smile = new ImageIcon("smile.png");
        smirk = new ImageIcon("smirk.png");
        updown = new ImageIcon("upsidedown.png");

        label.setIcon(grin);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        this.addMouseListener(this);

//        this.add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked your mouse button");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed your mouse button");
        label.setIcon(updown);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("You released your mouse button");
        label.setIcon(smirk);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        System.out.println("Your mouse entered the label");
        label.setIcon(smile);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        System.out.println("Your mouse exited the label");
        label.setIcon(grin);
    }
}
