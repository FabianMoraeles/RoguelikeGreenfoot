import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Salud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salud extends Actor
{
    int salud = 50;

    public Salud()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,salud,10);
        
    }
    public void act()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,salud,10);
        World world = getWorld();
        Fondo myWorld = (Fondo)world;
        setLocation(myWorld.getPlayer().getX() - 5, myWorld.getPlayer().getY()-50);
        perderVida();
    }
    public void perderVida()
    {
        World world = getWorld();
        Fondo myWorld = (Fondo)world;
        if(myWorld.getPlayer().golpeMounstro())
        {
            salud--;
        }
        if(salud<=0)
        {
    
           Greenfoot.playSound("Over.mp3");
           getWorld().showText("Perdiste :( \n Sobreviviste por: " + (myWorld.getPlayer().tiempo/60) + " segundos", getWorld().getWidth()/2, getWorld().getHeight()/2);
           Greenfoot.stop();
        }
    }
}
