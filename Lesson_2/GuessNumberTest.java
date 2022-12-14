class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        String gameRestart = "yes";
        Scanner scanner = new Scanner(System.in);
        while (gameRestart.equals("yes")) {
            game.startGame();
            System.out.println("Хотите продолжить? yes/no");
            scanner = new Scanner(System.in);
            gameRestart = scanner.nextLine();
        }
        scanner.close();
    }
}