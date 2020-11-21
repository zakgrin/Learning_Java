import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Choice myChoice = new Choice();
        myChoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myChoice.setSize(250, 150); // window size: width, hight.
        myChoice.setVisible(true); // to show at the screen.
        myChoice.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
