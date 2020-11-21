import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBox extends JFrame {
    private JLabel textLabel;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;

    public CheckBox() {
        super("CheckBox");
        setLayout(new FlowLayout());
        
        textLabel = new JLabel("You are welcome in our program");
        add(textLabel);

        boldCheckBox = new JCheckBox("Bold Font");
        add(boldCheckBox);

        italicCheckBox = new JCheckBox("Italic Font");
        add(italicCheckBox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldCheckBox.addItemListener(handler);
        italicCheckBox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (boldCheckBox.isSelected() && italicCheckBox.isSelected())
                textLabel.setFont(textLabel.getFont().deriveFont(Font.BOLD + Font.ITALIC));
            else if (boldCheckBox.isSelected())
                textLabel.setFont(textLabel.getFont().deriveFont(Font.BOLD));
            else if (italicCheckBox.isSelected())
                textLabel.setFont(textLabel.getFont().deriveFont(Font.ITALIC));
            else 
                textLabel.setFont(textLabel.getFont().deriveFont(Font.PLAIN));
        }
    }
}
