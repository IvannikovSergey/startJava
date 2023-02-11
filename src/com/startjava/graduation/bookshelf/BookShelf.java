import java.util.Arrays;

public class BookShelf {
    private int size;
    private Book[] books = new Book[10];

    public void setSize(int size) {
        this.size = size;
    }

    public void addBook(Book book) {
        books[size] = book;
    }

    public void deleteBook(String title) {
        Book[] destArr = new Book[books.length];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                index = i;
                break;
            }
        }
        int remainingElements = books.length - (index + 1);
        System.arraycopy(books, 0, destArr, 0, index);
        System.arraycopy(books, index + 1, destArr, index, remainingElements);
        books = destArr;
        setSize(getAmountOfBooks() - 1);
        System.out.println("Книга удалена");
    }

    Book findBook(String title) throws NullPointerException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void clearShelf() {
        Arrays.fill(books, 0, size, null);
        size = 0;
        System.out.println("Шкаф очищен");
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, size);
    }

    public int getAmountOfBooks() {
        return size;
    }

    public int getAmountEmptyShelves() {
        return 10 - getAmountOfBooks();
    }
}
