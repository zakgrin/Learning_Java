import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(380, 400);
        calculator.setLocationRelativeTo(null);    
        calculator.setVisible(true);
    }
}
