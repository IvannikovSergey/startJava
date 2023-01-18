package com.startjava.Lesson_2_3_4.guess;

public class Player {
    private String name;
    private int tries;
    private int[] attempts = new int[10];

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

    public void addAttempt(int number) {
        if (number > 0 && number <= 100) {
            attempts[tries - 1] = number;
        }
    }

    public void fill() {
        Arrays.fill(attempts, 0, tries, 0);
    }

    public int returnPlayerAttempt() {
        return attempts[tries - 1];
    }
}