import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("didIt.wav");
    /**
     * Constructor for objects of class endScreen.
     * 
     */
    public endScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        backgroundMusic.play();
    }
}
