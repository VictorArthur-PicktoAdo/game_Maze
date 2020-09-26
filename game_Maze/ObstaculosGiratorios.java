import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstaculosGiratorios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ObstaculosGiratorios extends Actor
{
    /**
     * Act - do whatever the ObstaculosGiratorios wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void Encosto_Perdeu(){
       Actor aux = getOneIntersectingObject(Player.class);
       if(aux != null){
           removeTouching(Player.class);
       }
    }
}
