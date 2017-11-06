/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bll.Patterns;

import java.util.Random;




/**
 *
 * @author Dominik
 */
public class RandomPattern implements DrawPattern
{
    Random rand = new Random();
    @Override
    public double getNextX()
    {
      return rand.nextDouble()*486;
    }

    @Override
    public double getNextY()
    {
        return rand.nextDouble()*488;
    }
    
}
