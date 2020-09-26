import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fim extends Actor
{
    /**
     * Act - do whatever the Fim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Fim_do_Jogo();
    }    
    private void Fim_do_Jogo(){
        Actor aux = getOneIntersectingObject(Player.class);
        if(aux != null){
            removeTouching(Player.class);
        }
    }
}
