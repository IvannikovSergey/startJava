package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            Calculator calculator = new Calculator();
            System.out.println("Введите первое число:");
            double firstNum = scanner.nextDouble();
            System.out.println("Введите знак математической операции:");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            double secondNum = scanner.nextDouble();
            System.out.println("Результат: " + calculator.calculate(firstNum, secondNum, sign));
            do {
                System.out.println("Хотите продолжить? yes/no");
                scanner.nextLine();
                answer = scanner.nextLine();
            }
            while (!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();
    }
}