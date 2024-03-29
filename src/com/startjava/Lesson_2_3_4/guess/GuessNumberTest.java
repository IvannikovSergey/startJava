package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {
    private static final int ATTEMPTS_LIMIT = 10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            String position = switch (i) {
                case 0 -> position = "первого";
                case 1 -> position = "второго";
                case 2 -> position = "третьего";
                default -> throw new IllegalStateException("Unexpected value: " + i);
            };
            System.out.println("Имя " + position + " игрока: ");
            players[i] = new Player("p" + (i + 1));
        }

        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.start(ATTEMPTS_LIMIT);
            }
            System.out.println("\nХотите продолжить? yes/no");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }
}