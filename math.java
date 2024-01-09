import javax.swing.JOptionPane;
import java.util.Scanner;

public class math {

    public static void main(String[] args) {

        double num1, num2, result;
        char operator;

        try {
            String input = JOptionPane.showInputDialog("Enter the first number: ");
            num1 = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Enter the operator (+, -, *, /): ");
            operator = input.charAt(0);

            input = JOptionPane.showInputDialog("Enter the second number: ");
            num2 = Double.parseDouble(input);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
             

                    } else {
                        JOptionPane.showMessageDialog(null, "Error! Dividing by zero is not allowed.");
                        return;
                    }
                    break;

                // operator doesn't match any case constant (+, -, *, /)
                default:
                    JOptionPane.showMessageDialog(null, "Error! Invalid operator. Please enter +, -, *, or /.");
                    return;
            }

            JOptionPane.showMessageDialog(null, String.format("The result of %.2f %c %.2f is: %.2f", num1, operator, num2, result));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error! Invalid input. Please enter a number.");
        }
    }
}