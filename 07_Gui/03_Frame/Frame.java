import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    private JLabel titleLabel; 
    private JLabel imageLabel;
    private JButton welcomeButton;

    public Frame() {
        super("Our Frame"); // this is the title of the frame
        setLayout(new FlowLayout()); // this puts elements in one row from left to right
        // label: 
        titleLabel = new JLabel("This is the Java Learning path");
        add(titleLabel);
        // image:         
        Icon image = new ImageIcon(getClass().getResource("img/brain.jpg"));
        imageLabel = new JLabel();
        imageLabel.setIcon(image);
        add(imageLabel);
        // button: 
        welcomeButton = new JButton("Welcome");
        add(welcomeButton);
        welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Frame.this, 
                                              "you are welcome", 
                                              "welcome message", 
                                              JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
