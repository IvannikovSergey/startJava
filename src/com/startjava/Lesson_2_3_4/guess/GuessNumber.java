package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scanner = new Scanner(System.in);

    public void start() {
        player1.fill(0);
        player1.setTries(0);
        player2.fill(0);
        player2.setTries(0);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attemptsLimit = 3;
        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        System.out.println("У каждого игрока " + attemptsLimit + " попыток");
        while (attemptsLimit != 0) {
            int playerNumber = inputNumber(player1);
            player1.setAttempt(player1.getTries(), playerNumber);
            if (compareNumbers(player1, secretNumber)) {
                player1.setTries(player1.getTries() + 1);
                break;
            }
            player1.setTries(player1.getTries() + 1);
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            playerNumber = inputNumber(player2);
            player2.setAttempt(player2.getTries(), playerNumber);
            if (compareNumbers(player2, secretNumber)) {
                player2.setTries(player2.getTries() + 1);
                break;
            }
            player2.setTries(player2.getTries() + 1);
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            attemptsLimit--;
        }
        System.out.print("Введенные числа игрока " + player1.getName() + " являются: ");
        printArray((player1.getAttempts(player1.getTries())));
        System.out.print("\nВведенные числа игрока " + player2.getName() + " являются: ");
        printArray((player2.getAttempts(player2.getTries())));
    }

    private int inputNumber(Player player) {
        String name = player.getName();
        System.out.print(name + " введите число : ");
        return scanner.nextInt();
    }

    private boolean compareNumbers(Player player, int secretNumber) {
        if (player.getAttempts(3)[player.getTries()] == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                " с " + (player.getTries() + 1) + " попытки");
            return true;
        }
        System.out.println(player.getName() + ", число " +
            (player.getAttempts(3)[player.getTries()] > secretNumber ? " больше " : " меньше ") +
            "того," +
            " что загадал компьютер");
        return false;
    }

    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}