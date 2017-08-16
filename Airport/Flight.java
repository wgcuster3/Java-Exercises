/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class Flight {
    private String planeID;
    private String departureCode;
    private String destinationCode;
    
    public Flight(String planeID, String departCode, String destCode){
        this.planeID = planeID;
        this.departureCode = departCode;
        this.destinationCode = destCode;
    }
    
    public String getID(){
        return this.planeID;
    }
    
    public String getDepartCode(){
        return this.departureCode;
    }
    
    public String getDestCode(){
        return this.destinationCode;
    }
    
}
