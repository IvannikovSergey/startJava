package com.startjava.Lesson_2_3_4.array;

import static java.lang.Math.random;

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
        int i = 0;
        for (i = 0; i < length; i++) {
            intArray[i] = i;
            if (intArray[i] == 0 || intArray[i] == 9) {
                continue;
            }
            multDigits *= intArray[i];
            System.out.print(intArray[i] + (intArray[i] != 8 ? " * " : " = " + multDigits));
        }
        System.out.print("\n" + intArray[0] + " " + intArray[length - 1] + "\n");

        System.out.println("\n№ - 3 Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        int numberZeroCells = 0;
        for (i = 0; i < length; i++) {
            doubleArray[i] = random();
        }
        printDoubleArray(doubleArray);
        double centerNumber = doubleArray[length / 2];
        for (i = 0; i < length; i++) {
<<<<<<< HEAD
            if (doubleArray[i] > middleNumber) {
                doubleArray[i] = 0;
=======
            if (doubleArray[i] > centerNumber) {
                doubleArray[i] = centerNumber;
>>>>>>> parent of 771994b (исправления)
                numberZeroCells++;
            }
        }
        printDoubleArray(doubleArray);
        System.out.println("\nКоличество обнуленных ячеек: " + numberZeroCells);

        System.out.println("\n№ - 4 Вывод элементов массива лесенкой в обратном порядке");
        char[] engLettersArray = new char[26];
        length = engLettersArray.length;
        for(i = 0; i < length; i++) {
            engLettersArray[i] = (char) ('Z' - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(engLettersArray[j]);
            }
            System.out.println();
        }

        System.out.println("\n№ - 5 Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (i = 0; i < length; i++) {
            intArray[i] = 60 + (int) (Math.random() * 40);
            for (int j = 0; j < i; j++) {
                if (intArray[j] == intArray[i]) {
                    i--;
                    break;
                }
            }
        }
        sorting(intArray);

        System.out.println("\n№ - 6 Сдвиг элементов массива");
        String[] srcArray = {"   ", "AA", "", "BBB", "CC", "D", "   ", "E", "FF", "G", ""};
        int numberFullElements = 0;
        for (String elem : srcArray) {
            if (!elem.isBlank()) {
                numberFullElements++;
            }
        }
        System.out.println("Кол-во не пустых элементов: " + numberFullElements);
        String[] destArray = new String[numberFullElements];
        int n = 0;
        for (i = 0; i < srcArray.length; i++) {
            int sequenceLength = 0;
            int j = i;
            while (!srcArray[j].isBlank()) {
                sequenceLength++;
                j++;
            }
            if (sequenceLength != 0) {
                System.arraycopy(srcArray, i, destArray, n++, sequenceLength);
            }
        }
        printStringArray(srcArray);
        printStringArray(destArray);
    }

    public static void sorting(int[] array) {
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
            System.out.print(i == array.length - 1 ? array[i] : array[i] + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");
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
