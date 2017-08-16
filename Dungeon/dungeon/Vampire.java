/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;
import java.util.List;

/**
 *
 * @author Wesley
 */
public class Vampire extends Character{
    private Random random = new Random();
    
    public Vampire(int length, int height){
        super(0, 0, length, height);
        int x = 0, y = 0;
        
        //The vampires cannot start in the same location as the player so keep
        //generating locations until location is no longer 0, 0.
        while(x == 0 && y == 0){
            x = random.nextInt(super.length - 1);
            y = random.nextInt(super.height - 1);
        }
        
        super.x = x;
        super.y = y;
    }
    
    public void move(){
        this.x = random.nextInt(super.length - 1);
        this.y = random.nextInt(super.height - 1);
    }
}
