public class Book {
    private final String author;
    private final String title;
    private final String publishYear;
    private int bookInfoLength;

    public Book(String title, String author, String publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.bookInfoLength = toString().length();
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