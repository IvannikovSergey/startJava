public class IfElseStatementTheme {
    public static void main(String[] args) {        
        System.out.println("№-1 Перевод псевдокода на язык Java");
        int age = 18;
        boolean isMale = true;
        double height = 1.90;
        if (age > 20) {
            System.out.println("Вы допущены");
        } else {
            System.out.println("Вы не допущены");
        }

        if (!isMale) {
            System.out.println("Вам сюда нельзя");
        } else {
            System.out.println("Проходите");
        }

        if (height < 1.80) {
            System.out.println("Низкий рост");
        } else {
            System.out.println("Высокий рос");
        }

        char firstLetterOfName = "Mikhail".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Иди налево");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Иди направо");
        } else {
            System.out.println("Иди прямо");
        }

        System.out.println("\n№-2 Поиск max и min числа");
        int num1 = 30;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("max: " + num1 + " min: " + num2);
        } else if (num1 < num2) {
            System.out.println("max: " + num2 + " min: " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n№-3 Проверка числа");
        int srcNum = -24;

        if (srcNum > 0) {
            if (srcNum % 2 == 0) {
                System.out.println("Число " + srcNum + " положительное четное");
            } else {
                System.out.println("Число " + srcNum + " положительное нечетное");
            }
        } else if (srcNum < 0){
            if (srcNum % 2 == 0) {
                System.out.println("Число " + srcNum + " отрицательное четное");
            } else {
                System.out.println("Число " + srcNum + " отрицательное нечетное");
            }
        } else {
            System.out.println("Число является 0");
        }

        System.out.println("\n№-4 Поиск одинаковых цифр в числах");
        int num3 = 123;
        int num4 = 153;

        System.out.println("Исходные числа: " + num3 + " " + num4);
        if ((num3 / 100) == (num4 / 100)) {
            System.out.println("Одинаковые цифры: " + num3 / 100 + " разряд сотые" );
        }
        if ((num3 / 10) % 10 == (num4 / 10) % 10) {
            System.out.println("Одинаковые цифры: " + (num3 / 10) % 10 + " разряд десятые" );
        }
        if ((num3 % 10) == (num4 % 10)) {
            System.out.println("Одинаковые цифры: " + num3 % 10 + " разряд единиц" );
        } else {
            System.out.println("Нет одинаковых цифр");
        }

        System.out.println("\n№-5 Определение символа по его коду");
        char someChar = '\u0057';

        if (someChar >= 'A' && someChar <= 'W') {
        System.out.println(someChar + " Большая буква");
        } else if (someChar >= 'a' && someChar <= 'w'){
            System.out.println(someChar + " Это маленькая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n№-6 Подсчет суммы вклада и начисленных банком %");
        int account = 300_000;
        double persentSum = 0.0;

        if (account <= 100_000) {
            persentSum = account * 0.05;
        } else if (account > 100_000 && account <= 300_000) {
            persentSum = account * 0.07;
        } else if (account > 300_000) {
            persentSum = account * 0.1;
        }
        System.out.println("Сумма вклада: " + account);
        System.out.println("Начисленный процент: " + persentSum);
        System.out.println("Итоговая сумма: " + (account + persentSum));

        System.out.println("\n№-7 Определение оценки по предметам");
        int historyScore = 99;
        int programmingScore = 63;
        int historyGrade = 1;
        int programmingGrade = 1;
        
        if (historyScore <= 60) {
            historyGrade = 2;
        } else if (historyScore > 60 && historyScore <= 73) {
            historyGrade = 3;
        } else if (historyScore > 73 && historyScore <= 91) {
            historyGrade = 4;
        } else if (historyScore > 91) {
            historyGrade = 5;
        }
        if (programmingScore <= 60) {
            programmingGrade = 2;
        } else if (programmingScore > 60 && programmingScore <= 73) {
            programmingGrade = 3;
        } else if (historyScore > 73 && historyScore <= 91) {
            programmingGrade = 4;
        } else if (historyScore > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - История" );
        System.out.println(programmingGrade + " - Программирование");
        System.out.println("Средняя оценка: " + (historyGrade + programmingGrade) / 2);
        System.out.println("Средний процент по предметам: " + (historyScore + programmingScore) / 2 + "%");


        System.out.println("\n№-8 Расчет прибыли за год");

        int rentCost = 5_000;
        int income = 13_000;
        int costPrice = 9_000;
        int profit = (income - costPrice - rentCost) * 12;

        if (profit > 0) {
            System.out.println("Прибыль за год: " + "+" + profit + " руб.");
        } else {
            System.out.println(profit + " руб.");
        }

        System.out.println("\n№-9 Подсчет количества банкнот");
        int exchangeSum = 567;
        int amountDecimalBanknote = 5;
        int hundred = exchangeSum / 100;
        int decimal = (exchangeSum / 10) % 10;
        int single = exchangeSum % 10;

        if (decimal > amountDecimalBanknote) {
            single += 10 * (decimal - amountDecimalBanknote);
            decimal -= (decimal - amountDecimalBanknote);
        }
        exchangeSum = 100 * hundred + 10 * decimal + single;
        System.out.println("Номиналы банкнот: " + "100USD - " + hundred + 
                    "; 10USD - " + decimal + "; 1USD - " + single);
        System.out.println("Сумма выдачи: " + exchangeSum);
    }
}