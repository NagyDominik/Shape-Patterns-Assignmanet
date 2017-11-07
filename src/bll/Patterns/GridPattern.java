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

    private double getX() {
       
        double[][] myX = new double[10][10];
        
        for(int l = 0; l<myX.length;l++)
        {
        for(int i =0; i<myX.length;i++)  
        {
            myX[i][l] = 5+48*i;
           
        }
        }
              return 1;
    }
    private double getY() {
       
        double[][] myY = new double[10][10];
        
        for(int l = 0; l<myY.length;l++)
        {
        for(int i =0; i<myY.length;i++)  
        {
            myY[i][l] = 5+48*l;
            
            
        }
        }
        
        return 1;
    }

    @Override
    public Coordinates getCoordinates()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getNextX()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getNextY()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
