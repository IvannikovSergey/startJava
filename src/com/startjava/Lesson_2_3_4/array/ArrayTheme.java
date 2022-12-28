package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№ - 1 Реверс значений массива");
        int[] intArr = {2, 7, 5, 6, 3, 1, 4};
        int length = intArr.length;
        for (int numbers : intArr) {
            System.out.print(numbers + " ");
        }
        System.out.println();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();

        System.out.println("\n№ - 2 Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        int result = 1;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
            if (intArr[i] == 0 || intArr[i] == 9) {
                continue;
            }
            result *= intArr[i];
            System.out.print(intArr[i] == 8 ? intArr[i] + " = " + result : intArr[i] + " * ");
        }
        System.out.println();
        System.out.print(intArr[0] + " " + intArr[length - 1]);
        System.out.println();

        System.out.println("\n№ - 3 Удаление элементов массива");
        double[] doubleArr = new double[15];
        int halfArrIndex = doubleArr.length;
        double[] doubleArrCopy = new double[halfArrIndex];
        int counter = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
            doubleArrCopy[i] = doubleArr[i];
            System.out.printf("%1.3f ", doubleArr[i]);
            if (i == halfArrIndex / 2) {
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArrCopy.length; i++) {
            double centerNumber = doubleArr[halfArrIndex / 2];
            if (doubleArrCopy[i] > centerNumber) {
                doubleArrCopy[i] = centerNumber;
                counter++;
            }
            System.out.printf("%.3f ", doubleArrCopy[i]);
            if (i == doubleArrCopy.length / 2) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество замененных ячеек: " + counter);

        System.out.println("\n№ - 4 Вывод элементов массива лесенкой в обратном порядке");
        char[] charsArr = new char[26];
        int i = 0;
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            charsArr[i++] = ch;
        }
        for (i = 0; i < charsArr.length; i++) {
            System.out.print(charsArr[0]);
            for (int j = 1; j <= i; j++) {
                System.out.print(charsArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n№ - 5 Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for (i = 0; i < length; i++) {
            int randomNumber = 60 + (int) (Math.random() * 40);
            intArr[i] = randomNumber;
        }
        for (i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (intArr[i] == intArr[j]) {
                    int newRandomNumber = 60 + (int) (Math.random() * 40);
                    intArr[i] = newRandomNumber;
                }
            }
        }
        int[] arrayCopy = new ArrayTheme().sorting(intArr);
        for (i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("\n№ - 6 Сдвиг элементов массива");
        String[] srcArr = {"   ", "AA", "", "BBB", "CC", "D", "   ", "E", "FF", "G", ""};
        int fullElements = 0;
        for (String elem : srcArr) {
            if (!elem.isBlank()) {
                fullElements++;
            }
        }
        System.out.println("Кол-во не пустых элементов: " + fullElements);
        String[] destArr = new String[fullElements];
        int n = 0;
        for (i = 0; i < srcArr.length; i++) {
            int sequenceLength = 0;
            int j = i;
            while (!srcArr[j].isBlank()) {
                sequenceLength++;
                j++;
            }
            if (sequenceLength != 0) {
                System.arraycopy(srcArr, i, destArr, n++, sequenceLength);
            }
        }
        printStringArray(srcArr);
        printStringArray(destArr);
    }

    public int[] sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printIntArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void printStringArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}