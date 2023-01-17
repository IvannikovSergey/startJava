package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start(int attemptsLimit) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        System.out.println("У каждого игрока " + attemptsLimit + " попыток");
        for (Player player : players) {
            player.fill();
            player.setTries(0);
        }
        while (attemptsLimit != 0) {
            boolean isWin = false;
            for (Player player : players) {
                inputAttempt(player);
                player.setTries(player.getTries() + 1);
                if (compareNumbers(player, secretNumber)) {
                    isWin = true;
                    break;
                }
                if (attemptsLimit == 1) {
                    System.out.println("У игрока " + player.getName() + " закончились попытки");
                }
            }
            attemptsLimit--;
            if (isWin) {
                break;
            }
        }
        for (Player player : players) {
            System.out.print("Введенные числа игрока " + player.getName() + " являются: ");
            printPlayerAttempts((player.getAttempts()));
            System.out.println();
        }
    }

    private void inputAttempt(Player player) {
        System.out.print(player.getName() + " введите число : ");
        int playerNumber;
        while (true) {
            playerNumber = scanner.nextInt();
            if (playerNumber > 0 && playerNumber <= 100) {
                break;
            }
            System.out.println(player.getName() + " введите число в интервале от 0 до 100 включительно: ");
        }
        player.setAttempt(playerNumber);
    }

    private boolean compareNumbers(Player player, int secretNumber) {
        if (player.compareAttempts() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                    " с " + (player.getTries()) + " попытки");
            return true;
        }
        System.out.println(player.getName() + ", число " +
                (player.compareAttempts() > secretNumber ? " больше " : " меньше ") +
                "того," +
                " что загадал компьютер");
        return false;
    }

    private void printPlayerAttempts(int[] attempts) {
        for (int attempt : attempts) {
            System.out.printf("%-2d ", attempt);
        }
    }
}