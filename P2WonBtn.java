import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2WonBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2WonBtn extends Actor
{
    public P2WonBtn(){
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
