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
            display();
            int position = 0;
            try {
                position = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException ex) {
            }
            select(position);
        }
    }

    private static void select(int position) {
        String title;
        switch (position) {
            case 1 -> {
                addNewBook();
            }
            case 2 -> {
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
                }
            }
            case 4 -> {
                BOOK_SHELF.clearShelf();
            }
            case 5 -> {
                return;
            }
            default -> {
                System.out.println("Неверное действие\nДля продолжения нажмите Enter");
                SCANNER.nextLine();
            }
        }
    }

    private static void addNewBook() {
        String title;
        try {
            String author = SCANNER.nextLine();
            title = SCANNER.nextLine();
            int date = Integer.parseInt(SCANNER.nextLine());
            Book book = new Book(author, title, date);
            BOOK_SHELF.add(book);
            System.out.println("Книга добавлена");
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка ввода. Книга не добавлена");
        }
    }

    private static void printAll() {
        Book[] allBooks = BOOK_SHELF.getAll();
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n", BOOK_SHELF.getCountBooks(),
                BOOK_SHELF.getAmountEmptyShelves());
        for (Book books : allBooks) {
            System.out.printf("%s%-25.25s %-30.30s %-4.4s %s %n", "|", books.getAuthor(),
                    books.getTitle(), books.getPublishYear(), "|");
        }
        System.out.println();
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