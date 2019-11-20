import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    private int jeda = 0;
    private boolean toRemove=false;
    
    GreenfootImage myImage = getImage();
    
    int newHeight;
    int newWidth;
    public Player1(){
       newHeight = (int) myImage.getHeight() / 35; 
       newWidth = (int) myImage.getWidth() / 35;
        
       myImage.scale(this.newWidth, this.newHeight);
       myImage.rotate(180);
    }
    
    
    public void act() 
    {   
        if(Greenfoot.isKeyDown("w")){
            move(5);
        }
         
        if(Greenfoot.isKeyDown("s")){
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("d")){
            setRotation(getRotation()+2);
        }
        
        if(Greenfoot.isKeyDown("a")){
            setRotation(getRotation()-2);
        }
        
        if(Greenfoot.isKeyDown("space")){
            if(jeda>0)jeda--;
            
            if(jeda==1){
                LaserP1 actor = new LaserP1(){};
                actor.setRotation(getRotation());
                getWorld().addObject(actor, getX(),getY());
            }
                
            if(jeda==0)jeda=10;
        }
        
        if(isTouching(Player2.class)){
            if(jeda>0)jeda--;
            if(jeda==1){
                A.p2hp.subtract(25);
                A.p1hp.subtract(25);
            }
            if(jeda==0)jeda=20;
        }
        
        if (Greenfoot.mouseClicked(this)) 
    {
        Greenfoot.setWorld(new A());
    }
   }
   
}
