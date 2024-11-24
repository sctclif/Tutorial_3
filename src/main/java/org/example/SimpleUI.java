package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

// Contains this computer’s graphics configuration
public class SimpleUI {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(500,300);
        GridLayout layout = new GridLayout(1,2);
        frame.setLayout(layout);
        ControlPanel cp = new ControlPanel();

        frame.getContentPane().add(new CanvasPanel(cp));
        frame.getContentPane().add(cp);


        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

}

