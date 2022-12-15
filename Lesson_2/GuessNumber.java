import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = -1;
        int randomInt = (int) (Math.random() * 100);
        System.out.println("Угадайте число от 0 до 100 " + randomInt);
        while (guessNumber != randomInt) {
            System.out.println(player1.getName() + " введите число : ");
            int playerOneNumber = scanner.nextInt();
            if (playerOneNumber != randomInt) {
                if (playerOneNumber > randomInt) {
                    System.out.println(player1.getName() + ", число больше того," +
                            " что загадал компьютер");
                }
                if (playerOneNumber < randomInt) {
                    System.out.println(player1.getName() + ", число меньше того," +
                            " что загадал компьютер");
                }
            } else {
                System.out.println(player1.getName() + " Поздравляем, Вы угадали!!! " +
                        " Загаданное число: " + randomInt);
                break;
            }
            System.out.println(player2.getName() + " введите число : ");
            int playerTwoNumber = scanner.nextInt();
            if (playerTwoNumber != randomInt) {
                if (playerTwoNumber > randomInt) {
                    System.out.println(player2.getName() + ", число больше того, " +
                            "что загадал компьютер");
                }
                if (playerTwoNumber < randomInt) {
                    System.out.println(player2.getName() + ", число меньше того, " +
                            "что загадал компьютер");
                }
            } else {
                System.out.println(player2.getName() + " Поздравляем Вы угадали!!! " +
                        "Загаданное число: " + randomInt);
                break;
            }
        }
    }
}
