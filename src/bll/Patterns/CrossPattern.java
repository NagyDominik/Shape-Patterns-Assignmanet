/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

import bll.Coordinates;
import java.util.ArrayList;

/**
 *
 * @author Dominik
 */
public class CrossPattern implements DrawPattern
{

    private Coordinates[][] coordinates = new Coordinates[11][11];
    private ArrayList<Coordinates> returnList = new ArrayList();
    private int coordCount = -1;

    public CrossPattern()
    {
        fillCoordinates();
        fillReturn();
    }

    @Override
    public double getNextX()
    {
      double[][] crossX = new double[11][11];
      return -1;
    }

    @Override
    public double getNextY()
    {
        double[][] crossY = new double[10][10];
        return 1;
    }

    @Override
    public Coordinates getCoordinates()
    {
        coordCount++;
        if (coordCount < returnList.size())
        {
            return returnList.get(coordCount);
        }
        return new Coordinates(0,0);
    }

    private void fillCoordinates()
    {
        for (int i = 0; i < 11; i++)
        {
            int j = 5;
            if (i == 5)
            {
                for (j = 0; j < 11; j++)
                {
                    coordinates[i][j] = new Coordinates(5 + (46 * i), 5 + (j * 44));
                }
            } else
            {
                coordinates[i][j] = new Coordinates(5 + (46 * i), 5 + (j * 44));
            }
        }
    }

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
