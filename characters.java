import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personajes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class characters extends Actor
{
    /**
     * Act - do whatever the personajes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean isPlaying = false;
    protected boolean canShoot = true;
    
    public void act()
    {
        
    }
    
    public void HandleMouseClick()
    {        
        if (Greenfoot.mouseClicked(this))
        {
            this.isPlaying = true;
            
            if(getWorld() instanceof greyMap)
            {
                this.setLocation(163,191);
            }
            
            if(getWorld() instanceof blueMap)
            {
                this.setLocation(344,257);
            }
        }
    }
    
    
    public void Move()
    {
        if(this.isPlaying == true) {
            int x = this.getX();
            int y = this.getY();
            
            if(Greenfoot.isKeyDown("A") && x > 0)
            {
                x -= 20;
            }
            else if (Greenfoot.isKeyDown("D") && x < getWorld().getWidth()-1)
            {
                x += 20;
            }
            if(Greenfoot.isKeyDown("W") && y > 0)
            {
                y -= 20;
            }
            if(Greenfoot.isKeyDown("S") && y < getWorld().getHeight()-1)
            {
                y += 20;
            }
            
            this.setLocation(x,y);
        }
    }
    
    
    public void shootBullet()
    {   
        if(gun.hasGun == true && this.isPlaying == true)
        {
            if(Greenfoot.isKeyDown("shift") && (canShoot == true))
            {
                getWorld().addObject(new bullet(), this.getX()+15, this.getY());
                canShoot = false;
            }
            else if(!Greenfoot.isKeyDown("shift"))
            {
                canShoot = true;
            }
        }
    }
}
