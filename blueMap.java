import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueMap here.
 * 
 * @author (luz velasco) 
 * @version (a version number or a date)
 */
public class blueMap extends World
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

    // pistola
    private gun Gun;
    
    // puntaje
    public static int score;
    
    public blueMap()
    {    
        super(600, 400, 1); 
        
        score = 0;
        
        Arturia = new arturia();
        addObject(Arturia,380,368);
        
        Blemishine = new blemishine();
        addObject(Blemishine,439,368);
        
        Kaltsit = new kaltsit();
        addObject(Kaltsit,500,368);
        
        Lumen = new lumen();
        addObject(Lumen,558,368);
        
        Gun = new gun();
        addObject(Gun,519,267);
        
        Ball = new ball();
        addObject(Ball,165,53);
        
        Tank = new tank();
        addObject(Tank,439,53);
        
        Wolf = new wolf();
        addObject(Wolf,93,189);
 
    }
    
    public void addScore(int puntos)
    {
        score = score + puntos;
        showText("puntaje: " + score,80,25);
        
    }

}
