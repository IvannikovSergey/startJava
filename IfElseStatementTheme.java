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
            System.out.println("Иди налево\n");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Иди направо\n");
        } else {
            System.out.println("Иди прямо\n");
        }

        System.out.println("№-2 Поиск max и min числа");
        int num1 = 30;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("max: " + num1 + " min: " + num2);
        } else if (num1 < num2) {
            System.out.println("max: " + num2 + " min: " + num1);
        } else {
            System.out.println("Числа равны");
        }
        System.out.println("");

        System.out.println("№-3 Проверка числа");
        int srcNum = -23;

        if (srcNum != 0) {
            if (srcNum > 0) {
                if (srcNum % 2 == 0) {
                    System.out.println("Число " + srcNum +" положительное четное");
                } else {
                    System.out.println("Число " + srcNum + " положительное нечетное");
                }
            } else {
                if (srcNum % 2 == 0) {
                    System.out.println("Число " + srcNum + " отрицательное четное");
                } else {
                    System.out.println("Число " + srcNum +" отрицательное нечетное");
                }
            }
        } else {
            System.out.println("Число является 0");
        }
        System.out.println("");

        System.out.println("№-4 Поиск одинаковых цифр в числах");

        int num3 = 123;
        int num4 = 456;

        System.out.println("Исходные числа " + num3 + " " + num4);
        if ((num3 / 100) == (num4 / 100)) {
            System.out.println("Одинаковое число: " + num3 / 100 + " рязряд сотые" );
        }
        if ((num3 / 10) % 10 == (num4 / 10) % 10) {
            System.out.println("Одинаковое число: " + (num3 / 10) % 10 + " рязряд десятые" );
        }
        if ((num3 % 10) == (num4 % 10)) {
            System.out.println("Одинаковое число: " + num3 % 10 + " рязряд единиц" );
        } else {
            System.out.println("Нет одинаковых чисел");
        }
        System.out.println("");


        System.out.println("№-5 Определение символа по его коду");

        char ch = '\u0057';

        if ((int) ch >= 65 && (int) ch <= 90) {
        System.out.println((char) ch + " Большая буква");
        } else if ((int) ch >= 97 && (int) ch <= 122){
            System.out.println((char) ch + " Это маленькая буква");
        } else if ((int) ch >= 48 && (int) ch <= 57) {
            System.out.println((char) ch + " Это число");
        } else {
            System.out.println("Это не буква и не число");
        }
        System.out.println("");


        System.out.println("№-6 Подсчет суммы вклада и начисленных банком %");

        int account = 500_000;
        double percent1 = 0.05;
        double percent2 = 0.07;
        double percent3 = 0.10;

        System.out.println("Сумма вклада: " + account);
        if (account <= 100_000) {
            System.out.println("Начисленный процент: " + account*percent1);
            System.out.println("Итоговая сумма: " + (account + account*percent1));
        } else if (account > 100_000 && account <= 300_000){
            System.out.println("Начисленный процент: " + account*percent2);
            System.out.println("Итоговая сумма: " + (account + account*percent2));
        } else if (account > 300_000){
            System.out.println("Начисленный процент: " + account*percent3);
            System.out.println("Итоговая сумма: " + (account + account*percent3));
        }
        System.out.println("");


        System.out.println("№-7 Определение оценки по предметам");
        int historyScore = 99;
        int progScore = 63;
        int historyGrade = 1;
        int progGrade = 1;
        double overallPercent = (historyScore + progScore) / 2;
         
        System.out.println("Средний процент по предметам: " + overallPercent + "%");
        if (historyScore <= 60) {
            System.out.println("2 - История" );
            historyGrade = 2;
        } else if (historyScore > 60 && historyScore <= 73) {
            System.out.println("3 - История");
            historyGrade = 3;
        } else if (historyScore > 73 && historyScore <=91) {
            System.out.println("4 - История");
            historyGrade = 4;
        } else if (historyScore > 91) {
            System.out.println("5 - История");
            historyGrade = 5;
        }
        if (progScore <= 60) {
            System.out.println("2 - Программирование" );
            progGrade = 2;
        } else if (progScore > 60 && progScore <= 73) {
            System.out.println("3 - Программирование");
            progGrade = 3;
        } else if (historyScore > 73 && historyScore <=91) {
            System.out.println("4 - Программирование");
            progGrade = 4;
        } else if (historyScore > 91) {
            System.out.println("5 - Программирование");
            progGrade = 5;
        }
        System.out.println("Средняя оценка: " + (historyGrade + progGrade) / 2 + "\n");


        System.out.println("№-8 Расчет прибыли за год");

        int rentCost = 5_000;
        int income = 13_000;
        int costPrice = 9_000;
        int profit = (income - costPrice - rentCost) * 12;

        if (profit > 0) {
            System.out.println("Прибыль за год: " + "+" + profit + " руб.\n");
        } else {
            System.out.println(profit + " руб.\n");
        }


        System.out.println("№-9 Подсчет количества банкнот");
        int exchangeSum = 567;
        int amountHundredBanknote = 10;
        int amountDecimalBanknote = 5;
        int amountSingleBanknote = 50;
        int hundred = exchangeSum / 100;
        int decimal = (exchangeSum / 10) % 10;
        int single = exchangeSum % 10;

        if (decimal > amountDecimalBanknote) {
            single += 10 * (decimal - amountDecimalBanknote);
            decimal -= (decimal - amountDecimalBanknote);
            System.out.println("Номиналы банкнот: " + "100USD - " + hundred + 
                    "; 10USD - " + decimal + "; 1USD - " + single);
            exchangeSum = 100 * hundred + 10 * decimal + single;
            System.out.println("Сумма выдачи: " + exchangeSum);
        } else {
            System.out.println("Номиналы банкнот: " + "100USD - " + hundred + 
                    " 10USD - " + decimal + " 1USD - " + single);
            exchangeSum = 100 * hundred + 10 * decimal + single;
            System.out.println("Сумма выдачи: " + exchangeSum);
        }

    }
}