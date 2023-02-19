import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private static final int SHELF_CAPACITY = 10;
    private final Book[] books = new Book[SHELF_CAPACITY];

    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public void delete(String title) {
        countBooks--;
        for (int i = 0; i < countBooks + 1; i++) {
            if (books[i].getTitle().equals(title)) {
                System.arraycopy(books, i + 1, books, i, countBooks);
                System.out.println("Книга удалена");
                return;
            }
        }
        System.out.println("Нет такой книги для удаления");
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void clearShelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        System.out.println("Шкаф очищен");
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getAmountEmptyShelves() {
        return SHELF_CAPACITY - getCountBooks();
    }
}