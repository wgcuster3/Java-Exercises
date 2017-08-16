/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Wesley
 */
public class ButtonListener implements ActionListener{
    private Calculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton addButton;
    private JButton subtractButton;
    private JButton clearButton;
    
    public ButtonListener(Calculator calculator, JTextField output, JTextField input, JButton addButton, JButton subtractButton, JButton clearButton){
        this.calculator = calculator;
        this.output = output;
        this.input = input;
        this.addButton = addButton;
        this.subtractButton = subtractButton;
        this.clearButton = clearButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        int i = 0;
        
        if(ae.getSource().equals(this.addButton)){
            i = testInt();
            this.output.setText("" + this.calculator.add(i));
        } else if (ae.getSource().equals(this.subtractButton)){
            i = testInt();
            this.output.setText("" + this.calculator.subtract(i));
        } else if (ae.getSource().equals(this.clearButton)){
            this.calculator.clear();
            this.output.setText("0");
        }
        
        int result = Integer.parseInt(this.output.getText());
        
        if(result == 0){
            disableClear();
        } else {
            enableClear();
        }
        
        
        this.input.setText("");
    }
    
    private int testInt(){
        int i = 0;
        try {
            i = Integer.parseInt(this.input.getText());
        } catch (Exception e){
            this.input.setText("");
            i = 0;
        }
        
        return i;
    }
    
    private void enableClear(){
        this.clearButton.setEnabled(true);
    }
    
    private void disableClear(){
        this.clearButton.setEnabled(false);
    }
}
