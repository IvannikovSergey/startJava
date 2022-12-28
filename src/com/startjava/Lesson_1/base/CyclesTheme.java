package com.startjava.Lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("№-1 Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= 21);
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
        System.out.println();

        System.out.println("\n№-3 Вывод реверсивного числа и суммы его цифр");
        int someNum = 1234;
        int sum = 0;
        while (someNum > 0) {
            int lastDigit = someNum % 10;
            sum += lastDigit;
            System.out.print(lastDigit);
            someNum /= 10;
        }
        System.out.println(" Сумма цифр: " + sum);

        System.out.println("\n№-4 Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i += 2) {
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

        System.out.println("\n№-5 Проверка количества двоек на четность");
        someNum = 32425922;
        int countTwos = 0;
        int copySomeNum = someNum;

        while(copySomeNum > 0) {
            if (copySomeNum % 10 == 2) {
                countTwos++;
            }
            copySomeNum /= 10;
        }
        String isSumEven = "четное";
        if (countTwos % 2 != 0) {
            isSumEven = "нечетное";
        }
        System.out.println("Число " + someNum + " содержит " + isSumEven + " количество двоек");

        System.out.println("\n№-6 Отображение фигур в консоли");
        System.out.println("Для прямоугольника только for");
        for (int rows = 0; rows < 5; rows++) {
            for (int columns = 0; columns < 10; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nДля прямоугольного треугольника только while");
        int columns = 5;

        while (columns >= 1) {
            int rows = 1;
            while (rows <= columns) {
                System.out.print("#");
                rows++;
            }
            System.out.println();
            columns--;
        }

        System.out.println("\nДля второго треугольника только do-while");
        columns = 3;
        int rows = 1;
        counter = 1;
        do {
            System.out.print("$");
            if (rows <= counter && rows < columns) {
                System.out.println();
                rows++;
                counter = 0;
            }
            if (columns == counter) {
                System.out.println();
                columns--;
                counter = 0;
            }
            counter++;
        } while (counter <= columns);

        System.out.println("\n№-7 Отображение ASCII-символов");
        System.out.println("DEC  CHAR");
        for (int i = 1; i <= 47; i+=2) {
            System.out.printf("%3d%6c%n", i, i);
        }
        for (int i = 98; i <= 122; i+=2) {
            System.out.printf("%3d%6c%n", i, i);
        }

        System.out.println("\n№-8 Проверка, является ли число палиндромом");
        someNum = 1234321;
        int reverseNum = 0;
        copySomeNum = someNum;
        while (copySomeNum > 0) {
            reverseNum = reverseNum * 10 + copySomeNum % 10;
            copySomeNum /= 10;
        }
        if (reverseNum == someNum) {
            System.out.println("Число: " + reverseNum + " палиндром");
        } else {
            System.out.println("Число: " + reverseNum + " не палиндром");
        }

        System.out.println("\n№-9 Определение, является ли число счастливым");
        someNum = 123123;
        copySomeNum = someNum;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int digitCounter = 0;

        while (copySomeNum > 0) {
            if (digitCounter >= 3) {
                sumLeftHalf += copySomeNum % 10;
            } else {
                sumRightHalf += copySomeNum % 10;
            }
            copySomeNum /= 10;
            digitCounter++;
        }
        String luckyNum = "Счастливое";
        if (sumLeftHalf != sumRightHalf) {
            luckyNum = "Не счастливое";
        }
        System.out.println("Сумма цифр " + someNum / 1000 + " равна: " + sumLeftHalf);
        System.out.println("Сумма цифр " + someNum % 1000 + " равна: " + sumRightHalf);
        System.out.println("Число: " + luckyNum);

        System.out.println("\n№-10 Вывод таблицы умножения Пифагора");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n---|-------------------------\n");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
