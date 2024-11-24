package org.example;

import java.awt.*;

public class Shape{
    protected final Point position;
    protected final Color color;

    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }
    public void draw(Graphics canvas) {

    }
}
