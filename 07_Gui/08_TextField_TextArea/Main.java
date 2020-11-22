import java.awt.ComponentOrientation;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text();
        myText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myText.setSize(300, 300); // window size: width, hight.
        myText.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // for Arabic we need RIGHT_TO_LEFT
        myText.setVisible(true); // to show at the screen.
        myText.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
