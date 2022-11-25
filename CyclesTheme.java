public class CycleTheme {
    public static void main(String[] args) {
        System.out.println("№-1 Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (startNum % 2 == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
            startNum++;
        } while (startNum <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n№-2 Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        for (int i = min + 1; i < max; i++) {
            System.out.printf("%2d", i);
        }

        System.out.println("\n №-3 Вывод реверсивного числа и суммы его цифр");
        int someNum = 1234;
        int sum = 0;
        int reverseNum = 0;
        while (someNum > 0) {
            reverseNum = reverseNum * 10 + someNum % 10;
            sum += someNum % 10;
            someNum /= 10;
        }
        System.out.println("Исходное число в обратном порядке: " + reverseNum);
        System.out.println("Сумма цифр: " + sum);

        System.out.println("\n №-4 Вывод чисел на консоль в несколько строк");
        min = 1;
        max = 24;

        for (int i = min; i < max; i += 2) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%4d", i);
                } else {
                    System.out.printf("%4d", 0);
                }
                i += 2;
            }
            i -= 2;
            System.out.println();
        }

        System.out.println("\n №-5 Проверка количества двоек на четность");
        someNum = 3242592;
        sum = 0;
        int resourseNum = someNum;
        String isSumEven = "четное";

        while(resourseNum > 0) {
            if (resourseNum % 10 == 2) {
                sum++;
            }
            resourseNum /= 10;
        }
        if (sum % 2 != 0) {
            isSumEven = "нечетное";
        }
        System.out.println("Число " + someNum + " содержит " + isSumEven + " количество двоек");

        System.out.println("\n №-6 Отображение фигур в консоли");
        System.out.println("Для прямоугольника только for");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nДля прямоугольного треугольника только while");
        int scope = 5;
        while (scope >= 1) {
            int j = 1;
            while (j <= scope) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            scope--;
        }

        System.out.println("\nДля второго треугольника только do-while");
        do {
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("$");
                }
                System.out.println("");
            }
            for (int i = 2; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("$");
                }
                System.out.println("");
            }
            scope--;
        } while (scope >= 2);

        System.out.println("\n№-7 Отображение ASCII-символов");
        System.out.println("DEC  CHAR");
        for (int i = 1; i <= 47; i+=2) {
            System.out.printf("%3d", i);
            System.out.printf("%6c%n", (char) i);
        }
        for (int i = 98; i <= 122; i+=2) {
            System.out.printf("%3d", i);
            System.out.printf("%6c%n", (char) i);
        }

        System.out.println("\n №-8 Проверка, является ли число палиндромом");
        someNum = 1234321;
        reverseNum = 0;
        int tempNum = someNum;
        while (tempNum > 0) {
            reverseNum = reverseNum * 10 + tempNum % 10;
            tempNum /= 10;
        }
        if (reverseNum == someNum) {
            System.out.println("Число: " + reverseNum + " палиндром");
        } else {
            System.out.println("Число: " + reverseNum + " не палиндром");
        }

        System.out.println("\n№-9 Определение, является ли число счастливым");
        someNum = 123126;
        int sumAbc = 0;
        int sumDef = 0;
        String luckyNum = "Счастливое";

        int tempAbc = someNum / 1000;
        int tempDef = someNum % 1000;

        int abc = tempAbc;
        int def = tempDef;

        while (abc > 0) {
            sumAbc += abc % 10;
            abc /= 10;
        }
        while (def > 0) {
            sumDef += def % 10;
            def /= 10;
        }
        if (sumAbc != sumDef) {
            luckyNum = "Не счастливое";
        }
        System.out.println("Сумма цифр " + tempAbc + " равна: " + sumAbc);
        System.out.println("Сумма цифр " + tempDef + " равна: " + sumDef);
        System.out.println("Число: " + luckyNum);



        System.out.println("\n№-10 Вывод таблицы умножения Пифагора");

        System.out.printf("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.printf("\n---|-------------------------\n");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}