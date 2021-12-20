import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class georgeLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class georgeLevel extends World
{

    /**
     * Constructor for objects of class georgeLevel.
     * 
     */
    public georgeLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
    
        prepare();
    }
    
    private void prepare()
    {
        yellowSubmarine yellowSubmarine = new yellowSubmarine();
        addObject(yellowSubmarine, 210, 120);
        
        coral coral1 = new coral();
        addObject(coral1, 75, 790);
        
        coral coral2 = new coral();
        addObject(coral2, 225, 790);
        
        coral coral3 = new coral();
        addObject(coral3, 435, 750);
        
        coral coral4 = new coral();
        addObject(coral4, 435, 655);
        
        coral coral5 = new coral();
        addObject(coral5, 230, 580);
        
        coral coral6 = new coral();
        addObject(coral6, 80, 500);
        
        coral coral7 = new coral();
        addObject(coral7, 340, 470);
        
        coral coral8 = new coral();
        addObject(coral8, 525, 400);
        
        coral coral9 = new coral();
        addObject(coral9, 310, 330);
               
        coral coral10 = new coral();
        addObject(coral10, 210, 200);
                
        George George = new George();
        addObject(George, 133, 741);
        
        glove glove = new glove();
        addObject(glove, 55, 520);
    }
}
