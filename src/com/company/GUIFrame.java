package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIFrame extends JFrame {
    private JLabel label = new JLabel("Input");
    private JTable table1 = new JTable();
    private JTable table2 = new JTable();
    private JButton button1 = new JButton() ;

    public GUIFrame(){
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     Container container = this.getContentPane();
     container.setLayout(new GridLayout(3, 2, 2, 2));;
     container.add(label);
     container.add(table1);
     container.add(table2);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        container.add(button1);
        button1.setSelected(true);

        }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += (button1.isSelected() ? "Radio #1" : "Radio#2") + "is selectad\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
