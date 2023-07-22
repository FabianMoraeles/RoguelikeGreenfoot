import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fondo extends World
{
    
    int count = 0;
    int spawnrate = 50;
    int spawnpoint;

    /** 
     * Constructor for objects of class Fondo.
     * 
     */
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
    }
    public void act(){
        count++;
        spawner();
    }
    
    public void spawner(){
        if (count % spawnrate == 0){
            spawnpoint = Greenfoot.getRandomNumber(8);
            switch(spawnpoint){
                case 0: addObject(new Monsters(),0,0); break;
                case 1: addObject(new Monsters(), getWidth()/2,0); break;
                case 2: addObject(new Monsters(), getWidth(),0); break;
                case 3: addObject(new Monsters(), 0,getHeight()/2); break;
                case 4: addObject(new Monsters(), getWidth()/2,getHeight()/2); break;
                case 5: addObject(new Monsters(), 0,getHeight()); break;
                case 6: addObject(new Monsters(), getWidth()/2,getHeight()); break;
                case 7: addObject(new Monsters(), getWidth(),getHeight()); break;
            }
        }
    }
}
