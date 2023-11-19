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
public class Rectangle extends Modify{
    private int width,height;
    public Rectangle(Point position,int width,int height) {
        super.setPosition(position);
        this.height = height;
        this.width = width;
    }
    public String shapeName(){
        return "Rect";
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(super.getColor());
        canvas.drawRect(super.getPosition().x, super.getPosition().y, this.width, this.height);
        canvas.setColor(super.getFillColor());
        canvas.fillRect(super.getPosition().x, super.getPosition().y, this.width, this.height);
    }
    @Override
    public boolean contains(Point point){
        return (this.getPosition().x<point.x&&this.getPosition().y<point.y&&this.getPosition().x+this.width>point.x&&this.getPosition().y+this.height>point.y);
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
