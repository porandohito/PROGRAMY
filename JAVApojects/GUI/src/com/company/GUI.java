package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
        private int count =0;
        private JFrame frame;
        private JPanel panel;
        private JButton button;
        private JLabel label;
    public GUI(){

        frame = new JFrame();

        panel = new JPanel();

        button = new JButton("Kliknij mnie");
        button.addActionListener(this);

        label = new JLabel("Liczba kliknięć: 0");

        panel.add(button);
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mój GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	    new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Liczba kliknięć: "+ count);
    }
}
