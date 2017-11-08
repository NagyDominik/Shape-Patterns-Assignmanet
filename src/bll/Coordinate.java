/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

/**
 *
 * @author Dominik
 */
public class Coordinate
{

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
    double x;
    double y;

    public Coordinate(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
}
