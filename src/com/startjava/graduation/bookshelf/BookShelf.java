import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private static final int SHELF_CAPACITY = 10;
    private final Book[] books = new Book[SHELF_CAPACITY];
    private int bookMaxLengthInfo;

    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        calculateBookMaxLengthInfo(book);
        countBooks++;
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].toString().length();
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                if(length == bookMaxLengthInfo) {
                    calculateBookMaxLengthInfo(books[i]);
                }
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

    public int getBookMaxLengthInfo() {
        return bookMaxLengthInfo;
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

    public void calculateBookMaxLengthInfo(Book book) {
        int length = book.toString().length();
        if (length > bookMaxLengthInfo) {
            bookMaxLengthInfo = length;
        }
    }
}