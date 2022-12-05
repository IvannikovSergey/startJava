public class GuessNumber {
    public static void main(String[] args) {
        int minRange = 0;
        int maxRange = 100;
        int guessNumber = 14;
        int playerNumber = 93;
        int attempts = 0;

        System.out.println("Загадано число от 0 до 100");
        if (playerNumber > 0 && playerNumber <= 100) {
            do {
                System.out.println("Пользователь вводит число: " + playerNumber);
                if (playerNumber < guessNumber) {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                    minRange = playerNumber;
                    playerNumber = (minRange + maxRange) / 2;
                } else if (playerNumber > guessNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                    maxRange = playerNumber;
                    playerNumber = (minRange + maxRange) / 2;
                }
                attempts++;
            } while (playerNumber != guessNumber);
            System.out.println("Вы победили!!! Попыток: " + attempts);
        } else {
            System.out.println("Неправильное число!!!  Введите число из диапазона 0 - 100");
        }
    }
}
