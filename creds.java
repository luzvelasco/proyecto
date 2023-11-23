import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class creds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class creds extends buttons
{
    public creds()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/2;
        int newWidth = myImage.getWidth()/2;
        myImage.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the creds wants to do. This method is called whenever
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
            Greenfoot.setWorld(new creditos());
        }
    }
}
