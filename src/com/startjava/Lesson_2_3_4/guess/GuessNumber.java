package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private String[] winners = new String[3];
    Scanner scanner = new Scanner(System.in);

    private int round;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start(int attemptsLimit) {
        System.out.println("Победитель в игре определяется по итогам 3-х раундов");
        System.out.println("У каждого игрока " + attemptsLimit + " попыток");
        round = 1;
        while (round <= 3) {
            System.out.println("Раунд №:" + round);
            int secretNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Угадайте число от 0 до 100 " + secretNumber);
            for (Player player : players) {
                player.fill();
                player.setTries(0);
            }
            while (attemptsLimit != 0) {
                boolean isWin = false;
                for (Player player : players) {
                    player.setTries(player.getTries() + 1);
                    inputAttempt(player);
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
            printPlayersAttempts();
            round++;
        }
        getWinner(winners);
    }

    private void inputAttempt(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число : ");
        while (true) {
            int playerNumber = scanner.nextInt();
            if (player.addAttempt(playerNumber)) {
                break;
            }
            System.out.println("Число должно быть в диапазоне от 0 до 100 включительно!!!");
            System.out.print("Игрок " + player.getName() + " введите число еще раз: ");
        }
    }

    private boolean compareNumbers(Player player, int secretNumber) {
        if (player.getAttempt() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                    " с " + (player.getTries()) + " попытки");
            System.out.println("В раунде №" + round + " выиграл игрок с именем " + player.getName());
            winners[round - 1] = player.getName();
            return true;
        }
        System.out.println(player.getName() + ", число " +
                (player.getAttempt() > secretNumber ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        return false;
    }

    private void printPlayersAttempts() {
        for (Player player : players) {
            System.out.print("Введенные числа игрока " + player.getName() + " являются: ");
            for (int attempt : player.getAttempts()) {
                System.out.printf("%-2d ", attempt);
            }
            System.out.println();
        }
    }

    private void getWinner(String[] winners) {
        String[] uniqueWinners = new String[winners.length];
        int[] countsWin = new int[winners.length];
        int count = 0;
        for (int i = 0; i < winners.length; i++) {
            String winner = winners[i];
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (uniqueWinners[j].equals(winner)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                int someNumber = 1;
                for (int j = i + 1; j < winners.length; j++) {
                    if (winner.equals(winners[j])) {
                        someNumber++;
                    }
                }
                uniqueWinners[count] = winner;
                countsWin[count] = someNumber;
                count++;
            }
        }
        int maxNumber = -1;
        int maxIndex = 0;
        boolean drow = false;
        for (int i = 0; i < countsWin.length; i++) {
            if (maxNumber <= countsWin[i]) {
                maxNumber = countsWin[i];
                maxIndex = i;
            }
            if (countsWin[i] == maxNumber) {
                drow = true;
            }
        }
        System.out.println(drow ? "Ничья!!!" : "Победил игрок с именем: " + uniqueWinners[maxIndex]);
    }
}