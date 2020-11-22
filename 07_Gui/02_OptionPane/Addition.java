import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        // Inputs: 
        String firstNumber = JOptionPane.showInputDialog("Enter the first number");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number");
        // Change input from string to integer: 
        Integer number1 = Integer.parseInt(firstNumber);
        Integer number2 = Integer.parseInt(secondNumber);
        // Calc sum: 
        Integer sum = number1 + number2; 
        System.out.println(sum);

        // But how can we show a window for the result!
        JOptionPane.showMessageDialog(null, // because we do not have any other container
                                    "sum: " + sum, 
                                    "Addition", 
                                    JOptionPane.PLAIN_MESSAGE); // message type
                                    /*
                                    Main types of messages:
                                    ERROR_MESSAGE
                                    INFORMATION_MESSAGE
                                    WARNING_MESSAGE
                                    QUESTION_MESSAGE
                                    PLAIN_MESSAGE
                                    */ 
         
    }
}
