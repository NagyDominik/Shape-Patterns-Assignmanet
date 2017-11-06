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
public class GridPattern implements DrawPattern
{

    public GridPattern() {
       
        int[][] myX = new int[10][10];
        myX[0][0]= 5;
        for(int i =1; i<myX.length;i++)  
        {
            myX[0][i] = myX[0][0]+48;
            
        }
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
