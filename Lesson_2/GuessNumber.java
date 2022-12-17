import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private Scanner scanner;
    private int secretNumber;
    private int playerNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        scanner = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Угадайте число от 0 до 100 " + secretNumber);
        while (true) {
            System.out.println(player1.getName() + " введите число : ");
            player1.setNumber(scanner.nextInt());
            playerNumber = player1.getNumber();
            if (playerNumber == secretNumber) {
                System.out.println(player1.getName() + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + secretNumber);
                return;
            } else if (playerNumber > secretNumber) {
                System.out.println(player1.getName() + ", число больше того," +
                        " что загадал компьютер");
            } else {
                System.out.println(player1.getName() + ", число меньше того," +
                        " что загадал компьютер");
            }

            System.out.println(player2.getName() + " введите число : ");
            player2.setNumber(scanner.nextInt());
            playerNumber = player2.getNumber();
            if (playerNumber == secretNumber) {
                System.out.println(player2.getName() + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + secretNumber);
                return;
            } else if (playerNumber > secretNumber) {
                System.out.println(player2.getName() + ", число больше того," +
                        " что загадал компьютер");
            } else {
                System.out.println(player2.getName() + ", число меньше того," +
                        " что загадал компьютер");
            }
        }
    }
}