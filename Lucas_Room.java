import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lucas_Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lucas_Room extends World
{

    /**
     * Constructor for objects of class Lucas_Room.
     * 
     */
    public Lucas_Room()
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

        Lucas_house_door lucas_house_door = new Lucas_house_door();
        addObject(lucas_house_door,330,53);
        lucas_house_door.setLocation(328,42);
        Bed bed = new Bed();
        addObject(bed,114,455);
        Lucas_weapon_chest lucas_weapon_chest = new Lucas_weapon_chest();
        addObject(lucas_weapon_chest,607,202);
        lucas_weapon_chest.setLocation(598,197);
        lucas_house_door.setLocation(317,43);
        bed.setLocation(70,398);
        lucas_weapon_chest.setLocation(549,80);
        bed.setLocation(63,178);
        lucas_weapon_chest.setLocation(198,143);
        lucas_weapon_chest.setLocation(198,143);
        lucas_weapon_chest.setLocation(572,76);
        Room1_Carpet room1_carpet = new Room1_Carpet();
        addObject(room1_carpet,339,247);
        room1_carpet.setLocation(324,235);
        Lucas_hint_shelf lucas_hint_shelf = new Lucas_hint_shelf();
        addObject(lucas_hint_shelf,561,403);
        Lucas lucas = new Lucas();
        addObject(lucas,89,53);
        lucas.setLocation(186,63);
        lucas.setLocation(178,59);
        lucas.setLocation(155,54);
        Lucas_house_table lucas_house_table = new Lucas_house_table();
        addObject(lucas_house_table,90,434);
    }
}
