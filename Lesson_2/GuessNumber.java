import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private Scanner scanner;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        scanner = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100) + 1;
        
        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        while (true) {
            String name = player1.getName();
            System.out.println(name + " введите число : ");
            player1.setNumber(scanner.nextInt());
            int playerNumber = player1.getNumber();
            if (playerNumber == secretNumber) {
                System.out.println(name + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + secretNumber);
                return;
            }
            if (playerNumber > secretNumber) {
                System.out.println(name + ", число больше того," +
                        " что загадал компьютер");
            } else {
                System.out.println(name + ", число меньше того," +
                        " что загадал компьютер");
            }

            name = player2.getName();
            System.out.println(name + " введите число : ");
            player2.setNumber(scanner.nextInt());
            playerNumber = player2.getNumber();
            if (playerNumber == secretNumber) {
                System.out.println(name + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + secretNumber);
                return;
            }
            if (playerNumber > secretNumber) {
                System.out.println(name + ", число больше того," +
                        " что загадал компьютер");
            } else {
                System.out.println(name + ", число меньше того," +
                        " что загадал компьютер");
            }
        }
    }
}