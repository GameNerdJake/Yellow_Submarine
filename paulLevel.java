import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paulLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paulLevel extends World
{

    /**
     * Constructor for objects of class paulLevel.
     * 
     */
    public paulLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        yellowSubmarine yellowSubmarine = new yellowSubmarine();
        addObject(yellowSubmarine, 300, 170);
                       
        coral coral1 = new coral();
        addObject(coral1, 300, 790);
        
        coral coral2 = new coral();
        addObject(coral2, 435, 750);
        
        coral coral3 = new coral();
        addObject(coral3, 435, 655);
        
        coral coral4 = new coral();
        addObject(coral4, 230, 580);
        
        coral coral5 = new coral();
        addObject(coral5, 430, 330);
                
        coral coral6 = new coral();
        addObject(coral6, 340, 490);
        
        coral coral7 = new coral();
        addObject(coral7, 221, 400);
                       
        coral coral8 = new coral();
        addObject(coral8, 300, 250);
                
        Paul Paul = new Paul();
        addObject(Paul, 300, 741);
        
        glove glove = new glove();
        addObject(glove, 60, 350);
    }
}
