package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        //Draw a circle
        //UserInterface ui = new UserInterface(new Circle(50, 50, 150));
        //SwingUtilities.invokeLater(ui);
        
        //Draw a square
        //UserInterface ui = new UserInterface(new Square(50, 50, 250));
        //SwingUtilities.invokeLater(ui);
        
        //Draw a box
        //UserInterface ui = new UserInterface(new Box(50, 50, 100, 300));
        //SwingUtilities.invokeLater(ui);
        
        //Draw a truck
        CompoundFigure truck = new CompoundFigure();

        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Circle(100, 200, 50));
        truck.add(new Circle(220, 200, 50));

        UserInterface ui = new UserInterface(truck);
        SwingUtilities.invokeLater(ui);
    }
}
