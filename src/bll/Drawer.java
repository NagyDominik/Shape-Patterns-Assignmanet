/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import bll.Patterns.DrawPattern;
import java.util.ArrayList;

/**
 *
 * @author Dominik
 */
public class Drawer
{
    private DrawPattern pattern;
    private ArrayList<Shape> shapesInQueue = new ArrayList();
    private ArrayList<String> shapes = new ArrayList();
    private ArrayList<String> patterns = new ArrayList();

    public void setPattern(DrawPattern pattern)
    {
        this.pattern = pattern;
    }
    
    public Drawer()
    {
    }
}
