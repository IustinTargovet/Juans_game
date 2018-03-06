import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lucas_weapon_chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lucas_weapon_chest extends solid_object
{
    private GreenfootImage chest = new GreenfootImage("Lucas Weapon Chest copy.png");
    
    public Lucas_weapon_chest()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 15, image.getHeight() + 15);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
