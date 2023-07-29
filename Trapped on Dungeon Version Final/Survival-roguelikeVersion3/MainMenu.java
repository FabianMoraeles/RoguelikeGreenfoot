import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    GreenfootSound musicaFondo = new GreenfootSound("MainTheme (2).mp3");
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        musicaFondo.play();
        if(Greenfoot.isKeyDown("enter")){
        Greenfoot.setWorld(new Fondo());
        musicaFondo.stop();
    }
    }
}
