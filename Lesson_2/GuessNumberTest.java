import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        System.out.println("Имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        while (answer.equals("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Хотите продолжить? yes/no");
                answer = scanner.nextLine();
            }
            while (!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();
    }
}