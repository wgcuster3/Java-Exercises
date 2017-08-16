/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class PersonalCalculator implements Calculator{
    private int value;
    
    public PersonalCalculator(){
        this.value = 0;
    }
    
    public int add(int i){
        this.value += i;
        return this.value;
    }
    
    public int subtract(int i){
        this.value -= i;
        return this.value;
    }
    
    public void clear(){
        this.value = 0;
    }
}
