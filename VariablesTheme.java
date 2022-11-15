public class VariablesTheme {

    public static void main(String[] args) {
        // ЗАДАЧА № 1
        byte cores = 4;
        short threads = 8;
        int RAM = 16048;
        long ROM = 256000;
        float freqCPU = 3.5f;
        double freqGPU = 1.3d;
        char brand = 'A';
        boolean isGPU = true;

        System.out.println("№-1 Вывод значений переменных на консоль");
        System.out.print("Ядер:" + ' ' + cores + "\n" + 
                "Потоков:" + " " + threads + "\n" + 
                "Оперативная память:" + " " + RAM + "\n" + 
                "Жесткий диск:" + " " + ROM + "\n" +
                "Частота процессора:" + " " + freqCPU + "\n" +
                "Частота ядра видеокарты:" + " " + freqGPU + "\n" +
                "Класс:" + " " + brand + "\n" +
                "Дискретная видеокарта:" + " " + isGPU + "\n");
        System.out.println(" ");

        //ЗАДАЧА № 2
        System.out.println("№-2 Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int percent = 11;
        int discont = (penCost + bookCost) * percent/100;
        int totalSum = (penCost + bookCost) - discont;
        System.out.print("Скидка: " + discont + " руб.\n" +
                "Общая стоимость товаров со скидкой: " + totalSum + " руб.\n");
        System.out.println(" ");

        //ЗАДАЧА № 3
        System.out.println("№-3 Вывод слова JAVA");
        System.out.print("   " + "J" + "     " + "a" + "  " + "v" + "     " + "v" + "  " + "a\n");
        System.out.print("   " + "J" + "    " + "a" + " " + "a" + "  " + "v" + "   " + "v" +
                "  " + "a" + " " + "a\n");
        System.out.print("J" + "  " + "J" + "   " + "aaaaa" + "  " + "V" + " " + "V" +
                "  " + "aaaaa\n");
        System.out.println(" " + "JJ" + "   " + "a" + "     " + "a" + "  " + "V" + "  " +
                "a" + "     " + "a\n");

        // ЗАДАЧА № 4
        System.out.println("№-4 Вывод min и max значений целых числовых типов");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;

        int num1Max = num1 + 1;
        int num1Min = num1 - 1;
        int num2Max = num2 + 1;
        int num2Min = num2 - 1;
        int num3Max = num3 + 1;
        int num3Min = num3 - 1;
        long num4Max = num4 + 1;
        long num4Min = num4 - 1;

        System.out.println("Первоначальное значение byte: " + num1 + " Мах: " +
                num1Max + " Min: " + num1Min);
        System.out.println("Первоначальное значение short: " + num2 + " Мах: " +
                num2Max + " Min: " + num2Min);
        System.out.println("Первоначальное значение int: " + num3 + " Мах: " +
                num3Max + " Min: " + num3Min);
        System.out.println("Первоначальное значение long: " + num4 + " Мах: " +
                num4Max + " Min: " + num4Min + "\n");

        //ЗАДАЧА № 5
        System.out.println("№-5 Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        //с помощью третьей переменной
        System.out.println("C помощью третьей переменной перед перестановкой: " + "a = " + a +
                " " + "b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("C помощью третьей переменной после перестановки: " + "a = " + a +
                " " + "b = " + b);
        //с помощью арифметических операций
        System.out.println("C помощью арифметических операций перед перестановкой: " + "a = " +
                a + " " + "b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("C помощью арифметических операций после перестановки: " + "a = " + a +
                " " + "b = " + b);
        //с помощью побитовой операции ^
        System.out.println("C помощью побитовой операции перед перестановкой: " + "a = " + a +
                " " + "b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("C помощью побитовой операции после перестановки: " + "a = " + a +
                " " + "b = " + b + "\n");

        //ЗАДАЧА №6
        System.out.println("№-6 Вывод символов и их кодов");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';

        System.out.println(ch1 + " - " + (int)ch1 + "\n" +
                ch2 + " - " + (int)ch2 + "\n" +
                ch3 + " - " + (int)ch3 + "\n" +
                ch4 + " - " + (int)ch4 + "\n" +
                ch5 + " - " + (int)ch5 + "\n");

        //ЗАДАЧА №7
        System.out.println("№-7 Вывод количества сотен, десятков и единиц числа");
        int N = 123;
        System.out.println("Число " + N + " содержит: \n" + (N / 100) + " сотен\n" + (N / 10) % 10 +
                " десятков\n" + (N % 10) + " единиц\n");

        //Задача №8
        System.out.println("№-8 Вывод в консоль ASCII-арт Дюка");
        char c1 = 47; // '/'
        char c2 = 92; // '\'
        char c3 = 40; // '('
        char c4 = 41; // ')'
        char c5 = 95; // '_'

        System.out.print("     " + c1 + "" + c2 + "\n");
        System.out.print("    " + c1 + "  " + c2 + "\n");
        System.out.print("   " + c1 + "" + c5 + "" + c3 + " " + c4 + "" + c2 + "\n");
        System.out.print("  " + c1 + "      " + c2 + "\n");
        System.out.println(" " + c1 + "" + c5 + "" + c5 + "" + c5 + "" + c5 + "" +
                c1 + "" + c2 + "" + c5 + "" + c5 + "" + c2 + "\n");

        //ЗАДАЧА №9
        System.out.println("№-9 Вывод произведения и суммы цифр числа");
        int num = 345;

        int num100 = num / 100;
        int num10 = (num / 10) % 10;
        int num1_1 = num % 10;

        int sum = num100 + num10 + num1_1;
        int mult = num100 * num10 * num1_1;

        System.out.println("Сумма цифр числа " + num + " равна: " + sum);
        System.out.println("Произведение цифр числа " + num + " равна: " + mult + "\n");

        // ЗАДАЧА №10
        System.out.println("№ 10 Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds - (hours * 3600)) / 60;
        int seconds = (totalSeconds - (hours * 3600)) - minutes * 60;
        System.out.println("Время " + hours + ":" + minutes + ":" + seconds);
    }
}