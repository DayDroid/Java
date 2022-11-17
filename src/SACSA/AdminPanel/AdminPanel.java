package SACSA.AdminPanel;

import javax.swing.JOptionPane;

public class AdminPanel {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Name"); //creates a dialogue asking your username | functionally does nothing yet though.
        JOptionPane.showMessageDialog(null, "dick"); //creates a new dialogue box saying dick. Can be used in concatenation with the String name that is created

        // int password = JOptionPane.showInputDialog("Enter Password");
        // doesnt work. you must convert to integer by using the int wrapper class to parse it as an int.
        int password = Integer.parseInt(JOptionPane.showInputDialog("Enter Password"));
        JOptionPane.showMessageDialog(null, "Password is: " + password);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        JOptionPane.showMessageDialog(null, "Height is: " + height);

    }
}