import java.util.Scanner;

public class BookShelfTest {
    public static BookShelf bookShelf = new BookShelf();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Шкаф пуст, Вы можете добавить в него первую книгу");
        try {
            init();
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка ввода. Книга не добавлена");
        }

        while (true) {
            printAll();
            System.out.println();
            menu();
            System.out.println("Выберите действие:");
            String title;
            int position = 0;
            try {
                position = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
            }
            switch (position) {
                case 1 -> {
                    try {
                        init();
                    } catch (NumberFormatException ex) {
                        System.out.println("Ошибка ввода. Книга не добавлена");
                    }
                    printAll();
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 2 -> {
                    try {
                        title = scanner.nextLine();
                        bookShelf.deleteBook(title);
                    } catch (NullPointerException ex) {
                        System.out.println("Ошибка удаления книги");
                    }
                    printAll();
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 3 -> {
                    try {
                        title = scanner.nextLine();
                        System.out.println(bookShelf.findBook(title));
                        System.out.println("Книга найдена");
                    } catch (NullPointerException ex) {
                        System.out.println("Ошибка поиска книги");
                    }
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 4 -> {
                    bookShelf.clearShelf();
                    printAll();
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 5 -> {
                    return;
                }
                default -> {
                    System.out.println("Неверное действие\nДля продолжения нажмите Enter");
                    scanner.nextLine();
                }
            }
        }
    }

    private static void init() {
        Book book = new Book();
        String author = scanner.nextLine();
        String title = scanner.nextLine();
        int date = Integer.parseInt(scanner.nextLine());
        book.setAuthor(author);
        book.setTitle(title);
        book.setPublishYear(date);
        bookShelf.addBook(book);
        System.out.println("Книга добавлена");
        bookShelf.setSize(bookShelf.getAmountOfBooks() + 1);
    }

    private static void printAll() {
        Book[] allBooks = bookShelf.getAllBooks();
        System.out.printf("В шкафу %s книг/и и свободно %s полок/полки%n", bookShelf.getAmountOfBooks(),
                bookShelf.getAmountEmptyShelves());
        for (Book books : allBooks) {
            System.out.printf("%s%-25.25s %-30.30s %-4.4s %s %n", "|", books.getAuthor(),
                    books.getTitle(), books.getPublishYear(), "|");
        }
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