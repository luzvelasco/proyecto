import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class creditos here.
 * 
 * @author (luz velasco) 
 * @version (a version number or a date)
 */
public class creditos extends World
{

    /**
     * Constructor for objects of class creditos.
     * 
     */
    private casa botonCasa;
    
    public creditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        botonCasa = new casa();
        addObject(botonCasa,580,380);
    }
}
