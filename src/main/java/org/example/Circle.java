package org.example;
import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius, Point center, Color color){
        super(center, color);
        this.radius = radius;
    }
    public void draw(Graphics canvas){
        canvas.setColor(color);
        canvas.fillOval(position.x, position.y, radius, radius);
    }

}
