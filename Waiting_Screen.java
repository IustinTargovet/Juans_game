import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Waiting_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waiting_Screen extends World
{

    /**
     * Constructor for objects of class Waiting_Screen.
     * 
     */
    public Waiting_Screen(int world)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        Greenfoot.delay(200);
        switch(world)
        {
            case 1:
            Greenfoot.setWorld(new Forest_1());
            case 2:
            Greenfoot.setWorld(new Lucas_Room());
            break;
            
           
        }
        
    }
}
