import java.util.Scanner;

public class BookShelfTest {
    private static final BookShelf bookShelf = new BookShelf();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Шкаф пуст, Вы можете добавить в него первую книгу");
        addNewBook();
        while (true) {
            System.out.println("Для продолжения нажмите Enter");
            scanner.nextLine();
            printAll();
            displayMenu();
            int position = 0;
            try {
                position = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                ex.getMessage();
            }
            if (!selectAction(position)) {
                return;
            }
        }
    }

    private static void addNewBook() {
        try {
            if (bookShelf.getAmountEmptyShelves() != 0) {
                String author = scanner.nextLine();
                String title = scanner.nextLine();
                String publishYear = scanner.nextLine();
                Book book = new Book(author, title, publishYear);
                bookShelf.add(book);
                System.out.println("Книга добавлена");
            } else {
                System.out.println("В шкафу нет места");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка ввода. Книга не добавлена");
        }
    }

    private static void printAll() {
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n",
         bookShelf.getCountBooks(),bookShelf.getAmountEmptyShelves());
        int maxLengthInfo = bookShelf.getBookMaxLengthInfo();
        for (Book book : bookShelf.getAll()) {
            System.out.println("|" + book + " ".repeat(maxLengthInfo - book.getBookInfoLength()) +
             "|");
            System.out.println("|" + "-".repeat(maxLengthInfo) + "|");
        }
        System.out.println();
    }

    private static void displayMenu() {
        System.out.println("""
                1. Добавить книгу <Автор><Название><Год>
                2. Удалить книгу <Название>
                3. Искать книгу <Название>
                4. Очистить шкаф
                5. Завершить
                """);
    }

    private static boolean selectAction(int position) {
        String title;
        switch (position) {
            case 1 -> addNewBook();
            case 2 -> {
                if (bookShelf.getCountBooks() != 0) {
                    title = scanner.nextLine();
                    bookShelf.delete(title);
                } else {
                    System.out.println("Шкаф пуст");
                }
            }
            case 3 -> {
                title = scanner.nextLine();
                if (bookShelf.find(title) != null) {
                    System.out.println("Книга найдена \n" + bookShelf.find(title));
                } else {
                    System.out.println("Книга не найдена");
                }
            }
            case 4 -> bookShelf.clearShelf();
            case 5 -> {
                return false;
            }
            default -> {
                System.out.println("Неверное действие\nДля продолжения нажмите Enter");
                scanner.nextLine();
            }
        }
        return true;
    }
}