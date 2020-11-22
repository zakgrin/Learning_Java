import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BorderLayoutFrame myBorderLayoutFrame = new BorderLayoutFrame();
        myBorderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myBorderLayoutFrame.setSize(300, 300); // window size: width, hight.
        myBorderLayoutFrame.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // for Arabic we need RIGHT_TO_LEFT
        myBorderLayoutFrame.setVisible(true); // to show at the screen.
        myBorderLayoutFrame.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
