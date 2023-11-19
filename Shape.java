/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Shapes;

import java.awt.*;

/**
 *
 * @author Mohamed
 */
public interface Shape extends Moveable{
    public void setPosition(Point position);

    public Point getPosition();

    public void setColor(Color color);

    public Color getColor();

    public void setFillColor(Color color);

    public Color getFillColor();

    public void draw(Graphics canvas);
    
    public String shapeName();
}
