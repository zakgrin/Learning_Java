import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GridLayoutFrame myGridLayoutFrame = new GridLayoutFrame();
        myGridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myGridLayoutFrame.setSize(300, 300); // window size: width, hight.
        myGridLayoutFrame.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // for Arabic we need RIGHT_TO_LEFT
        myGridLayoutFrame.setVisible(true); // to show at the screen.
        myGridLayoutFrame.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
