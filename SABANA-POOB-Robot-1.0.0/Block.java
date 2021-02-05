    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    
public class Block extends Actor{
    private int rotation = 0;
    private int counter = 0;
    
    public void act() {
        ConstantRotation();
    }
        
    public void ConstantRotation(){
        if(counter == 1000){
            turn(1);
            counter = 0;
        }
        if(counter != 1000){
            counter ++;
        }
    }
}
