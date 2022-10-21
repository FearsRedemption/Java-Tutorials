import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");
    ImageIcon loadIcon = new ImageIcon("file.png");
    ImageIcon saveIcon = new ImageIcon("floppy.png");
    ImageIcon exitIcon = new ImageIcon("door.png");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        loadItem.setForeground(Color.white);
        loadItem.setBackground(Color.black);
        saveItem.setForeground(Color.white);
        saveItem.setBackground(Color.black);
        exitItem.setForeground(Color.white);
        exitItem.setBackground(Color.black);

        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H for Help
        loadItem.setMnemonic(KeyEvent.VK_L); //L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); //S for Save
        exitItem.setMnemonic(KeyEvent.VK_X); //E for eXit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*Loading file noises*");
        }
        if (e.getSource() == saveItem) {
            System.out.println("*Saving file noises*");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
