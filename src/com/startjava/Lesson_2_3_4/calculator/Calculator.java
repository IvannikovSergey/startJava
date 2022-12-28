package com.startjava.Lesson_2_3.calculator;

public class Calculator {
    public double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на ноль невозможно");
                }
                return num1 / num2;
            case '^':
                double result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Неправильный знак операции");
        }
        return .0;
    }
}