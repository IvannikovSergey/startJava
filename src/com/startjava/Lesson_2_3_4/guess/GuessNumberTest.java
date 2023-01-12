package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.println("\nХотите продолжить? yes/no");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }
}