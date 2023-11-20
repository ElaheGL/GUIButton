package com.example.giubutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GIUbutton extends JFrame implements ActionListener {
    JButton Yellow = new JButton("YELLOW");
    JButton Green = new JButton("GREEN");
    JButton Red = new JButton("RED");
    JPanel Buttons = new JPanel(new FlowLayout());

    public GIUbutton() {
        this.setTitle("Form");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.Yellow.addActionListener(this);
        this.Green.addActionListener(this);
        this.Red.addActionListener(this);
        this.Yellow.setBackground(Color.yellow);
        this.Red.setBackground(Color.RED);
        this.Green.setBackground(Color.GREEN);

        Buttons.add(Green);
        Buttons.add(Yellow);
        Buttons.add(Red);
        this.add(Buttons);

    }

    public static void main(String[] args) {
        GIUbutton form = new GIUbutton();
        form.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Yellow) {
            JOptionPane.showMessageDialog(null, "its Yellow");

        }
        else if(e.getSource() == Green){
            JOptionPane.showMessageDialog(null, "its Green");

        }
    }
}