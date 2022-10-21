import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Plain Message", "Plain Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Information Message", "Info Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Question Message?", "Question Title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Your computer has a virus", "Virus Title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "SOMETHING WENT HORRIBLY WRONG", "ERROR", JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION );

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);

//        String[] responses = {"No, you're awesome", "Thank you", "*blushes* UwU"};
//        ImageIcon icon = new ImageIcon("img.png");
//        JOptionPane.showOptionDialog(null,
//                "You are awesome!",
//                "Secret Message",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                icon,
//                responses,
//                0);

        int answer = JOptionPane.showConfirmDialog(null, "Do you have permission to click this button?", "Secret", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            JOptionPane.showMessageDialog(null, "No you don't, retard", "Secret", JOptionPane.WARNING_MESSAGE);
        }
    }
}