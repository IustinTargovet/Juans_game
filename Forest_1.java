import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest_1 extends World
{

    /**
     * Constructor for objects of class Forest_1.
     * 
     */
    public Forest_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lucas_tree_house lucas_tree_house = new Lucas_tree_house();
        addObject(lucas_tree_house,304,130);
        lucas_tree_house.setLocation(298,123);
        lucas_tree_house.setLocation(301,120);
        lucas_tree_house.setLocation(317,123);
        Forest_tree_1 forest_tree_1 = new Forest_tree_1();
        addObject(forest_tree_1,599,188);
        Forest_tree_1 forest_tree_12 = new Forest_tree_1();
        addObject(forest_tree_12,56,61);
        Forest_tree_1 forest_tree_13 = new Forest_tree_1();
        addObject(forest_tree_13,607,65);
        Forest_Rock_1 forest_rock_1 = new Forest_Rock_1();
        addObject(forest_rock_1,601,425);
        Forest_Rock_1 forest_rock_12 = new Forest_Rock_1();
        addObject(forest_rock_12,141,230);
        Forest_Rock_1 forest_rock_13 = new Forest_Rock_1();
        addObject(forest_rock_13,475,128);
        Forest_tree_1 forest_tree_14 = new Forest_tree_1();
        addObject(forest_tree_14,180,348);
        Lucas lucas = new Lucas();
        addObject(lucas,326,237);
        lucas.setLocation(320,231);
        lucas.setLocation(314,296);
    }
}
