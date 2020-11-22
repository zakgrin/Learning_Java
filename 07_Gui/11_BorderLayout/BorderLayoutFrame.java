import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {
    private JButton northButton, centerButton, southButton, eastButton, westButton;


    public BorderLayoutFrame() {
        super("BorderLayout");
        setLayout(new BorderLayout());
        northButton = new JButton("North");
        centerButton = new JButton("Center");
        southButton = new JButton("South");
        eastButton = new JButton("East");
        westButton = new JButton("West");

        add(northButton, BorderLayout.NORTH);
        add(centerButton, BorderLayout.CENTER);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);

    }
    
}
