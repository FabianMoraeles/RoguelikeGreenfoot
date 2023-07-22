import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Proyectil(){
        setImage(new GreenfootImage(10,2));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,10,2);
    }
    public void act()
    {
        move(10);
    }
}
