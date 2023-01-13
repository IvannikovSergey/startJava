// package com.startjava.Lesson_2_3_4.guess;

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
        int attemptsLimit = 3;
        int playerOneAttempts = 0;
        int playerTwoAttempts = 0;
        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        System.out.println("У каждого игрока " + attemptsLimit + " попыток");
        while (attemptsLimit != 0) {
            makeUserName(player1);
            int playerNumber = makeUserNumber();
            player1.setAttempt(playerOneAttempts, playerNumber);
            playerOneAttempts++;
            boolean win = compareNumbers(player1, playerNumber,
                    secretNumber, playerOneAttempts);
            if (win) {
                break;
            }
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            makeUserName(player2);
            playerNumber = makeUserNumber();
            player2.setAttempt(playerTwoAttempts, playerNumber);
            playerTwoAttempts++;
            win = compareNumbers(player2, playerNumber,
                    secretNumber, playerOneAttempts);
            if (win) {
                break;
            }
            if (attemptsLimit == 1) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            attemptsLimit--;
        }
        System.out.print("Введённые числа игрока " + player1.getName() + " являются: ");
        printArray((player1.getAttempts(playerOneAttempts)));
        System.out.print("\nВведённые числа игрока " + player2.getName() + " являются: ");
        printArray((player2.getAttempts(playerTwoAttempts)));
    }

    private void makeUserName(Player player) {
        String name = player.getName();
        System.out.print(name + " введите число : ");
    }

    private int makeUserNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean compareNumbers(Player player, int playerNumber,
                                   int secretNumber, int playerAttempt) {
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                    " с " + playerAttempt + " попытки");
            return true;
        }
        System.out.println(player.getName() + ", число " + (playerNumber > secretNumber ? " больше " : " меньше ") + "того," +
                " что загадал компьютер");
        return false;
    }

    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}