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
public class GridPattern implements DrawPattern
{
    Coordinates[][] coordinates = new Coordinates[11][11];
    private ArrayList<Coordinates> returnList = new ArrayList();
    private int coordCount = -1;
    
    public GridPattern()
    {
        fillXY();
       fillReturn();
    }
    public void fillXY()
    {
           for(int l = 0; l<10;l++)
        {
        for(int i =0; i<10;i++)  
        {
            coordinates[i][l] = new Coordinates(5+48*l,5+48*i);     
        }
  }                  
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

    @Override
    public double getNextX()
    {
        double[][] myX = new double[10][10];
     return 1;
    }

    @Override
    public double getNextY()
    {
        double[][] myY = new double[10][10];
      return -1;
    }
private void fillReturn()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (coordinates[i][j] != null)
                {
                    returnList.add(coordinates[i][j]);
                }
            }
        }
    }
    
}
