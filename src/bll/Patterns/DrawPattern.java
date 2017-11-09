/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

import bll.Coordinate;

/**
 *
 * @author Dominik
 */
public interface DrawPattern
{

    /**
     * Returns the X and Y coordinates of the next point (as a Coordinate class)
     * where we can place the next shape*
     */
    public Coordinate getCoordinates();

}
