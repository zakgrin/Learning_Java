import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class List extends JFrame {
    private JList colorList;
    private static final String[] colorNames = {"Orange",
                                                "Gray",
                                                "Green",
                                                "Yellow",
                                                "Blue",
                                                "Black"};
    private static final Color[] colors = {Color.ORANGE,
                                           Color.GRAY,
                                           Color.GREEN,
                                           Color.YELLOW,
                                           Color.BLUE,
                                           Color.BLACK};
    
    public List() {
        super("List");
        setLayout(new FlowLayout());
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane (colorList));
        colorList.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
            }
        });

    }

}
