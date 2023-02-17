import java.util.Scanner;

public class BookShelfTest {
    private static final BookShelf BOOK_SHELF = new BookShelf();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Шкаф пуст, Вы можете добавить в него первую книгу");
        addNewBook();
        while (true) {
            System.out.println("Для продолжения нажмите Enter");
            SCANNER.nextLine();
            printAll();
<<<<<<< HEAD
            display();
=======
            menu();
>>>>>>> fd9dd47 (исправления)
            int position = 0;
            try {
                position = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException ex) {
            }
<<<<<<< HEAD
            select(position);
        }
    }

    private static void select(int position) {
=======
            if (!select(position)) {
                return;
            }
        }
    }

    private static boolean select(int position) {
>>>>>>> fd9dd47 (исправления)
        String title;
        switch (position) {
            case 1 -> {
                addNewBook();
            }
            case 2 -> {
<<<<<<< HEAD
                try {
                    title = SCANNER.nextLine();
                    BOOK_SHELF.delete(title);
                } catch (NullPointerException ex) {
                    System.out.println("Ошибка удаления книги");
                }
            }
            case 3 -> {
                try {
                    title = SCANNER.nextLine();
                    System.out.println(BOOK_SHELF.find(title));
                    System.out.println("Книга найдена");
                } catch (NullPointerException ex) {
                    System.out.println("Ошибка поиска книги");
=======
                if (BOOK_SHELF.getCountBooks() != 0) {
                    title = SCANNER.nextLine();
                    BOOK_SHELF.delete(title);
                } else {
                    System.out.println("Шкаф пуст");
                }

            }
            case 3 -> {
                title = SCANNER.nextLine();
                if (BOOK_SHELF.find(title) != null) {
                    System.out.println("Книга найдена \n" + BOOK_SHELF.find(title));
                } else {
                    System.out.println("Книга не найдена");
>>>>>>> fd9dd47 (исправления)
                }
            }
            case 4 -> {
                BOOK_SHELF.clearShelf();
            }
            case 5 -> {
<<<<<<< HEAD
                return;
=======
                return false;
>>>>>>> fd9dd47 (исправления)
            }
            default -> {
                System.out.println("Неверное действие\nДля продолжения нажмите Enter");
                SCANNER.nextLine();
            }
        }
<<<<<<< HEAD
=======
        return true;
>>>>>>> fd9dd47 (исправления)
    }

    private static void addNewBook() {
        String title;
        try {
<<<<<<< HEAD
            String author = SCANNER.nextLine();
            title = SCANNER.nextLine();
            int date = Integer.parseInt(SCANNER.nextLine());
            Book book = new Book(author, title, date);
            BOOK_SHELF.add(book);
            System.out.println("Книга добавлена");
=======
            if (BOOK_SHELF.getAmountEmptyShelves() != 0) {
                String author = SCANNER.nextLine();
                title = SCANNER.nextLine();
                String date = SCANNER.nextLine();
                int shelfLength = author.length() + title.length() + date.length();
                Book book = new Book(author, title, Integer.parseInt(date), shelfLength);
                BOOK_SHELF.add(book);
                System.out.println("Книга добавлена");
            } else {
                System.out.println("В шкафу нет места");
            }
>>>>>>> fd9dd47 (исправления)
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка ввода. Книга не добавлена");
        }
    }

    private static void printAll() {
        Book[] allBooks = BOOK_SHELF.getAll();
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n", BOOK_SHELF.getCountBooks(),
=======
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n",
            BOOK_SHELF.getCountBooks(),
>>>>>>> fd9dd47 (исправления)
=======
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n", BOOK_SHELF.getCountBooks(),
>>>>>>> 4ad4ba3 (исправления)
                BOOK_SHELF.getAmountEmptyShelves());
        for (Book books : allBooks) {
            String word = " ";
            System.out.println("|" + books + word.repeat(shelfLength() - books.getBookInfoLength()) + "|");
            word = "-";
            System.out.println("|--" + word.repeat(shelfLength()) + "--|");
        }
        System.out.println();
<<<<<<< HEAD
=======
    }

    private static int shelfLength() {
        int maxLength = 0;
        for (int i = 0; i < BOOK_SHELF.getAll().length; i++) {
            int bookInfoLength = BOOK_SHELF.getAll()[i].getBookInfoLength();
            if (bookInfoLength > maxLength) {
                maxLength = bookInfoLength;
            }
        }
        return maxLength;
>>>>>>> fd9dd47 (исправления)
    }

    private static void display() {
        String display = """
                1. Добавить книгу <Автор><Название><Год>
                2. Удалить книгу <Название>
                3. Искать книгу <Название>
                4. Очистить шкаф
                5. Завершить
                """;
        System.out.println(display);
    }
}