/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

/**
 *
 * @author Dominik
 */
public class CrossPattern implements DrawPattern
{   
    @Override
    public double getNextX()
    {
        return -1;
    }

    @Override
    public double getNextY()
    {
     return -1;
    }
    
}
