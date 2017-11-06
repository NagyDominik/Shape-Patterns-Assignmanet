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
public class Shape
{
    String Name;
    int size;

    public Shape(String Name, int size)
    {
        this.Name = Name;
        this.size = size;
    }

    public String getName()
    {
        return Name;
    }

    public int getSize()
    {
        return size;
    }
    
}
