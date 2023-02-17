import java.util.Arrays;

public class BookShelf {
    private int countBooks;
<<<<<<< HEAD
    private static final Book[] books = new Book[10];

=======
    private final int SHELF_CAPACITY = 10;
    private final Book[] books = new Book[SHELF_CAPACITY];


>>>>>>> fd9dd47 (исправления)
    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public void delete(String title) {
        int index = 0;
        int length = getAll().length;
        for (int i = 0; i < length; i++) {
            if (books[i].getTitle().equals(title)) {
                index = i;
                int remainingElements = length - (index + 1);
                System.arraycopy(books, index + 1, books, index, remainingElements);
                countBooks--;
                System.out.println("Книга удалена");
                return;
            }
        }
<<<<<<< HEAD
        int remainingElements = books.length - (index + 1);
        System.arraycopy(books, index + 1, books, index, remainingElements);
        countBooks--;
        System.out.println("Книга удалена");
    }

    Book find(String title) {
        for (Book book : books) {
=======
        System.out.println("Нет такой книги для удаления");
    }


    Book find(String title) {
        for (Book book : getAll()) {
>>>>>>> fd9dd47 (исправления)
            if (book.getTitle().equals(title)) {
                return book;
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
<<<<<<< HEAD
        return 10 - getCountBooks();
=======
        return SHELF_CAPACITY - getCountBooks();
>>>>>>> fd9dd47 (исправления)
    }
}
