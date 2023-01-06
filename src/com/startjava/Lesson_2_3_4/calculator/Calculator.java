package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private double firstNum;
    private double secondNum;
    private char mathOperator;

    public double setFirstNum(double firstNum) {
        this.firstNum = firstNum;
        return firstNum;
    }

    public double setSecondNum(double secondNum) {
        this.secondNum = secondNum;
        return secondNum;
    }

    public char setMathOperator(char mathOperator) {
        this.mathOperator = mathOperator;
        return mathOperator;
    }

    public double calculate() {
        switch (mathOperator) {
            case '+' -> {
                return firstNum + secondNum;
            }
            case '-' -> {
                return firstNum - secondNum;
            }
            case '*' -> {
                return firstNum * secondNum;
            }
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("Деление на ноль невозможно");
                }
            }
            case '^' -> {
                return Math.pow(firstNum, secondNum);
            }
            case '%' -> {
                return firstNum % secondNum;
            }
            default -> System.out.println("Неправильный знак операции");
        }
        return .0;
    }
}