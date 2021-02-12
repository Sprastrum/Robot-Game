import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Robot{
    public void act() {
        robotMovement("right","left","up","down");
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }    
}
