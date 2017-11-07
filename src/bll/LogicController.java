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
import javafx.scene.paint.Color;

/**
 *
 * @author Dominik
 */
public class LogicController
{
    private DrawPattern pattern;
    private ArrayList<String> shapes = new ArrayList();
    private ArrayList<String> patterns = new ArrayList();
    private ShapeDrawer shapedrawer = new ShapeDrawer();
    private ArrayList<Shape> shapesInQueue = new ArrayList();

    public LogicController()
    {
        shapes.addAll(Arrays.asList("Triangle", "Circle", "Rectangle"));
        patterns.addAll(Arrays.asList("Grid", "Cross", "Random"));
    }

    public void draw()
    {
        for (Shape shape : shapesInQueue)
        {
            double x = pattern.getNextX();
            double y = pattern.getNextY();

            if (shape.getName() == "Triangle")
            {
                shapedrawer.drawTriangle(x, y, shape.getSize(),shape.getColor());
            }
            if (shape.getName() == "Circle")
            {
                shapedrawer.drawCircle(x, y, shape.getSize(), shape.getColor());
            }
            if (shape.getName() == "Rectangle")
            {
                shapedrawer.drawRect(x, y, shape.getSize(), shape.getColor());
            }
        }
    }

    public ArrayList<String> getShapesInQueue()
    {
        ArrayList<String> shapesAsString = new ArrayList();
        for (Shape shape : shapesInQueue)
        {
            shapesAsString.add(shape.getName() + " " + shape.getSize() + " " + shape.getColor());
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

    public void addShapeToQueue(String shape, int size, Color color)
    {
        this.shapesInQueue.add(new Shape(shape, size, color));
    }

    public void clearQueue()
    {
        shapesInQueue.clear();
    }

    public void clearCanvas()
    {
        shapedrawer.clearCanvas();
    }

    public void setContext(GraphicsContext context)
    {
        shapedrawer.setContext(context);
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
