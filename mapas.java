import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapas extends World
{

    private casa botonCasa;
    private blue map1;
    private grey map2;
    /**
     * Constructor for objects of class mapas.
     * 
     */
    public mapas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        map1 = new blue();
        addObject(map1,157,166);
        map2 = new grey();
        addObject(map2,446,296);
        botonCasa = new casa();
        addObject(botonCasa,580,380);
    }
}
