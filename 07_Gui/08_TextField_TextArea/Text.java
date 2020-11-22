import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Text extends JFrame {
    private JLabel name, age, bio;
    private JTextField nameTextField, ageTextField;
    private JTextArea bioTextArea;
    private JButton registerButton;
    private String fullBio;

    
    public Text() {
        super("Text");
        setLayout(new FlowLayout());
        
        name = new JLabel("Name");
        age = new JLabel("Age");
        bio = new JLabel("About You");

        nameTextField = new JTextField(20);
        ageTextField = new JTextField(20);
        bioTextArea = new JTextArea(10, 15);
        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fullBio =   "Name: " + nameTextField.getText() + "\n" + 
                            "Age: " + ageTextField.getText() + "\n" + 
                            "About: " + bioTextArea.getText();
                JOptionPane.showMessageDialog(  null, 
                                                fullBio,
                                                "Information", 
                                                JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(name);
        add(nameTextField);
        add(age);
        add(ageTextField);
        add(bio);
        add(new JScrollPane(bioTextArea));
        add(registerButton);
    }
}
