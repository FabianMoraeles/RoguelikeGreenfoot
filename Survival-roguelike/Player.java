import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 3;
    int tiempo = 0;
    public Player(){
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.YELLOW);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.BLACK);
        getImage().fillRect(50,20,70,10);
    }
    public void act() 
    {
        turnAround();
        movement();
        FIRE();
        youLose();
        tiempo++;
    }
    public void turnAround(){
        if (Greenfoot.getMouseInfo() != null)
        turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
    }
    public void movement(){
        if (Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - speed);
        if (Greenfoot.isKeyDown("a"))
        setLocation(getX() - speed,getY());
        if (Greenfoot.isKeyDown("s"))
        setLocation(getX(),getY() + speed);
        if (Greenfoot.isKeyDown("d"))
        setLocation(getX() + speed,getY());
    }
    public void FIRE(){
        if(Greenfoot.mousePressed(null)){
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY()); 
            proyectil.setRotation(getRotation());
    }
    }
    public void youLose(){
        
        if(isTouching(Monsters.class))
        {
            getWorld().showText("Perdiste :( - Duraste: " +(tiempo/60) + " segundos", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();

        }
        
    }
}
