/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Mohamed
 */
public abstract class Modify implements Shape{
    private Point point ;
    private Color color;
    private Color fillColor;
    private Point draggingPoint;
    

 
    

    @Override
    public void setPosition(Point position) {
        this.point = position;
    }

    @Override
    public Point getPosition() {
        return point;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    public abstract void draw(Graphics canvas);
    public abstract String shapeName();

    @Override
    public void setDraggingPoint(Point point) {
        draggingPoint = point;
    }

    @Override
    public Point getDraggingPoint() {
        return draggingPoint;
    }

    @Override
    public abstract boolean contains(Point point);

    @Override
    public abstract void moveTo(Point point);
}
