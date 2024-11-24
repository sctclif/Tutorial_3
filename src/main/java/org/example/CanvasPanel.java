package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import static java.lang.Math.round;

public class CanvasPanel extends Canvas {
    ControlPanel cp;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    public CanvasPanel(ControlPanel cp) {
        this.cp = cp;
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Get click location
                int size  = cp.getValues()[3];
                int x = e.getX();
                int y = e.getY();
                createShape(new Point(x, y));
                repaint();



            }
        });
    }
    public void paint(Graphics g) {

        for (Shape s : shapes) {
            s.draw(g);
        }
    }
    public void drawAll(Graphics g) {
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
    public void createShape(Point p){
        int[] values = cp.getValues();
        int size = values[3];
        Color color = new Color(values[0],values[1],values[2]);

        if(cp.getShape() == "Circle"){
            System.out.println(p);
            p.x = p.x -(size/2);
            p.y = p.y -(size/2);
            System.out.println(p);
            shapes.add(new Circle(size, p, color));
        }
    }

}
