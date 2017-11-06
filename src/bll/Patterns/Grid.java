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
public class Grid implements DrawPattern
{
    public Grid() {
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
        return -1;
    }

    @Override
    public double getNextY()
    {
     return -1;
    }
    
}
