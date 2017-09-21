/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import wormgame.Direction;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class Worm {
    private List<Piece> worm;
    private Direction direction;
    private int length;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.worm = new ArrayList<Piece>();
        
        this.worm.add(new Piece(originalX, originalY));
        
        this.direction = originalDirection;
        this.length = 3;
    }
    
    public Direction getDirection(){
        return this.direction;
    }
    
    public void setDirection(Direction dir){
        this.direction = dir;
    }
    
    public int getLength(){
        return this.worm.size();
    }
    
    public List<Piece> getPieces(){
        return this.worm;
    }
    
    public void move(){
        //The head of the worm will always be the last element of the ArrayList.  
        //The worm moves by removing the first element in the list(the tail) and adding a new piece that will become the new head.
        //Each piece of the worm begins at the same coordinates so the tail should not be removed until it hits 3 pieces long.
        if(this.worm.size() == this.length){
            this.worm.remove(0);
        }
        
        Piece wormHead = this.worm.get(this.worm.size() - 1);
        
        int x = wormHead.getX();
        int y = wormHead.getY();
        
        switch(this.direction){
            case UP:
                y -= 1;
                break;
            case DOWN:
                y += 1;
                break;
            case LEFT:
                x -= 1;
                break;
            case RIGHT:
                x += 1;
                break;
        }
        
        this.worm.add(new Piece(x,y));
    }
    
    public void grow(){
        if(this.worm.size() < 3){
            return;
        }
        
        this.length += 1;
    }
    
    public boolean runsInto(Piece piece){
        for(Piece p : this.worm){
            if(piece.runsInto(p)){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean runsIntoItself(){
        Piece wormHead = this.worm.get(this.worm.size() - 1);
        
        for(int i = 0; i <= (this.worm.size() - 2); i++){
            if(this.worm.get(i).runsInto(wormHead)){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean hitsBorder(int width, int height){
        Piece wormHead = this.worm.get(this.worm.size() - 1);
        
        if((wormHead.getX() <= 0) || (wormHead.getX() >= width)){
            return true;
        }
        
        if((wormHead.getY() <= 0) || (wormHead.getY() >= height)){
            return true;
        }
        
        return false;
    }
}
