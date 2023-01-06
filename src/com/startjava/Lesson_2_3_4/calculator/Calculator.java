package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private String[] mathArray;

    public void setMathArray(String[] mathArray) {
        this.mathArray = mathArray;
    }

    public double calculate() {
        double num1 = Integer.parseInt(mathArray[0]);
        char mathOperator = mathArray[1].charAt(0);
        double num2 = Integer.parseInt(mathArray[2]);

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