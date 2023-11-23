import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class controles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controles extends buttons
{
    public controles()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/2;
        int newWidth = myImage.getWidth()/2;
        myImage.scale(newWidth, newHeight);
    }
    /**
     * Act - do whatever the controles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        HandleMouseClick();// Add your action code here.
    }
    
    public void HandleMouseClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new ctrlscreen());
        }
    }
}
