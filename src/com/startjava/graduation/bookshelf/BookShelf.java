import java.util.Arrays;

public class BookShelf {
    private int countBooks;
    private static final Book[] books = new Book[10];

    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public void delete(String title) {
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                index = i;
                break;
            }
        }
        int remainingElements = books.length - (index + 1);
        System.arraycopy(books, index + 1, books, index, remainingElements);
        countBooks--;
        System.out.println("Книга удалена");
    }

    Book find(String title) {
        for (Book book : books) {
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
        return 10 - getCountBooks();
    }
}
