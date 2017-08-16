
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public GraphicCalculator(Calculator calculator){
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField();
        
        container.add(output);
        container.add(input);
        container.add(createPanel(output, input));     
    }
    
    private JPanel createPanel(JTextField output, JTextField input){
        JPanel panel = new JPanel(new GridLayout(1,3));
        
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton clearButton = new JButton("Z");
        clearButton.setEnabled(false);
        
        ButtonListener buttonListener = new ButtonListener(this.calculator, output, input, addButton, subtractButton, clearButton);
        
        addButton.addActionListener(buttonListener);
        subtractButton.addActionListener(buttonListener);
        clearButton.addActionListener(buttonListener);
        
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(clearButton);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}