package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№ - 1 Реверс значений массива");
        int[] intArray = {2, 7, 5, 6, 3, 1, 4};
        int length = intArray.length;
        printIntArray(intArray);
        for (int i = 0; i < length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[length - i - 1];
            intArray[length - i - 1] = temp;
        }
        printIntArray(intArray);

        System.out.println("\n№ - 2 Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        int multDigits = 1;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
            if (intArray[i] == 0 || intArray[i] == 9) {
                continue;
            }
            multDigits *= intArray[i];
            System.out.print(intArray[i] + (i != intArray[length - 2] ? " * " : " = " + multDigits));
        }

        System.out.print("\n" + intArray[0] + " " + intArray[length - 1] + "\n");

        System.out.println("\n№ - 3 Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        printDoubleArray(doubleArray);
        double middleNumber = doubleArray[length / 2];
        int numberZeroCells = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleNumber) {
                doubleArray[i] = 0;
                numberZeroCells++;
            }
        }
        printDoubleArray(doubleArray);
        System.out.println("\nКоличество обнуленных ячеек: " + numberZeroCells);

        System.out.println("\n№ - 4 Вывод элементов массива лесенкой в обратном порядке");
        char[] engAlphabet = new char[26];
        length = engAlphabet.length;
        for (int i = 0; i < length; i++) {
            engAlphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(engAlphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n№ - 5 Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            int randomNumber = 60 + (int) (Math.random() * 40);
            if (i == 0) {
                intArray[0] = randomNumber;
            }
            for (int j = 0; j < i; j++) {
                if (intArray[j] == randomNumber) {
                    i--;
                    break;
                }
                intArray[i] = randomNumber;
            }
        }
        sort(intArray);

        System.out.println("\n№ - 6 Сдвиг элементов массива");
        String[] srcArray = {"   ", "AA", "", "BBB", "CC", "D", "   ", "E", "FF", "G", ""};
        length = srcArray.length;
        int numberNotBlank = 0;
        for (String item : srcArray) {
            if (!item.isBlank()) {
                numberNotBlank++;
            }
        }
        System.out.println("Кол-во не пустых элементов: " + numberNotBlank);
        String[] destArray = new String[numberNotBlank];
        int destPos = 0;
        for (int i = 0; i < srcArray.length; i++) {
            int sequenceLength = 0;
            int j = i;
            while (!srcArray[j].isBlank()) {
                sequenceLength++;
                j++;
            }
            if (sequenceLength != 0) {
                System.arraycopy(srcArray, i, destArray, destPos++, sequenceLength);
            }
        }
        printStringArray(srcArray);
        printStringArray(destArray);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }

    public static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
