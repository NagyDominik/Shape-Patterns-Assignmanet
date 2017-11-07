/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll.Patterns;

import bll.Coordinates;

/**
 *
 * @author Dominik
 */
public class GridPattern implements DrawPattern
{
    double rX;
    double rY;
    
    public double giveX()
    {
        double[][] myX = new double[10][10];
        
        for(int l = 0; l<myX.length;l++)
        {
        for(int i =0; i<myX.length;i++)  
        {
            myX[i][l] = 5+48*i;
            rX=myX[i][l];
            
        }
        }
        return rX;
    }
    public double giveY()
    {
        double[][] myY = new double[10][10];
        
        for(int l = 0; l<myY.length;l++)
        {
        for(int i =0; i<myY.length;i++)  
        {
            myY[i][l] = 5+48*l;
             rY=myY[i][l];
            
        }
        }
        return rY;
    }
   

    

    @Override
    public Coordinates getCoordinates()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getNextX()
    {
     return giveX();
    }

    @Override
    public double getNextY()
    {
      return giveY();
    }

    
}
