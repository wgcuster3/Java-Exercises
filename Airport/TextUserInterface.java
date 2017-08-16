
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class TextUserInterface {
    private Scanner reader;
    private HashMap<String, Airplane> airplanes;
    private ArrayList<Flight> flights;
    
    public TextUserInterface(Scanner reader){
        this.reader = reader;
        this.airplanes = new HashMap<String, Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String command = this.reader.nextLine();
            
            if (command.equals("x")){
                break;
            } else if (command.equals("1")){
                addAirplane();
            } else if (command.equals("2")){
                addFlight();
            }
        }
        
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while (true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            String command = this.reader.nextLine();
            
            if (command.equals("x")){
                break;
            } else if (command.equals("1")){
                printPlanes();
            } else if (command.equals("2")){
                printFlights();
            } else if (command.equals("3")){
                printPlaneInfo();
            }
            
        }
    }
    
    public void addAirplane(){
        String ID;
        int capacity;
        
        System.out.print("Give plane ID: ");
        ID = this.reader.nextLine();
                
        System.out.print("Give plane capacity: ");
        capacity = Integer.parseInt(reader.nextLine());
        
        this.airplanes.put(ID, new Airplane(ID, capacity));
    }
    
    public void addFlight(){
        String ID;
        String departCode;
        String destCode;
        
        System.out.print("Give plane ID: ");
        ID = this.reader.nextLine();
        
        System.out.print("Give departure airport code: ");
        departCode = this.reader.nextLine();
        
        System.out.print("Give destination airport code: ");
        destCode = this.reader.nextLine();
        
        this.flights.add(new Flight(ID, departCode, destCode));       
    }
    
    public void printPlanes(){
        Airplane airplane;
        
        for (String key : airplanes.keySet()){
            airplane = airplanes.get(key);
            System.out.println(airplane.getID() + " (" + airplane.getCapacity() + " ppl)");
        }
        
    }
    
    public void printFlights(){
        Airplane airplane;
        
        for (Flight flight : flights){
            airplane = airplanes.get(flight.getID());
            System.out.println(airplane.getID() + " (" + airplane.getCapacity() + " ppl)" 
                               + " (" + flight.getDepartCode() + "-" + flight.getDestCode() + ")");
        }        
    }
    
    public void printPlaneInfo(){
        String ID;
        Airplane airplane;
        
        System.out.print("Give plane ID: ");
        ID = this.reader.nextLine();
        
        airplane = this.airplanes.get(ID);
        
        System.out.println(airplane.getID() + " (" + airplane.getCapacity() + " ppl)");
    }
}
