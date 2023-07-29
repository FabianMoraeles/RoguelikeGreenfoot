import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monsters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monsters extends Actor
{
  
    double health = 1;
    int restar = 0;
    double d = 0;
    Player player;
    Contador contador;
    public Monsters(Player mainPlayer,Contador contador){
        this.contador = contador;
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
            //health--;
            System.out.println(contador.tiempo/60);
            if((contador.tiempo/60) < 15){
                health--;
            }
            if(((contador.tiempo/60) % 15) == 0){
            restar = contador.tiempo/60;
            System.out.println("Resta es: " + restar);

            d =  ((restar/15)+1);
            System.out.println(String.format("%,.3f", d));
            d =  1/d;
            System.out.println(String.format("%,.2f", d));
            contador.saludMenos = d;
            System.out.println("salud menos" + contador.saludMenos);
            }
            if((contador.tiempo/60) > 15){
            health = health - contador.saludMenos;
            System.out.println("salud menos" + contador.saludMenos);
            System.out.println("Vida actual: " + health);
            }
            getWorld().removeObject(projectile);
        }
        if (health <= 0)
        {
            contador.puntaje++;
            contador.exp+=20;
            getWorld().removeObject(this);
        }
    }
}