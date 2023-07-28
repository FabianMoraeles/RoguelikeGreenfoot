import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Super here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Super extends Actor
{
    /**
     * Act - do whatever the Super wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    final int LimiteSuper = 100;
    int superCuenta;
    int cuenta;
    public Super()
    {
        setImage(new GreenfootImage(LimiteSuper + 2, 12));
        getImage().drawRect(0,0,LimiteSuper + 1,11);
        getImage().setColor(Color.BLUE);
        getImage().fillRect(1,1,superCuenta,10);
    }
    public void act()
    {
        setImage(new GreenfootImage(LimiteSuper + 2, 12));
        getImage().drawRect(0,0,LimiteSuper + 1,11);
        getImage().setColor(Color.BLUE);
        getImage().fillRect(1,1,superCuenta,10);
        World world = getWorld();
        Fondo myWorld = (Fondo)world;
        setLocation(myWorld.getPlayer().getX() + 10, myWorld.getPlayer().getY()-80);
        usarSuper();
    }
    public void usarSuper()
    {
        cuenta++;
        if(cuenta % 5 == 0)
        superCuenta++;
    }
}
