package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String input) {
        String[] expression = input.split(" ");
        double num1 = Integer.parseInt(expression[0]);
        char mathOperator = expression[1].charAt(0);
        double num2 = Integer.parseInt(expression[2]);

        return switch (mathOperator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Деление на ноль невозможно");
                }
                yield num1 / num2;
            }
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> throw new NumberFormatException("Неправильный знак операции");
        };
    }
}