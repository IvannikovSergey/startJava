package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                String input = scanner.nextLine();
                double mathResult = calculator.calculate(input);
                if (mathResult % 1 == 0.0) {
                    System.out.println((int) mathResult);
                } else {
                    System.out.println(mathResult);
                }
            }
            System.out.println("Хотите продолжить? yes/no");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }
}