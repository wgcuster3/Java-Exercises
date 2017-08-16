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
public class Character {
    protected int x;
    protected int y;
    protected int length;
    protected int height;
    
    
    public Character(int x, int y, int length, int height){
        this.x = x;
        this.y = y;        
        this.length = length;
        this.height = height;
    }
    
    public Boolean sameSpace(int x, int y){
        if((this.x == x) && (this.y == y)){
            return true;
        }
        
        return false;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public String toString(){
        return this.x + " " + this.y;
    }
}
