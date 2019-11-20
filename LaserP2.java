import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserP2 extends Actor
{
    /**
     * Act - do whatever the LaserP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean toRemove = false;
    
    public LaserP2(){
       
       GreenfootImage myImage = getImage();
       int newHeight = (int) myImage.getHeight() / 35;
       int newWidth = (int) myImage.getWidth() / 35;
       myImage.scale(newWidth, newHeight);  
    }
    
    public void act() 
    {
        if(isTouching(Player1.class)){
            A.p1hp.subtract(9);
            getWorld().removeObject(this);
        } else {
            if(!toRemove){
            move(-10);
            if(getX()>getWorld().getWidth()+200)toRemove=true;
        } else{
            getWorld().removeObject(this);
        }
    }
    }    
}
