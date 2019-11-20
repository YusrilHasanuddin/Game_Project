import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class LaserP1 extends Actor
{
    /**
     * Act - do whatever the LaserP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean toRemove = false;
    public LaserP1(){
       GreenfootImage myImage = getImage();
       int newHeight = (int) myImage.getHeight() / 35;
       int newWidth = (int) myImage.getWidth() / 35;
       myImage.scale(newWidth, newHeight);
       
       myImage.rotate(180);
    }
    
    
       
    public void act() 
    {
        // Add your action code here.
        
        
        if(isTouching(Player2.class)){
            A.p2hp.subtract(9);
            getWorld().removeObject(this);
        } else {
            if(!toRemove){
            move(10);
            if(getX()>getWorld().getWidth()+200)toRemove=true;
        } else{
            getWorld().removeObject(this);
        }
    }
    }    
}
