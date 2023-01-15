package com.startjava.Lesson_2_3_4.guess;

public class Player {
    private String name;
    private int tries;
    private int[] attempts = new int[3];

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

    public int[] getAttempts(int length) {
        return Arrays.copyOf(attempts, length);
    }

    public void setAttempt(int index, int number) {
            attempts[index] = number;
    }

    public void fill(int number) {
        Arrays.fill(attempts , number);
    }
}