/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Dominik
 */
public class ShapeDrawer
{

    GraphicsContext gc;
    

    public void drawCircle(double x, double y, int size, Color color)
    {
        gc.setFill(color);
        gc.fillOval(x, y, size, size);
    }
    
    public void drawRect(double x, double y, int size, Color color)
    {
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
    }
    
    public void drawTriangle(double x, double y, int size, Color color)
    {
        gc.setFill(color);
        double[] xPoints = {x, x + size, x + size / 2};
        double[] yPoints = {y, y, y + size};
        gc.beginPath();
        gc.fillPolygon(xPoints, yPoints, 3);
    }

    public void setContext(GraphicsContext gc)
    {
        this.gc = gc;
    }
    
    public void clearCanvas()
    {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
}
