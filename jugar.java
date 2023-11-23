import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugar extends buttons
{
    
    public jugar()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/2;
        int newWidth = myImage.getWidth()/2;
        myImage.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        HandleMouseClick();
    }
    
    public void HandleMouseClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new mapas());
        }
    }
}
