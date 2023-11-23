import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemies extends Actor
{
    /**
     * Act - do whatever the enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int bluetargetX = 301;
    public static int bluetargetY = 263;
    public static int greytargetX = 133;
    public static int greytargetY = 227;
    
    public void act()
    {
        
    }
    
    public void kill()
    {
        Actor character = getOneIntersectingObject(characters.class);
        
        if(character != null)
        {
            getWorld().removeObject(character);
            
            if(getWorld() instanceof greyMap)
            {
                Greenfoot.playSound("vine-boom.mp3");
                greyMap greymap = (greyMap)getWorld();
                greymap.addScore(-10);
                       
            } else if(getWorld() instanceof blueMap)
            {
                Greenfoot.playSound("vine-boom.mp3");
                blueMap bluemap = (blueMap)getWorld();
                bluemap.addScore(-10);
            }
        }
    }
}
