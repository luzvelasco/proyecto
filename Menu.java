import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (luz velasco) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    private controles botonControl;
    private creds botonCreds;
    private jugar botonJugar;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        botonControl = new controles();
        addObject(botonControl,130,273);
        botonCreds = new creds();
        addObject(botonCreds,133,328);
        botonJugar = new jugar();
        addObject(botonJugar,141,213);
    }
}
