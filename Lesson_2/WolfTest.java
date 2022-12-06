package Lesson_2;
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "самец";
        wolf.nickName = "Котопёс";
        wolf.weight = 30;
        wolf.age = 14;
        wolf.bodyColor = "серый";

        System.out.println("Пол волка: " + wolf.sex + "\nКличка: " + wolf.nickName + "\nВес: " + wolf.weight +
                "\nВозраст: " + wolf.age + "\nЦвет: " + wolf.bodyColor);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunting();
    }
}