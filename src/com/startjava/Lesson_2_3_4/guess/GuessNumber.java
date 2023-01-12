package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int playerOneAttempts = 0;
        int playerTwoAttempts = 0;
        int attemptsLimit = 10;
        Player playerOneArray = new Player(attemptsLimit);
        Player playerTwoArray = new Player(attemptsLimit);
        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        System.out.println("У каждого игрока " + attemptsLimit + " попыток");

        while (attemptsLimit != 0) {
            getData(player1);
            playerOneArray.setPlayersArray(playerOneAttempts, player1.getNumber());
            playerOneAttempts++;
            boolean win = compareNumbers(player1, player1.getNumber(),
                secretNumber, playerOneAttempts);
            if (win) {
                break;
            }
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            getData(player2);
            playerTwoArray.setPlayersArray(playerTwoAttempts, player2.getNumber());
            playerTwoAttempts++;
            win = compareNumbers(player2, player2.getNumber(), secretNumber, playerTwoAttempts);
            if (win) {
                break;
            }
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            attemptsLimit--;
        }
        System.out.print("Введеные числа игрока " + player1.getName() + " являются: ");
        printArray(sort(playerOneArray.getPlayersArray(), playerOneAttempts));
        System.out.print("\nВведеные числа игрока " + player2.getName() + " являются: ");
        printArray(sort(playerTwoArray.getPlayersArray(), playerTwoAttempts));
    }

    public void getData(Player player) {
        String name = player.getName();
        System.out.print(name + " введите число : ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt());
    }
    public boolean compareNumbers(Player player, int playerNumber,
            int secretNumber, int playerAttempt) {
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                    " с " + playerAttempt + " попытки");
            return true;
        }
        if (playerNumber > secretNumber) {
            System.out.println(player.getName() + ", число больше того," +
                    " что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", число меньше того," +
                    " что загадал компьютер");
        }
        return false;
    }

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public int[] sort(int[] array, int length) {
        return Arrays.copyOf(array, length);
    }
}