/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class UserInterface {
    private Scanner reader;
    
    public UserInterface(){
        this.reader = new Scanner(System.in);
    }
    
    public void move(Player player, List<Vampire> vampiresList, boolean vampires){
        String command = reader.nextLine();
        
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);
            if(c == 'w'){
                player.goUp();
            } else if (c == 's'){
                player.goDown();
            } else if (c == 'a'){
                player.goLeft();
            } else if (c == 'd'){
                player.goRight();
            }
        }
        
        //Check and remove any vampires in the space the player has occupied
        List<Vampire> toBeRemoved = new ArrayList<Vampire>();
        
        for(Vampire vampire : vampiresList){
            if(player.sameSpace(vampire.getX(), vampire.getY())){
                toBeRemoved.add(vampire);
            }
        }
        
        vampiresList.removeAll(toBeRemoved);
        
        //Move all remaining vampires
        if(vampires){
            for(Vampire vampire : vampiresList){
                vampire.move();
            }
        }
        
        player.blinkLamp();
    }
}
