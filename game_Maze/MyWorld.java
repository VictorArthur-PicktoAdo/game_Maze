import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        //CLASSES INSTÂNCIADAS DAS PAREDES
        ParedeVE parede1 = new ParedeVE();
        addObject(parede1,2,122);
        parede1.getImage().scale(5, 600);

        ParedeVD parede2 = new ParedeVD();
        addObject(parede2,597,297);
        parede2.getImage().scale(5, 600);

        ParedeHC parede3 = new ParedeHC();
        parede3.getImage().scale(5, 600);
        addObject(parede3,299,2);
        parede3.setRotation(90);

        ParedeHB parede4 = new ParedeHB();
        addObject(parede4,299,397);
        parede4.getImage().scale(5, 600);
        parede4.setRotation(90);

        //CLASSES INSTÂNCIADAS DOS OBSTACULOS QUE GIRA 
        //QUE SÃO AS PAREDES QUE DIVIDEM A TELA

        ObstaculoEstatico1 obstaculoEstatico1 = new ObstaculoEstatico1();
        obstaculoEstatico1.getImage().scale(5, 400);
        addObject(obstaculoEstatico1,150,260);

        ObstaculoEstatico2 obstaculoEstatico2 = new ObstaculoEstatico2();
        addObject(obstaculoEstatico2,300,140);
        obstaculoEstatico2.getImage().scale(5, 400);

        ObstaculoEstatico3 obstaculoEstatico3 = new ObstaculoEstatico3();
        addObject(obstaculoEstatico3,450,260);
        obstaculoEstatico3.getImage().scale(5, 400);

        //CLASSES INSTÂNCIADAS DOS OBSTACULOS QUE FICAM GIRANDO

        ObstaculoGiratorio1 obstaculoGiratorio1 = new ObstaculoGiratorio1();
        obstaculoGiratorio1.getImage().scale(5, 100);
        addObject(obstaculoGiratorio1,74,68);

        ObstaculoGiratorio2 obstaculoGiratorio2 = new ObstaculoGiratorio2();
        addObject(obstaculoGiratorio2,225,333);
        obstaculoGiratorio2.getImage().scale(5, 100);

        ObstaculoGiratorio3 obstaculoGiratorio3 = new ObstaculoGiratorio3();
        addObject(obstaculoGiratorio3,375,333);
        obstaculoGiratorio3.getImage().scale(5, 100);

        ObstaculoGiratorio4 obstaculoGiratorio4 = new ObstaculoGiratorio4();
        addObject(obstaculoGiratorio4,524,68);
        obstaculoGiratorio4.getImage().scale(5, 100);
        
        Fim fim = new Fim();
        addObject(fim,524,365);
        fim.getImage().scale(35, 35);
        
        Player player = new Player();
        addObject(player,74,365);
        player.getImage().scale(30, 30);
        player.setRotation(-90);
    }
}
