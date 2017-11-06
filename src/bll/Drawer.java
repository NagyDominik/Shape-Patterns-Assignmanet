/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import bll.Patterns.DrawPattern;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dominik
 */
public class Drawer
{
    private DrawPattern pattern;
    private ArrayList<Shape> shapesInQueue = new ArrayList();
    private ArrayList<String> shapes = new ArrayList();
    private ArrayList<String> patterns = new ArrayList();

    public Drawer()
    {
        shapes.addAll(Arrays.asList("Triangle", "Circle", "Rectangle"));
        patterns.addAll(Arrays.asList("Grid", "Cross", "Random"));
    }
    
    public ArrayList<String> getShapesInQueue()
    {
        ArrayList<String> shapesAsString = new ArrayList();
        for (Shape shape : shapesInQueue)
        {
            shapesAsString.add(shape.getName() + " " + shape.getSize());
        }
        return shapesAsString;
    }

    public ArrayList<String> getShapes()
    {
        return shapes;
    }

    public ArrayList<String> getPatterns()
    {
        return patterns;
    }
    
    public void setPattern(DrawPattern pattern)
    {
        this.pattern = pattern;
    }
    
    public void addShapeToQueue(String shape, int size)
    {
        shapesInQueue.add(new Shape(shape, size));
    }
    
    public void ClearQueue()
    {
        shapesInQueue.clear();
    }
}
