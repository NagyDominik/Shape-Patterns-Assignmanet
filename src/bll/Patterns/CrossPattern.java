/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

import bll.Coordinate;
import java.util.ArrayList;

/**
 *
 * @author Dominik
 */
public class CrossPattern implements DrawPattern
{

    private Coordinate[][] coordinates = new Coordinate[11][11];
    private ArrayList<Coordinate> returnList = new ArrayList();
    private int coordCount = -1;

    public CrossPattern()
    {
       fillCoordinates();
       fillReturn();
    }
    
    /**
     * Returns the next available coordinate.
     * 
     * @return Coordinate
     */
    @Override
    public Coordinate getCoordinates()
    {
        coordCount++;
        if (coordCount < returnList.size())
        {
            return returnList.get(coordCount);
        }
        return new Coordinate(0,0);
    }
    
    /**
     * Fills the appropriate cells of the coordinates array with coordinates.
     * The coordinates start from (5, 5) and the number 44 represents
     * 1/11 of the width of the drawing canvas.
     */
    private void fillCoordinates()
    {
        for (int i = 0; i < 11; i++)
        {
            int j = 5;
            if (i == 5)
            {
                for (j = 0; j < 11; j++)
                {
                    coordinates[i][j] = new Coordinate(5 + (44 * i), 5 + (j * 44));
                }
            } else
            {
                coordinates[i][j] = new Coordinate(5 + (44 * i), 5 + (j * 44));
            }
        }
    }
    
    /**
     * Fills a list with the available coordinates.
     */
    private void fillReturn()
    {
        for (int i = 0; i < 11; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                if (coordinates[i][j] != null)
                {
                    returnList.add(coordinates[i][j]);
                }
            }
        }
    }
}