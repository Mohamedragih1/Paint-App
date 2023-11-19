/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import Shapes.*;
import java.awt.event.AWTEventListener.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Mohamed
 */
public class MyPanel extends JPanel implements DrawingEngine{
    private ArrayList<Shape> shapes;

    public MyPanel() {
        this.shapes = new ArrayList();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Shape s:shapes)
            s.draw(g);
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(Shape[]::new);
    }

    @Override
    public void refresh(Graphics canvas) {
        repaint();
    }
}
