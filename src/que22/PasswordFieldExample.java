/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que22;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        
        JPasswordField passwordField = new JPasswordField();
        JButton button = new JButton("Show Password");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the password as a char array
                char[] password = passwordField.getPassword();
                
                // Convert the char array to a String (for demonstration purposes only)
                String passwordString = new String(password);
                
                // Display the password (for demonstration purposes only)
                JOptionPane.showMessageDialog(frame, "Password: " + passwordString);
                
                // Clear the char array (for security purposes)
                java.util.Arrays.fill(password, ' ');
            }
        });
        
        frame.add(passwordField);
        frame.add(button);
        
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
