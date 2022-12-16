import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = -1;
        int secretNum = (int) (Math.random() * 100) + 1;
        
        System.out.println("Угадайте число от 0 до 100 ");
        while (guessNumber != secretNum) {
            System.out.println(player1.getName() + " введите число : ");
            player1.setNumber(scanner.nextInt());
            int playerOneNumber = player1.getNumber();
            if (playerOneNumber != secretNum) {
                if (playerOneNumber > secretNum) {
                    System.out.println(player1.getName() + ", число больше того," +
                            " что загадал компьютер");
                }
                if (playerOneNumber < secretNum) {
                    System.out.println(player1.getName() + ", число меньше того," +
                            " что загадал компьютер");
                }
            } else {
                System.out.println(player1.getName() + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + secretNum);
                break;
            }

            System.out.println(player2.getName() + " введите число : ");
            player2.setNumber(scanner.nextInt());
            int playerTwoNumber = player2.getNumber();
            if (playerTwoNumber != secretNum) {
                if (playerTwoNumber > secretNum) {
                    System.out.println(player2.getName() + ", число больше того, " +
                            "что загадал компьютер");
                }
                if (playerTwoNumber < secretNum) {
                    System.out.println(player2.getName() + ", число меньше того, " +
                            "что загадал компьютер");
                }
            } else {
                System.out.println(player2.getName() + " Поздравляем Вы угадали!!! " +
                        "Загаданное число: " + secretNum);
                break;
            }
        }
    }
}