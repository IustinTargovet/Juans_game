import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public Level3(Pengu pengu)
    {    
        super(750, 500, 1);    // define size and resolution

        addObject ( new Ground(false), 85, 441);
        addObject ( new Ground(true), 665, 441);
        
        addObject ( new Cloud(), 369, 315 );
        
        addObject ( pengu, 66, 244 );
    }
}
