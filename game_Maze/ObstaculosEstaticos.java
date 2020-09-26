import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstaculoEstatico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ObstaculosEstaticos extends Actor
{
    /**
     * Act - do whatever the ObstaculoEstatico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){}
    public void Encosto_Perdeu(){
       Actor aux = getOneIntersectingObject(Player.class);
       if(aux != null){
           removeTouching(Player.class);
       }
    }
}
