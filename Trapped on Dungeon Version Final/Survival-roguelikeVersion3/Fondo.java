import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fondo extends World
{
    GreenfootSound musicaFondo = new GreenfootSound("Dungeon.mp3");    
    int count = 0;
    int spawnrate = 50;
    int spawnpoint;
    public Player mainPlayer = new Player();
    Contador contador = new Contador();
    Salud salud = new Salud();
    Arma arma = new Arma(contador);
    Super sUper = new Super();
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        mainPlayer = new Player(arma, sUper);
        addObject (mainPlayer, getWidth()/2, getHeight()/2);
        addObject (contador, 80, 80);
        addObject(salud , mainPlayer.getX() - 5, mainPlayer.getY() - 50);
        addObject(arma,700,70);
        addObject(sUper, mainPlayer.getX() + 10, mainPlayer.getY() - 80);
    }
    
    public Player getPlayer()
    {
        return mainPlayer;
    }
    
    public void act(){
        count++;
        spawner();
        musicaFondo.play();

    }
    
    public void spawner(){
        if (count % spawnrate == 0){
            spawnpoint = Greenfoot.getRandomNumber(8);
            switch(spawnpoint){
                case 0: addObject(new Monsters(mainPlayer,contador),0,0); break;
                case 1: addObject(new Monsters(mainPlayer,contador), getWidth()/2,0); break;
                case 2: addObject(new Monsters(mainPlayer,contador), getWidth(),0); break;
                case 3: addObject(new Monsters(mainPlayer,contador), 0,getHeight()/2); break;
                //case 3: addObject(new Monsters(mainPlayer,contador), getWidth()/2,getHeight()/2); break;
                case 4: addObject(new Monsters(mainPlayer,contador), 0,getHeight()); break;
                case 5: addObject(new Monsters(mainPlayer,contador), getWidth()/2,getHeight()); break;
                case 6: addObject(new Monsters(mainPlayer,contador), getWidth(),getHeight()); break;
            }
        }
    }

    
}
