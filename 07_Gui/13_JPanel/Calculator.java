import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JPanel topPanel, numbersPanel, logicPanel;
    private JTextField display;
    private JButton acButton;
    private JButton[] numbersButton;
    private String numbersOrder = "7894561230";
    private JButton logicButton[];
    private static final String[] LOGIC_SYMBOLS = {"+","-","*","/","="};

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout(10, 10));

        // Top Panel: 
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        display = new JTextField("0", 15);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        topPanel.add(display);
        acButton = new JButton("AC");
        topPanel.add(acButton);
        add(topPanel, BorderLayout.NORTH);

        // Numbers Panel: 
        numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(4, 3));
        numbersButton = new JButton[10];
        for (int i=0; i<numbersButton.length; i++) {
            numbersButton[i] = new JButton(numbersOrder.substring(i,i+1));
            numbersPanel.add(numbersButton[i]);
        }
        add(numbersPanel, BorderLayout.CENTER);

        // Logic Panel:
        logicPanel = new JPanel();
        logicPanel.setLayout(new GridLayout(5, 1));
        logicButton = new JButton[5];
        for (int j=0; j<logicButton.length; j++) {
            logicButton[j] = new JButton(LOGIC_SYMBOLS[j]);
            logicPanel.add(logicButton[j]);
        }
        add(logicPanel, BorderLayout.EAST);


        
    }
}
