import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame myFrame = new Frame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myFrame.setSize(250, 150); // window size: width, hight.
        myFrame.setVisible(true); // to show at the screen.
        myFrame.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
