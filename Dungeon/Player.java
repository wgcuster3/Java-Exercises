/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Wesley
 */
public class Player extends Character{
    private int lampBlinksLeft;
    
    public Player(int length, int height, int moves){
        super(0, 0, length, height);
        this.lampBlinksLeft = moves;
    }
    
    public void blinkLamp(){
        this.lampBlinksLeft--;    
    }
    
    public int getLampBlinksLeft(){
        return this.lampBlinksLeft;
    }
    
    public void goUp(){
        if((super.y - 1) < 0){
            return;
        }
        
        super.y--;
    }
    
    public void goDown(){
        if((super.y + 1) > (super.height -1)){
            return;
        }
        
        super.y++;
    }
    
    public void goLeft(){
        if((super.x - 1) < 0){
            return;
        }
        
        super.x--;
    }
    
    public void goRight(){
        if((super.x + 1) > (super.length - 1)){
            return;
        }
        
        super.x++;
    }
}
