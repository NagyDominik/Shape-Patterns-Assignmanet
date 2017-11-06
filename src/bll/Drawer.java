/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import bll.Patterns.DrawPattern;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.canvas.GraphicsContext;

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
    GraphicsContext gc;

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

    public void clearQueue()
    {
        shapesInQueue.clear();
    }

    public void drawShapes()
    {
    }

    public void clearCanvas()
    {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
    
    public void setContext(GraphicsContext context)
    {
        this.gc = context;
    }
}
