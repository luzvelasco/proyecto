import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class greyMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greyMap extends World
{
    // personajes
    private arturia Arturia;
    private blemishine Blemishine;
    private kaltsit Kaltsit;
    private lumen Lumen;
    
    // enemigos
    private ball Ball;
    private tank Tank;
    private wolf Wolf;
    
    // gun
    private gun Gun;
    
    // puntaje
    public static int score;
    
    public int getScore()
    {
        return score;
    }
    
    public greyMap()
    {    
        super(600, 400, 1);
        
        Arturia = new arturia();
        addObject(Arturia,380,368);
        
        Blemishine = new blemishine();
        addObject(Blemishine,439,368);
        
        Kaltsit = new kaltsit();
        addObject(Kaltsit,500,368);
        
        Lumen = new lumen();
        addObject(Lumen,558,368);
        
        Gun = new gun();
        addObject(Gun,493,205);
        
        Ball = new ball();
        addObject(Ball,436,82);
        
        Tank = new tank();
        addObject(Tank,473,121);
        
        Wolf = new wolf();
        addObject(Wolf,380,53);
        
        score = 0;
        // add enemies at 380, 64 & 425,95
    }
    
    public void addScore(int puntos)
    {
        score = score + puntos;
        showText("puntaje: " + score,80,25);
    }

}
