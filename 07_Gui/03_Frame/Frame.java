import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private JLabel titleLabel; 
    
    public Frame() {
        super("Our Frame"); 
        setLayout(new FlowLayout()); 
        titleLabel = new JLabel("This is the Java Learning path");
        add(titleLabel);
    }
}
