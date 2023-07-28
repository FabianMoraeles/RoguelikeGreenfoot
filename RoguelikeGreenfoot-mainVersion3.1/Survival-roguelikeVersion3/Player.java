import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 3;
    int tiempo = 0;
    Arma arma;
    Super sUper;
    int superContador;
    public Player(){
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.YELLOW);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.BLACK);
        getImage().fillRect(50,20,70,10);
    }
    public Player(Arma arma, Super sUper){
        this.sUper = sUper;
        this.arma = arma;
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
        golpeMounstro();
        superUsado();
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
        if(Greenfoot.mousePressed(null) && arma.MejoraArma == 1){
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY()); 
            proyectil.setRotation(getRotation());
            proyectil.move(25);
    }
    if(Greenfoot.mousePressed(null) && arma.MejoraArma == 2){
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY()); 
            proyectil.setRotation(getRotation() -10);
            proyectil.move(20);
            Proyectil proyectil2 = new Proyectil();
            getWorld().addObject(proyectil2, getX(), getY()); 
            proyectil2.setRotation(getRotation() + 10);
            proyectil2.move(5);
    }if(Greenfoot.mousePressed(null) && arma.MejoraArma == 3){
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY()); 
            proyectil.setRotation(getRotation()-10);
            proyectil.move(20);
            Proyectil proyectil2 = new Proyectil();
            getWorld().addObject(proyectil2, getX(), getY()); 
            proyectil2.setRotation(getRotation() + 10);
            proyectil2.move(5);
            Proyectil proyectil3 = new Proyectil();
            getWorld().addObject(proyectil3, getX(), getY()); 
            proyectil3.setRotation(getRotation());
            proyectil3.move(5);
    }
    }
    
    public void superUsado()
    {
        if (sUper.superCuenta > 99 && superContador < 30)
        {
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY()); 
            proyectil.setRotation(getRotation() -60);
            proyectil.move(20);
            Proyectil proyectil2 = new Proyectil();
            getWorld().addObject(proyectil2, getX(), getY()); 
            proyectil2.setRotation(getRotation() + 60);
            proyectil2.move(5);
            Proyectil proyectil3 = new Proyectil();
            getWorld().addObject(proyectil3, getX(), getY()); 
            proyectil3.setRotation(getRotation() -180);
            proyectil3.move(5);
            Proyectil proyectil1 = new Proyectil();
            getWorld().addObject(proyectil1, getX(), getY()); 
            proyectil1.setRotation(getRotation());
            proyectil1.move(20);
            Proyectil proyectil21 = new Proyectil();
            getWorld().addObject(proyectil21, getX(), getY()); 
            proyectil21.setRotation(getRotation() + 120);
            proyectil21.move(5);
            Proyectil proyectil31 = new Proyectil();
            getWorld().addObject(proyectil31, getX(), getY()); 
            proyectil31.setRotation(getRotation() - 120);
            proyectil31.move(5);
            superContador++;
        }
        if (superContador > 29)
        {
            sUper.superCuenta = 0;
            superContador = 0;
        }

    }
    
    public boolean golpeMounstro(){
        
        Actor monsters = getOneObjectAtOffset(0,0, Monsters.class);
        if(monsters!=null)
        {
            return true;  
        }
        else{
            return false;
        }
        
    }
}
