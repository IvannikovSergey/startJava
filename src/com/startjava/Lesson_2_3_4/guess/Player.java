// package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[3];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts(int length) {
        return Arrays.copyOf(attempts, length);
    }

    public void setAttempt(int index, int number) {
        attempts[index] = number;
    }
}