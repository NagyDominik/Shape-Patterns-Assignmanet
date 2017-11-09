/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javafx.scene.paint.Color;

/**
 *
 * @author Dominik
 */
public class Shape
{

    String Name;
    int size;
    Color color;

    public Shape(String Name, int size, Color color)
    {
        this.Name = Name;
        this.size = size;
        this.color = color;
    }

    public String getName()
    {
        return Name;
    }

    public int getSize()
    {
        return size;
    }

    public Color getColor()
    {
        return color;
    }

}
