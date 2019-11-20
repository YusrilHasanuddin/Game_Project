import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    private int jeda = 0;
    private boolean toRemove=false;
    GreenfootImage myImage = getImage();
    
    int newHeight = (int) myImage.getHeight() / 35;
    int newWidth = (int) myImage.getWidth() / 35;
    
     public Player2(){
       myImage.scale(newWidth, newHeight);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            move(-5);
        }
         
        if(Greenfoot.isKeyDown("down")){
            move(5);
        }
        
        if(Greenfoot.isKeyDown("left")){
            setRotation(getRotation()-2);
        }
        
        if(Greenfoot.isKeyDown("right")){
            setRotation(getRotation()+2);
        }
        
        if(Greenfoot.isKeyDown(".")){
            if(jeda>0)jeda--;
            
            if(jeda==1){
                LaserP2 actor = new LaserP2(){};
                actor.setRotation(getRotation());
                getWorld().addObject(actor, getX(),getY());
            }
                
            if(jeda==0)jeda=10;
        }
        

    }    
}
