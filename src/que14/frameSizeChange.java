/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que14;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.JFrame;
public class frameSizeChange {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Use setBounds to set the position (x, y) and size (width, height) of the frame
        frame.setBounds(100, 100, 400, 300);
        
        frame.setVisible(true);
    }
}

