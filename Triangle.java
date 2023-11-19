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
public class Triangle extends Modify {

    Point point2;
    Point point3;
    
    public Triangle(Point point1 , Point point2 , Point point3)
    {
        super.setPosition(point1);
        this.point2 = point2;
        this.point3 = point3;
    }
    
     public String shapeName(){
        return "triangle";
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(super.getColor());
        canvas.drawPolygon(new int[] {super.getPosition().x,point2.x,point3.x}, new int[] {super.getPosition().y,point2.y,point3.y}, 3);
        canvas.setColor(super.getFillColor());
        canvas.fillPolygon(new int[] {super.getPosition().x,point2.x,point3.x}, new int[] {super.getPosition().y,point2.y,point3.y}, 3);
    }

 

    @Override
    public boolean contains(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
