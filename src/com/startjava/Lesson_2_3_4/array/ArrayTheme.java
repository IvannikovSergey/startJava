package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("№ - 1 Реверс значений массива");
        int[] intArr = {2, 7, 5, 6, 3, 1, 4};
        int length = intArr.length;
        int[] reversIntArr = new int[length];
        for (int i = 0; i < length; i++) {
            reversIntArr[length - 1 - i] = intArr[i];
        }
        printIntArray(intArr);
        printIntArray(reversIntArr);

        System.out.println("\n№ - 2 Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        int multResult = 1;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
            if (intArr[i] == 0 || intArr[i] == 9) {
                continue;
            }
            multResult *= intArr[i];
            String sign = intArr[i] != 8 ? " * " : " = " + multResult;
            System.out.print(intArr[i] + sign);
        }
        System.out.print("\n" + intArr[0] + " " + intArr[length - 1] + "\n");

        System.out.println("\n№ - 3 Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        int changedCellCounter = 0;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArray(doubleArr);
        for (int i = 0; i < length; i++) {
            double centerNumber = doubleArr[length / 2];
            if (doubleArr[i] > centerNumber) {
                doubleArr[i] = centerNumber;
                changedCellCounter++;
            }
        }
        printDoubleArray(doubleArr);
        System.out.println("\nКоличество замененных ячеек: " + changedCellCounter);

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
//        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f ", arr[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}