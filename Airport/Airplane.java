/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class Airplane {
    private String ID;
    private int capacity;
    
    public Airplane(String ID, int capacity){
        this.ID = ID;
        this.capacity = capacity;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
}
