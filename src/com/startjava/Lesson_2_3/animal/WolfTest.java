package com.startjava.Lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("самец");
        wolf.setNickName("Котопес");
        wolf.setWeight(30);
        wolf.setAge(13);
        wolf.setBodyColor("серый");

        System.out.println("Пол волка: " + wolf.getSex() + "\nКличка: " +
                wolf.getNickName() + "\nВес: " + wolf.getWeight() +
                "\nВозраст: " + wolf.getAge() + "\nЦвет: " + wolf.getBodyColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}