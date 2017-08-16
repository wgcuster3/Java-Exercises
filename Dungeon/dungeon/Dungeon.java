/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private UserInterface ui;
    private boolean vampiresMove;
    private Player player;
    private List<Vampire> vampiresList;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.ui = new UserInterface();
        
        this.player = new Player(this.length, this.height, this.moves);
        
        this.vampiresList = new ArrayList<Vampire>();
        
        for(int i = 0; i < vampires; i++){
            this.vampiresList.add(new Vampire(length, height));
        }
    }
    
    public void run(){
        while (true){
            if(this.player.getLampBlinksLeft() == 0){
                break;
            }
            
            if(this.vampiresList.isEmpty()){
                break;
            }
            display();
            
            ui.move(this.player, this.vampiresList, this.vampiresMove);
        }
        
        if(this.vampiresList.isEmpty()){
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }
    
    private void display(){
        //Print out how many blinks of the lamp the player has left
        System.out.println(this.player.getLampBlinksLeft());
        System.out.println("");
        
        //Print out the current location of the player and the vampires
        System.out.println("@ " + this.player);
        for(Vampire vampire : this.vampiresList){
            System.out.println("v " + vampire);
        }
        
        System.out.println("");
        
        //Display the dungeon layout
        for(int y = 0; y < this.height; y++){
            for(int x = 0; x < this.length; x++){
                System.out.print(determineSpaceType(x, y));
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
    
    //This will determine if a dungeon space is empty or if the player or a vampire is there.
    private String determineSpaceType(int x, int y){
        if(this.player.sameSpace(x, y)){
            return "@";
        }
        
        for(Vampire vampire : this.vampiresList){
            if(vampire.sameSpace(x, y)){
                return "v";
            }
        }
        
        return ".";
    }
}
