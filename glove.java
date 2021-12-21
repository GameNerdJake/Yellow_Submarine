import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class glove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class glove extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the glove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveRight();
        reset();
    }
    
    /**
     * Method for moving right
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    /**
     * Resets Glove when it reaches the end
     */
    public void reset()
    {
        if (getX() == 599){
            setLocation(53, getY());
        }  
    }
}
