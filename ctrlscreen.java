import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ctrlscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ctrlscreen extends World
{
    /**
     * Constructor for objects of class ctrlscreen.
     * 
     */
    private casa botonCasa;
    
    public ctrlscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        botonCasa = new casa();
        addObject(botonCasa,580,380);
    }
}
