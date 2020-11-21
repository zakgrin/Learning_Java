import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CheckBox myCheckBox = new CheckBox();
        myCheckBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit the program once closed
        myCheckBox.setSize(250, 150); // window size: width, hight.
        myCheckBox.setVisible(true); // to show at the screen.
        myCheckBox.setLocationRelativeTo(null); // to show in the middle of the screen.
    }
}
