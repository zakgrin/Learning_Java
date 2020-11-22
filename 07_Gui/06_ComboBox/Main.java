import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ComboBox myComboBox = new ComboBox();
        myComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myComboBox.setSize(250, 150); // window size: width, hight.
        myComboBox.setVisible(true); // to show at the screen.
        myComboBox.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}