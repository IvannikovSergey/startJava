public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private int bookInfoLength;

    public Book(String title, String author, int publishYear, int bookInfoLength) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.bookInfoLength = bookInfoLength;
    }

    public String getTitle() {
        return title;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}