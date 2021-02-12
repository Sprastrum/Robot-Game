import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor{
    private final int X = 48;
    private final int Y = 50;
    
    public void act() {
    }
    
    public void robotMovement(String right, String left, String up, String down) {
        if(Greenfoot.isKeyDown(right)) {
            setLocation(getX()+3, getY());
        }
        if(Greenfoot.isKeyDown(left)) {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown(up)) {
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown(down)) {
            setLocation(getX(), getY()+3);
        }
    }
    
    public void detectWallCollision() {
        if(isTouching(Wall.class)) {
            setLocation(X,Y);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    
    public void detectBlockCollision() {
        if(isTouching(Block.class)) {
            setLocation(X,Y);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    
    public void detectHome() {
        if(isTouching(Home.class)) {
            setLocation(X,Y);
            Greenfoot.playSound("yipee.mp3");
        }
    }
    
    public void eatPizza() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.mp3");
        }
    }
}
