public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("№-1 Вывод значений переменных на консоль");
        byte cores = 4;
        short threads = 8;
        int ram = 16048;
        long rom = 256000;
        float freqCpu = 3.5f;
        double freqGpu = 1.3d;
        char brand = 'A';
        boolean isGpu = true;

        System.out.println("Ядер:" + ' ' + cores + "\n" + 
                "Потоков:" + " " + threads + "\n" + 
                "Оперативная память:" + " " + ram + "\n" + 
                "Жесткий диск:" + " " + rom + "\n" +
                "Частота процессора:" + " " + freqCpu + "\n" +
                "Частота ядра видеокарты:" + " " + freqGpu + "\n" +
                "Класс:" + " " + brand + "\n" +
                "Дискретная видеокарта:" + " " + isGpu + "\n");

        System.out.println("№-2 Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int percent = 11;
        int sumDiscount = (penPrice + bookPrice) * percent / 100;
        int discountPrice = (penPrice + bookPrice) - sumDiscount;
        System.out.println("Скидка: " + sumDiscount + " руб.\n" +
                "Общая стоимость товаров со скидкой: " + discountPrice + " руб.\n");

        System.out.println("№-3 Вывод слова JAVA");
        System.out.println("   J     a  v     v  a");
        System.out.println("   J    a a  v   v  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ   a     a  V  a     a\n");

        System.out.println("№-4 Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;

        System.out.println("Первоначальное значение byte: " + byteMax + " Мах: " +
                ++byteMax + " Min: " + --byteMax);
        System.out.println("Первоначальное значение short: " + shortMax + " Мах: " +
                ++shortMax + " Min: " + --shortMax);
        System.out.println("Первоначальное значение int: " + intMax + " Мах: " +
                ++intMax + " Min: " + --intMax);
        System.out.println("Первоначальное значение long: " + longMax + " Мах: " +
                ++longMax + " Min: " + --longMax + "\n");

        System.out.println("№-5 Перестановка значений переменных");
        int a = 2;
        int b = 5;
        //с помощью третьей переменной
        System.out.println("C помощью третьей переменной перед перестановкой: " + "a = " + a +
                " " + "b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("C помощью третьей переменной после перестановки: " + "a = " + a +
                " " + "b = " + b);
        //с помощью арифметических операций
        System.out.println("C помощью арифметических операций перед перестановкой: " + "a = " +
                a + " " + "b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("C помощью арифметических операций после перестановки: " + "a = " + a +
                " " + "b = " + b);
        //с помощью побитовой операции ^
        System.out.println("C помощью побитовой операции перед перестановкой: " + "a = " + a +
                " " + "b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("C помощью побитовой операции после перестановки: " + "a = " + a +
                " " + "b = " + b + "\n");

        System.out.println("№-6 Вывод символов и их кодов");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';

        System.out.println(ch1 + " - " + (int) ch1 + "\n" +
                ch2 + " - " + (int) ch2 + "\n" +
                ch3 + " - " + (int) ch3 + "\n" +
                ch4 + " - " + (int) ch4 + "\n" +
                ch5 + " - " + (int) ch5 + "\n");

        System.out.println("№-7 Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        System.out.println("Число " + srcNum + " содержит: \n" + (srcNum / 100) + " сотен\n" + (srcNum / 10) % 10 +
                " десятков\n" + (srcNum % 10) + " единиц\n");

        System.out.println("№-8 Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char underscore = '_';

        System.out.println("     " + slash + "" + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + "" + underscore + "" + openParenthesis + " " +
                closeParenthesis + "" + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + "" + underscore + "" + underscore + "" +
                underscore + "" + underscore + "" +
                slash + "" + backSlash + "" + underscore + "" + underscore + "" +
                backSlash + "\n");

        System.out.println("№-9 Вывод произведения и суммы цифр числа");
        srcNum = 345;

        int hundredDigit = srcNum / 100;
        int decimalDigit = (srcNum / 10) % 10;
        int singleDigit = srcNum % 10;

        int sum = hundredDigit + decimalDigit + singleDigit;
        int mult = hundredDigit * decimalDigit * singleDigit;

        System.out.println("Сумма цифр числа " + srcNum + " равна: " + sum);
        System.out.println("Произведение цифр числа " + srcNum + " равна: " + mult + "\n");

        System.out.println("№ 10 Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds / 60) % 60;
        int seconds = totalSeconds % 60;
        System.out.println("Время " + hours + ":" + minutes + ":" + seconds);
    }
}
