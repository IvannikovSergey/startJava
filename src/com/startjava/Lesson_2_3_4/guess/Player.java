package com.startjava.Lesson_2_3_4.guess;

public class Player {
    private String name;
    private int tries;
    private int[] attempts = new int[10];

    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, tries);
    }

    public boolean addAttempt(int number) {
        if (number > 0 && number <= 100) {
            attempts[tries - 1] = number;
            return true;
        }
        return false;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void fill() {
        Arrays.fill(attempts, 0, tries, 0);
    }

    public int getAttempt() {
        return attempts[tries - 1];
    }
}