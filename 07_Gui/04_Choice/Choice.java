import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Choice extends JFrame {
    private JLabel textLabel;
    private JRadioButton blackButton;
    private JRadioButton greenButton;
    private JRadioButton redButton;
    private JRadioButton blueButton;
    private ButtonGroup buttonGroup;

    public Choice() {
        super("Choice");
        setLayout(new FlowLayout());
        textLabel = new JLabel("You are welcome to the program");
        add(textLabel);
        // Buttons:
        blackButton = new JRadioButton("Black", true);
        blackButton.setForeground(Color.BLACK);
        add(blackButton);
        greenButton = new JRadioButton("Green", false);
        greenButton.setForeground(Color.GREEN);
        add(greenButton);
        redButton = new JRadioButton("Red", false);
        redButton.setForeground(Color.RED);
        add(redButton);
        blueButton = new JRadioButton("Blue", false);
        blueButton.setForeground(Color.BLUE);
        add(blueButton);
        // As a Group:
        buttonGroup = new ButtonGroup();
        buttonGroup.add(blackButton);
        buttonGroup.add(greenButton);
        buttonGroup.add(redButton);
        buttonGroup.add(blueButton);

        blackButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textLabel.setForeground(Color.BLACK);
            }
        });
        greenButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textLabel.setForeground(Color.GREEN);
            }
        });
        redButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textLabel.setForeground(Color.RED);
            }
        });
        blueButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textLabel.setForeground(Color.BLUE);
            }
        });
    }
}