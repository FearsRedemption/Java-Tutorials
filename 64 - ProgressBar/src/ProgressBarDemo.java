import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar pBar = new JProgressBar(0, 500);

    ProgressBarDemo() throws InterruptedException {
        pBar.setValue(500);
        pBar.setBounds(0, 0, 500, 50);
        pBar.setStringPainted(true);
        pBar.setFont(new Font("MV Boli", Font.BOLD, 25));
        pBar.setForeground(Color.red);
        pBar.setBackground(Color.black);
        pBar.setString("500/500 HP");

        frame.add(pBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        Thread.sleep(5000);
        fill();
    }

    public void fill() {
        int counter = 500;
        pBar.setForeground(new Color((int)28.6, (int)72.5, (int)37.6));
        while (counter > 0) {
            String out = String.valueOf(counter);
            pBar.setString(out + "/500 HP");
            pBar.setValue(counter);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int damage = (int) (Math.random() * 25) + 1;
            counter-= damage;
        }

        pBar.setValue(0);
        pBar.setString("You died :(");
    }
}
