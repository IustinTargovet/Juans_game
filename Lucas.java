import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lucas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lucas extends Actor
{
    private GreenfootImage left = new GreenfootImage("Lucas facing left.png");
    private GreenfootImage right = new GreenfootImage("Lucas facing right copy.png");
    private GreenfootImage down = new GreenfootImage("Lucas facing down copy.png");
    private GreenfootImage up = new GreenfootImage("Lucas facing up copy.png");
    private int image_is_scaled = 0;
    private boolean tutorial = false;
    public boolean i_button = false;
    private int movement_speed = 2;
    public Lucas()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 20, image.getHeight() + 27);
        setImage(image);
        setImage(right);
        image = getImage();
        image.scale(image.getWidth() + 20, image.getHeight() + 27);
        setImage(image);
        setImage(left);
        image = getImage();
        image.scale(image.getWidth() + 20, image.getHeight() + 27);
        setImage(image);
        setImage(up);
        image = getImage();
        image.scale(image.getWidth() + 20, image.getHeight() + 27);
        setImage(image);
        setImage(down);
        image = getImage();
        image.scale(image.getWidth() + 20, image.getHeight() + 27);
        setImage(image);
    }
    public void touching_interactable_object()
    {
        if (getOneObjectAtOffset(0, 0, interactable_objects.class) != null)
        {
            Actor z = new Interact_Button();
            spawn_Interact_Button(z);
        }
    }
      public void move()
    {
            if (Greenfoot.isKeyDown("up"))
            {
                if (getOneObjectAtOffset(0, 0, solid_object.class) ==null)
                {
                    setLocation(getX(), getY()-2);
                }
                setImage(up);
                
            }
            if (Greenfoot.isKeyDown("right"))
            {
                if (getOneObjectAtOffset(0, 0, solid_object.class) ==null)
                {
                    move(2);
                }
                setImage(right);
            }
            if (Greenfoot.isKeyDown("left"))
            {
                if (getOneObjectAtOffset(-0, 0, solid_object.class) ==null )
                {
                    move(-2);
                }
                setImage(left);
                
            }
            if (Greenfoot.isKeyDown("down"))
            {
                setLocation(getX(), getY()+2);
                setImage(down);
            }
   }   
    
   public void tutorial_dialog()
   {
       if(isTouching(Lucas_house_door.class) && tutorial==true)
            {
                Actor chest_dialog_1 = new Chest_dialog_1();
                Actor chest_dialog_2 = new Chest_dialog_2();
                Actor Hint_shelf_dialog = new Hint_shelf_dialog();
                getWorld().addObject(chest_dialog_1, 340, 370);
                Greenfoot.playSound("Chest_dialog_1.wav");
                tutorial = false;
                Greenfoot.delay(850);
                getWorld().removeObject(chest_dialog_1);
                Greenfoot.delay (100);
                getWorld().addObject(chest_dialog_2, 340, 370);                
                Greenfoot.playSound("Chest_dialog_2.wav");
                Greenfoot.delay(525);
                getWorld().removeObject(chest_dialog_2);
                Greenfoot.delay(90);
                getWorld().addObject(Hint_shelf_dialog, 340, 370);
                Greenfoot.playSound("Hint_Shelf_dialog.wav");
                Greenfoot.delay(590);
                getWorld().removeObject(Hint_shelf_dialog);
            
            }
   }
   
   public void exit_Lucas_room()
   {
    
        if (isTouching(Lucas_house_door.class) && (Greenfoot.isKeyDown("z")))
        {
          Greenfoot.setWorld(new Forest_1());
        }
   }
   
      public void enter_Lucas_room()
   {
    Lucas_Room lucas_room = new Lucas_Room();
        if (isTouching(Lucas_tree_house.class) && (Greenfoot.isKeyDown("z")))
        {
            Greenfoot.setWorld(lucas_room);
        }
   }
   
   public void exit_Forest_1()
   {
       Actor interact_button = new Interact_Button();
       if (getWorld() instanceof Forest_1)
       {
       if (getX() > 280 && getX() < 340 && getY() > 460 && i_button == false)
       {
           spawn_Interact_Button(interact_button);
           if (Greenfoot.isKeyDown("z"))
           {
               Greenfoot.setWorld(new Forest_2());
         
           }
       }
       if ((getX() < 280 || getX() > 340 || getY() < 460) && i_button == true)
       {
           destroy_Interact_Button(interact_button);
       }
       }
   }
   public void spawn_Interact_Button(Actor z)
   {
       getWorld().addObject(z, 30, 450);
       i_button = true;
   }
   
   public void destroy_Interact_Button(Actor z)
   {
       getWorld().removeObject(z);
       i_button = false;
   }
   
   public void level_changes()
   {
    exit_Lucas_room();
    enter_Lucas_room();
    exit_Forest_1();
    }
   
    public void act() 
    {
        move();
        tutorial_dialog();
        level_changes();
        touching_interactable_object();
        
    } 
    
  
}
