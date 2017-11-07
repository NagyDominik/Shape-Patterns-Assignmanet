/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import bll.Patterns.CrossPattern;
import bll.Patterns.DrawPattern;
import bll.Patterns.GridPattern;
import bll.Patterns.RandomPattern;
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
        for (Shape shape : shapesInQueue)
        {
            double x = pattern.getNextX();
            double y = pattern.getNextY();
            
            if (shape.getName() == "Triangle")
            {
                double[] xPoints = {x,x+shape.getSize(),x+shape.getSize()/2};
                double[] yPoints = {y,y,y+shape.getSize()};
                
                gc.beginPath();
                gc.fillPolygon(xPoints, yPoints, 3);
            }
            if (shape.getName() == "Circle")
            {
                gc.fillOval(x, y, shape.getSize(), shape.getSize());
            }
            if (shape.getName() == "Rectangle")
            {
                gc.fillRect(x, y, shape.getSize(), shape.getSize());
            }
        }
    }

    public void clearCanvas()
    {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

    public void setContext(GraphicsContext context)
    {
        this.gc = context;
    }
    
    public void setPattern(String pattern)
    {
        if (pattern == "Random")
        {
            this.pattern = new RandomPattern();
        }
        if (pattern == "Grid")
        {
            this.pattern = new GridPattern();
        }
        if (pattern == "Cross")
        {
            this.pattern = new CrossPattern();
        }
    }
}
