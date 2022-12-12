import java.util.Scanner;

public class Calculator {
    public double calculation(double num1, double num2, char operator) {
        double result = 1;
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
                result = num1 / num2;
                if (num2 == 0) {
                    System.out.println("Деление на ноль невозможно");
                    return result;
                }
                break;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Неправильный знак операции");
                break;
        }
        return result;
    }
}