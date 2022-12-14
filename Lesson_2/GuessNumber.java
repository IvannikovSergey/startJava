import java.util.Scanner;

public class GuessNumber {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Player player1;
        Player player2;
        int guessNumber = -1;
        System.out.println("Имя первого игрока: ");
        player1 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: ");
        player2 = new Player(scanner.nextLine());
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
