import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Santiago Santos
 * @0.0.1
 */
public class RobotWorld extends World
{
    //private int wallY = 147;
    //private int[][] wallsX = {{0},{52},{159},{266},{587},{692},{791}};
    //private int wall = 0;
    
    /**
     * Constructor for objects of class RobotWorld. 
     */
    public RobotWorld(){    
        super(800, 600, 1);
        prepareScenario();
    }
    
    public void prepareScenario() {
        addObject(new Player1(),48,50);
        addObject(new Player2(),48,50);
        
        //for(wall = 1; wall > wallsX[6].length; wall++){
        //    addObject(new Wall(),wallsX[1][1],wallY);
        //}
        
        addObject(new Wall(),52,147);
        addObject(new Wall(),159,147);
        addObject(new Wall(),266,147);
        addObject(new Wall(),587,147);
        addObject(new Wall(),692,147);
        addObject(new Wall(),791,147);
        
        addObject(new Block(),427,145);
        
        addObject(new Home(),751,552);
        
        addObject(new ScorePanel(),71,554);
        
        addObject(new Pizza(),720,46);
        addObject(new Pizza(),433,38);
        addObject(new Pizza(),183,302);
        addObject(new Pizza(),682,312);
        addObject(new Pizza(),417,537);
    }
}
