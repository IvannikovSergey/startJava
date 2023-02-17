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
            menu();
            int position = 0;
            try {
                position = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException ex) {
            }
            if (!select(position)) {
                return;
            }
        }
    }

    private static boolean select(int position) {
        String title;
        switch (position) {
            case 1 -> {
                addNewBook();
            }
            case 2 -> {
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
                }
            }
            case 4 -> {
                BOOK_SHELF.clearShelf();
            }
            case 5 -> {
                return false;
            }
            default -> {
                System.out.println("Неверное действие\nДля продолжения нажмите Enter");
                SCANNER.nextLine();
            }
        }
        return true;
    }

    private static void addNewBook() {
        String title;
        try {
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
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка ввода. Книга не добавлена");
        }
    }

    private static void printAll() {
        Book[] allBooks = BOOK_SHELF.getAll();
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n", BOOK_SHELF.getCountBooks(),
                BOOK_SHELF.getAmountEmptyShelves());
        for (Book books : allBooks) {
            String word = " ";
            System.out.println("|" + books + word.repeat(shelfLength() - books.getBookInfoLength()) + "|");
            word = "-";
            System.out.println("|--" + word.repeat(shelfLength()) + "--|");
        }
        System.out.println();
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
    }

    private static void menu() {
        String menu = """
                1. Добавить книгу <Автор><Название><Год>
                2. Удалить книгу <Название>
                3. Искать книгу <Название>
                4. Очистить шкаф
                5. Завершить
                """;
        System.out.println(menu);
    }
}