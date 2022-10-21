import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField tf;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250, 40));
        tf.setFont(new Font("Consolas", Font.PLAIN, 35));
        tf.setForeground(new Color(0x00ff00));
        tf.setBackground(Color.black);
        tf.setCaretColor(Color.white);
        tf.setText("Username");

        this.add(button);
        this.add(tf);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            tf.setEditable(false);
            button.setEnabled(false);
            System.out.println("welcome " + tf.getText());
        }
    }
}
