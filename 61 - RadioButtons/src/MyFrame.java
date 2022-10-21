import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton tacos;

    ImageIcon pizzaIcon = new ImageIcon("pizza.png");
    ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
    ImageIcon tacoIcon = new ImageIcon("taco.png");

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new JRadioButton("Pizza");
        hamburger = new JRadioButton("Hamburger");
        tacos = new JRadioButton("Tacos");

        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(hamburger);
        group.add(tacos);

        pizza.addActionListener(this);
        hamburger.addActionListener(this);
        tacos.addActionListener(this);

        pizza.setIcon(pizzaIcon);
        hamburger.setIcon(hamburgerIcon);
        tacos.setIcon(tacoIcon);

        this.add(pizza);
        this.add(hamburger);
        this.add(tacos);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizza) {
            System.out.println("You ordered Pizza.");
        } else if (e.getSource() == hamburger) {
            System.out.println("You ordered a Hamburger.");
        } else if (e.getSource() == tacos){
            System.out.println("You ordered some Tacos.");
        }
    }
}
