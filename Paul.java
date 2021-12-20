import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paul extends Actor
{
    /**
     * Act - do whatever the Paul wants to do. This method is called whenever
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
    
     public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, coral.class);
        return under != null;
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        } 
        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
    }
    
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
     public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    
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
    
    public void respawn()
    {
        if (getY() == 799){
            setLocation(300, 741);
            vSpeed = 0;
        }       
    }
    
    public void getHit()
    {
        if(isTouching (glove.class)){
            setLocation(300, 741);
            vSpeed = 0;
        }
    }
    
    public void checkChange()
    {
        Actor Paul = getOneIntersectingObject(yellowSubmarine.class);
        if(Paul != null)
        {
            Greenfoot.setWorld(new endScreen());
        }
    }
}
