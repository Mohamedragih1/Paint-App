/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Mohamed
 */
public class Circle extends Modify{
    private int radius;

    public Circle(Point position,int radius) {
        super.setPosition(position);
        this.radius = radius;
    }
    public String shapeName(){
        return "Circle";
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(super.getColor());
       canvas.drawOval(super.getPosition().x, super.getPosition().y, (this.radius)*2, (this.radius)*2);
       canvas.setColor(super.getFillColor());
       canvas.fillOval(super.getPosition().x, super.getPosition().y, (this.radius)*2, (this.radius)*2);
    }
    @Override
    public boolean contains(Point point){
        double range = Math.sqrt(Math.pow(point.x - (super.getPosition().x+this.radius), 2)+Math.pow(point.y - (super.getPosition().y+this.radius), 2));
        return (range <= (this.radius));
    }

    @Override
    public void moveTo(Point point) {
        //this.draw(canvas);
    }
}
