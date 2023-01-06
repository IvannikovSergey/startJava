package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        
        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String[] mathArray = scanner.nextLine().split(" ");

            double firstNum = Integer.parseInt(mathArray[0]);
            calculator.setFirstNum(firstNum);

            char sign = mathArray[1].charAt(0);
            calculator.setMathOperator(sign);

            double secondNum = Integer.parseInt(mathArray[2]);
            calculator.setSecondNum(secondNum);

            double mathResult = calculator.calculate();

            if (mathResult - Math.floor(mathResult) == 0.0) {
                System.out.println((int) mathResult);
            } else {
                System.out.println(mathResult);
            }
            String replay = "Хотите продолжить? yes/no";
            System.out.println(replay);
            answer = scanner.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println(replay);
                answer = scanner.nextLine();
            }
        }
        scanner.close();
    }
}