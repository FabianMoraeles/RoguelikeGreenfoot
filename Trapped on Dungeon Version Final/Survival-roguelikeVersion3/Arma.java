import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arma extends Actor
{
    /**
     * Act - do whatever the Arma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Contador contador;
    int MejoraArma = 1;
    public Arma(Contador contador){
        this.contador = contador;
        setImage(new GreenfootImage("Mejorar \n arma",25,Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this) && contador.exp > 149){
            contador.exp = contador.exp - 150;
            MejoraArma++;
        }
        if(MejoraArma>3)
        {
            MejoraArma = 3;
        }
    }

}
