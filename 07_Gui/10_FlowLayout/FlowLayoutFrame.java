import javax.swing.*;
import java.awt.*;

public class FlowLayoutFrame extends JFrame {
    private Icon image;
    private JLabel label;

    public FlowLayoutFrame() {
        super("FlowLayout");
        setLayout(new FlowLayout());
        image = new ImageIcon(new ImageIcon("img/python.png").getImage().getScaledInstance(40, 
                                                                            40, 
                                                                            Image.SCALE_DEFAULT));
        for (int i=0; i<10; i++) {
            label = new JLabel(image);
            add(label);
        }
    }
    
}
