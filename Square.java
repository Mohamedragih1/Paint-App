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
public class Square extends Modify{
    private int sideLength;

    public Square(Point position,int sideLength) {
        super.setPosition(position);
        this.sideLength = sideLength;
    }
    public String shapeName(){
        return "Square";
    }
    
    @Override
    public void draw(Graphics canvas) {
       canvas.setColor(super.getColor());
       canvas.drawRect(super.getPosition().x, super.getPosition().y, this.sideLength, this.sideLength);
       canvas.setColor(super.getFillColor());
       canvas.fillRect(super.getPosition().x, super.getPosition().y, this.sideLength, this.sideLength);
    }
    @Override
    public boolean contains(Point point){
        return (this.getPosition().x<point.x&&this.getPosition().y<point.y&&this.getPosition().x+this.sideLength>point.x&&this.getPosition().y+this.sideLength>point.y);
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
