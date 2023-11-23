import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tank extends enemies
{
    /**
     * Act - do whatever the tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public tank()
    {
        getImage().scale(40,40);
    }
    
    public void act()
    {
        if(getWorld() instanceof blueMap)
        {
            moveBlue(); 
        } else if (getWorld() instanceof greyMap)
        {
            moveGrey();
        }
        kill();
    }
    
    public void moveBlue()
    {
        if(getX() < enemies.bluetargetX)
        {
            setLocation(getX()+2,getY());
        } else if(getX() > enemies.bluetargetX)
        {
            setLocation(getX()-4,getY());
        }
        
        if(getY() < enemies.bluetargetY)
        {
            setLocation(getX(),getY()+3);
        } else if(getY() > enemies.bluetargetY)
        {
            setLocation(getX(),getY()-2);
        }
        
        if(getX() == enemies.bluetargetX && getY() == enemies.bluetargetY)
        {
            Greenfoot.setWorld(new perder());
            Greenfoot.stop();
        }
    }
    
    public void moveGrey()
    {
        if(getX() < enemies.greytargetX)
        {
            setLocation(getX()+4,getY());
        } else if(getX() > enemies.greytargetX)
        {
            setLocation(getX()-3,getY());
        }
        
        if(getY() < enemies.greytargetY)
        {
            setLocation(getX(),getY()+5);
        } else if(getY() > enemies.greytargetY)
        {
            setLocation(getX(),getY()-3);
        }
        
        if(getX() == enemies.greytargetX && getY() == enemies.greytargetY)
        {
            Greenfoot.setWorld(new perder());
            Greenfoot.stop();
        }
    }
}
