import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monsters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monsters extends Actor
{
    /**
     * Act - do whatever the Monsters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Monsters(){
        setImage("Monster1.png");
        getImage().scale(40,40);
    }
    public void act()
    {
        MoveAround();
    }
    public void MoveAround(){
        move(1);
        turnTowards(getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
}
