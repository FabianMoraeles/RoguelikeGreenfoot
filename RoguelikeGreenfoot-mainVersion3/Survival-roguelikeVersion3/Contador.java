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
    int exp;
    public Contador(){
        setImage(new GreenfootImage("Puntaje: " + puntaje + "\n Experiencia" + exp, 40, Color.WHITE , new Color(0,0,0,0)));
        
    }
    public void act()
    {
        setImage(new GreenfootImage("Puntaje: " + puntaje + "\n XP: " + exp, 40, Color.WHITE , new Color(0,0,0,0)));
    }
}
