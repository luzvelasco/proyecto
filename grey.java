import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grey extends maps
{
    /**
     * Act - do whatever the grey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public grey()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/6;
        int newWidth = myImage.getWidth()/6;
        myImage.scale(newWidth, newHeight);
    }
    
    public void act()
    {
        HandleMouseClick();
    }
    
    public void HandleMouseClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new greyMap());
        }
    }
}
