import javax.swing.*;
import java.awt.*;

public class GridLayoutFrame extends JFrame {
    private JButton buttonsArray[];

    public GridLayoutFrame() {
        super("GridLayout");
        setLayout(new GridLayout(3, 3));
        buttonsArray = new JButton[9];

        for (int i=0; i<buttonsArray.length; i++) {
            buttonsArray[i] = new JButton("Button " + (i+1));
            add(buttonsArray[i]);
        }
    }
}
