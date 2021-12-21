import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class George here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class George extends Actor
{
    /**
     * Act - do whatever the George wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 13;

    public void act()
    {
        checkKeys();
        onGround();
        checkFall();
        respawn();
        getHit();
        checkChange();
    }
    
    /**
     * Checks to see if player is on solid ground
     */
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, coral.class);
        return under != null;
    }
    
    /**
     * Checks for movement
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage("George.png");
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage("GeorgeFlipped.png");
        } 
        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
    }
    
    /**
     * Method for moving right
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    /**
     * Method for moving left
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    /**
     * Method for falling
     */
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
    /**
     * Method for jumping
     */
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
    /**
     * Checks to see if player is on solid ground
     */
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
    /**
     * Respawns player after a fall
     */
    public void respawn()
    {
        if (getY() == 799){
            setLocation(133, 700);
            vSpeed = 0;
            Greenfoot.playSound("GeorgeOuch.wav");
        }       
    
    }
    
    /**
     * Respawns player after getting hit by the Glove
     */
    public void getHit()
    {
        if(isTouching (glove.class)){
            setLocation(133, 700);
            vSpeed = 0;
            Greenfoot.playSound("GeorgeOuch.wav");
        }
    }
    
    /**
     * Checks to see if the level should change
     */
    public void checkChange()
    {
        Actor George = getOneIntersectingObject(yellowSubmarine.class);
        if(George != null)
        {
            Greenfoot.setWorld(new johnLevel());
        }
    }
}
