package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JButton button;
    GridLayout layout = new GridLayout(1,2);
    public ButtonPanel(String text) {
        button = new JButton(text);

        setLayout(layout);

        add(button);
        button = new JButton(text);
        add(button);
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Button 1 pressed");
                    }
                }
        );
    }

}
