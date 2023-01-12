package com.startjava.Lesson_2_3_4.guess;

public class Player {
    private String name;
    private int number;
    private int[] playersArray;

    public Player(int size) {
        playersArray = new int[size];
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int[] getPlayersArray() {
        return playersArray;
    }

    public void setPlayersArray(int index, int number) {
            this.playersArray[index] = number;
    }
}