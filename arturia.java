import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arturia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arturia extends characters
{
    /**
     * Act - do whatever the arturia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //public boolean isPlaying = false;
    
    public arturia()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/3;
        int newWidth = myImage.getWidth()/3;
        myImage.scale(newWidth, newHeight);
    }
    
    public void act()
    {
        HandleMouseClick();
        Move();
        shootBullet();
    }
}
