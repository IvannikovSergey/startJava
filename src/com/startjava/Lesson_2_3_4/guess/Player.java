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

    public void setAttempt(int number) {
        attempts[tries] = number;
    }

    public void fill() {
        Arrays.fill(attempts, 0);
    }

    public int compareAttempts() {
        return attempts[tries - 1];
    }
}