import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class A extends World
{

    /**
     * Constructor for objects of class A.
     * 
     */
    private int jeda=0;
    
    public static BarP1 p1hp = new BarP1("Player 1","",100,100);
    public static BarP1 p2hp = new BarP1("Player 2","",100,100);
    
    public A()
    {
        super(1024, 600, 1,false); 
        GreenfootImage bg = new GreenfootImage("Space Background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        
        addObject(new Player1(), 100, 300);
        addObject(new Player2(), 924, 300);
        
        addObject(p1hp,350,50);
        addObject(p2hp,674,550);
    }
    
    public void act(){
        if(p1hp.getValue() < 1){
            removeObjects(getObjects(Player1.class));
            addObject(new P2WonBtn(),512,300);
            
        }else if(p2hp.getValue() < 1){
            removeObjects(getObjects(Player2.class));
            addObject(new P1WonBtn(),512,300);
        }
    }
   
}
