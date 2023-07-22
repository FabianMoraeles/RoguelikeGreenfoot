import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monsters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monsters extends Actor
{
  
    int health = 3;
    Player player;
    public Monsters(Player mainPlayer){
        player = mainPlayer;
        setImage("Monster1.png");
        getImage().scale(40,40);
    }
    public void act()
    {
        MoveAround();
        hitByProjectile();
    }
    public void MoveAround(){
        move(1);
        turnTowards(player.getX(),player.getY());
    }
    public void hitByProjectile(){
        Actor projectile = getOneIntersectingObject(Proyectil.class);
        if (projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if (health == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
