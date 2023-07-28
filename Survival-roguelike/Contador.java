import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    int puntaje = 0;
    public Contador(){
        setImage(new GreenfootImage("Puntaje: " + puntaje, 40, Color.WHITE , new Color(0,0,0,0)));
        
    }
    public void act()
    {
        setImage(new GreenfootImage("Puntaje: " + puntaje, 40, Color.WHITE , new Color(0,0,0,0)));
    }
}
