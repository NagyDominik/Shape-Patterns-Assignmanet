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
public interface DrawPattern
{    
    /**Returns the X coordinate of the next point where we can place a shape**/
    public double getNextX();
    
    /**Returns the Y coordinate of the next point where we can place a shape**/
    public double getNextY();
    
}
