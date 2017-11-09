/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

import bll.Coordinate;
import java.util.Random;

/**
 *
 * @author Dominik
 */
public class RandomPattern implements DrawPattern
{

    Random rand = new Random();

    /**
     * Returns random a coordinate. The number 486 and 488 represents the width
     * and height of the drawing canvas.
     *
     * @return Coordinate
     */
    @Override
    public Coordinate getCoordinates()
    {
        Coordinate coordinates = new Coordinate(rand.nextDouble() * 486, rand.nextDouble() * 488);
        return coordinates;
    }

}
