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
public class lineSegment extends Modify{
    private Point p1,p2;

    public lineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public String shapeName(){
        return "Line";
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(super.getColor());
        canvas.drawLine(p1.x,p1.y,p2.x,p2.y);
    }
    public boolean contains(Point point){
        double slope = (this.p2.y-this.p1.y)/(this.p2.x-this.p1.x);
        return ((point.y-this.p1.y)==(slope*(point.x-this.p1.x)));     
    }

    @Override
    public void moveTo(Point point) {
    }
}
