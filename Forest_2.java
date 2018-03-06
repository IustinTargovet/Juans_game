import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest_2 extends World
{

    /**
     * Constructor for objects of class Forest_2.
     * 
     */
    public Forest_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Forest_tree_1 forest_tree_1 = new Forest_tree_1();
        addObject(forest_tree_1,564,337);
        Forest_tree_1 forest_tree_12 = new Forest_tree_1();
        addObject(forest_tree_12,565,224);
        Forest_tree_1 forest_tree_13 = new Forest_tree_1();
        addObject(forest_tree_13,575,103);
        forest_tree_13.setLocation(564,92);
        Forest_tree_1 forest_tree_14 = new Forest_tree_1();
        addObject(forest_tree_14,56,336);
        Forest_tree_1 forest_tree_15 = new Forest_tree_1();
        addObject(forest_tree_15,61,216);
        Forest_tree_1 forest_tree_16 = new Forest_tree_1();
        addObject(forest_tree_16,61,96);
        forest_tree_16.setLocation(63,81);
        Forest_Rock_1 forest_rock_1 = new Forest_Rock_1();
        addObject(forest_rock_1,150,338);
        Forest_Rock_1 forest_rock_12 = new Forest_Rock_1();
        addObject(forest_rock_12,515,231);
        Forest_Rock_1 forest_rock_13 = new Forest_Rock_1();
        addObject(forest_rock_13,452,65);
        Forest_Rock_1 forest_rock_14 = new Forest_Rock_1();
        addObject(forest_rock_14,156,125);
        forest_rock_14.setLocation(134,156);
        Lucas lucas = new Lucas();
        addObject(lucas,343,113);
        removeObject(forest_tree_15);
        removeObject(forest_tree_14);
        removeObject(forest_tree_13);
        Forest_Tree_2 forest_tree_2 = new Forest_Tree_2();
        addObject(forest_tree_2,555,91);
        forest_tree_2.setLocation(559,82);
        Forest_Tree_2 forest_tree_22 = new Forest_Tree_2();
        addObject(forest_tree_22,67,218);
        forest_tree_22.setLocation(63,218);
        Forest_Tree_2 forest_tree_23 = new Forest_Tree_2();
        addObject(forest_tree_23,66,341);
        forest_tree_22.setLocation(56,199);
    }
}
