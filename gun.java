import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gun extends Actor
{
    /**
     * Act - do whatever the gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static boolean hasGun = false;
    
    public gun()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/4;
        int newWidth = myImage.getWidth()/4;
        myImage.scale(newWidth, newHeight);
        hasGun = false;
    }
    
    public void act()
    {
        CheckCollision();
    }
    
    public void CheckCollision()
    {
     characters collidedWithCharacter = (characters)getOneIntersectingObject( characters.class );
    
     if ( collidedWithCharacter != null )
     {
         hasGun = true;
         getWorld().removeObject(this);
     }
    }
}
