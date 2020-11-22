import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myList.setSize(550, 350); // window size: width, hight.
        myList.setVisible(true); // to show at the screen.
        myList.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}