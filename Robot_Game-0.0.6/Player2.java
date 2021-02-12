import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player2 extends Robot{
    public void act() {
        robotMovement("d","a","w","s");
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }    
}
