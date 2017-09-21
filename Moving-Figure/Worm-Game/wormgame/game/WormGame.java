package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.Worm;
import wormgame.domain.Apple;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    
    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        //Create the worm starting from the center point of the screen and moving down.
        this.worm = new Worm(width/2, height/2, Direction.DOWN);

        //Create an apple with randomized location on the screen.
        newApple(); 
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        //Move the worm
        this.worm.move();
        
        //Check if the worm ate the apple
        if(this.worm.runsInto(apple)){
            this.worm.grow();
            newApple();
        }
        
        //If the worm runs into itself then quit.
        if(this.worm.runsIntoItself()){
            this.continues = false;
        }
        
        //If worm runs into the border then quite.
        if(this.worm.hitsBorder(width, height)){
            this.continues = false;
        }
        
        this.updatable.update();
        
        super.setDelay(1000 / worm.getLength());
    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }
    
    private void newApple(){
        //Keep trying for apple coordinates until it does not spawn on the worm.
        while (true){
            Random random = new Random();
            this.apple = new Apple(random.nextInt(width), random.nextInt(height));
            if(!this.worm.runsInto(apple)){
                break;
            }
        }
    }
}
