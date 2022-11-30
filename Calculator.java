public class Calculator {
    public static void main(String[] args) {
        char sign = '*';
        double firstNum = 10;
        double secondNum = 5;
        double result = 1;

        if (sign == '+') {
            result = firstNum + secondNum;
        } else if (sign == '-') {
            result = firstNum - secondNum;
        } else if (sign == '*') {
            result = firstNum * secondNum;
        } else if (sign == '/') {
            if (secondNum == 0) {
                System.out.println("Деление на ноль невозможно");
                return;
            } else {
                result = firstNum / secondNum;
            }
        } else if (sign == '^') {
            for (int i = 1; i <= secondNum; i++) {
                result *= firstNum;
            }
        } else if (sign == '%') {
            result = firstNum % secondNum;
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
    }
}