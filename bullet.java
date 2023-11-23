import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public bullet()
    {
        GreenfootImage myImage = getImage();
        int newHeight = myImage.getHeight()/2;
        int newWidth = myImage.getWidth()/2;
        myImage.scale(newWidth, newHeight);
    }
    
    public void act()
    {
        Move();
        remove();
    }
    
    public void Move()
    {
        setLocation(getX()+25,getY());
    }   
      
    public void remove()
    {
        Actor enemy = getOneIntersectingObject(enemies.class);
        
        if(enemy != null)
        {
            
            if(getWorld() instanceof greyMap)
            {
                greyMap greymap = (greyMap)getWorld();
                greymap.addScore(50);
                Greenfoot.playSound("mario_coin_sound.mp3");
                
                if(greymap.score > 100)
                    {
                        Greenfoot.setWorld(new ganar());
                        Greenfoot.stop();
                    }
            } else if(getWorld() instanceof blueMap)
            {
                blueMap bluemap = (blueMap)getWorld();
                bluemap.addScore(50);
                Greenfoot.playSound("mario_coin_sound.mp3");
                
                if(bluemap.score > 100)
                    {
                        Greenfoot.setWorld(new ganar());
                        Greenfoot.stop();
                    }
            }
            
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
        else if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
