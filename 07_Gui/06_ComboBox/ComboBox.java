import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBox extends JFrame {
    private JLabel textLabel;
    private JLabel imageLabel;
    private JComboBox comboBox;
    private String[] iconNames = {"Java", "C++", "Python"};
    private Icon[] icons = {
        new ImageIcon(getClass().getResource("img/java.png")),
        new ImageIcon(getClass().getResource("img/c++.png")),
        new ImageIcon(getClass().getResource("img/python.png"))
    };
    
    public ComboBox() {
        super("ComboBox");
        setLayout(new FlowLayout());
        // Label:
        textLabel = new JLabel("Please select a programming language:");
        add(textLabel);
        // ComboBox:
        comboBox = new JComboBox(iconNames);
        comboBox.setMaximumRowCount(3);
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    imageLabel.setIcon(icons[comboBox.getSelectedIndex()]);
                }
            }
        });
        add(comboBox);
        // ImageLabel: 
        imageLabel = new JLabel(icons[0]);
        add(imageLabel);


    }
}
