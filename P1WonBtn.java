import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1WonBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1WonBtn extends Actor
{
    /**
     * Act - do whatever the P1WonBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public P1WonBtn(){
       GreenfootImage myImage = getImage();
       int newHeight = (int) myImage.getHeight() / 3;
       int newWidth = (int) myImage.getWidth() / 3;
       myImage.scale(newWidth, newHeight);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            A.p1hp = new BarP1("Player 1","",100,100);
            A.p2hp = new BarP1("Player 2","",100,100);
            Greenfoot.setWorld(new A());
            
        }
    }    
}
