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
public class GridPattern implements DrawPattern
{

    Coordinate[][] coordinates = new Coordinate[11][11];
    private ArrayList<Coordinate> returnList = new ArrayList();
    private int coordCount = -1;

    public GridPattern()
    {
        fillXY();
        fillReturn();
    }

    /**
     * Fills the cells of the coordinates array with coordinates. The
     * coordinates start from (5, 5) and the number 44 represents 1/11 of the
     * width and height of the drawing canvas.
     */
    public void fillXY()
    {
        for (int l = 0; l < 11; l++)
        {
            for (int i = 0; i < 11; i++)
            {
                coordinates[i][l] = new Coordinate(5 + 44 * l, 5 + 44 * i);
            }
        }
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
        return new Coordinate(0, 0);
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
