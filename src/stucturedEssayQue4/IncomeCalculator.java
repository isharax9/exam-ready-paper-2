/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucturedEssayQue4;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncomeCalculator {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Income Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create table model and table
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("Month");
        model.addColumn("Income");

        // Add sample data
        model.addRow(new Object[]{"C1", "January", 1050});
        model.addRow(new Object[]{"C2", "February", 2000});
        model.addRow(new Object[]{"C3", "March", 300});
        model.addRow(new Object[]{"C4", "April", 700});

        // Create button and label
        JButton button = new JButton("Get Total");
        JLabel totalLabel = new JLabel("Total : 0");

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowCount = model.getRowCount();
                int total = 0;
                for (int i = 0; i < rowCount; i++) {
                    total += (int) model.getValueAt(i, 2);
                }
                totalLabel.setText("Total : " + total);
            }
        });

        // Layout components
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(table));
        panel.add(button);
        panel.add(totalLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

