class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1;
        Player player2;
        System.out.println("Имя первого игрока: ");
        player1 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: ");
        player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String gameRestart = "yes";

        while (gameRestart.equals("yes")) {
            game.startGame();
            System.out.println("Хотите продолжить? yes/no");
            scanner = new Scanner(System.in);
            gameRestart = scanner.nextLine();
        }
        scanner.close();
    }
}